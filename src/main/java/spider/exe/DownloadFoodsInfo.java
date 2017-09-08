package spider.exe;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import spider.dao.IFoodCategoryDAO;
import spider.dao.IFoodMeasurementDAO;
import spider.dao.IFoodsDAO;
import spider.db.DBAccess;
import spider.entity.FoodCategory;
import spider.entity.FoodCategoryExample;
import spider.entity.FoodMeasurement;
import spider.entity.Foods;
import spider.utils.Tools;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 从<a href='https://www.boohee.com' style='color:red;'>薄荷网</a>下载食物热量数据并存放到数据库中.
 * @author yanweijia
 * @date 2017/09/08
 * @email happyboyywj@163.com
 */
public class DownloadFoodsInfo {
    private static final Logger log = LogManager.getLogger(DownloadFoodsInfo.class);
    private static final String BASE_URL = "http://www.boohee.com/";
    private static final String IMAGE_DIR = "D:/images/";

    public static void main(String[] args) {
        SqlSession sqlSession = DBAccess.getSqlSession();
        try {
            for (int i = 1; i <= 10; i++) {
                downloadCategory(sqlSession, "" + i);
            }
            downloadCategory(sqlSession, "view_menu");
        }catch(Exception e){
            e.printStackTrace();
        }
        sqlSession.commit();
        sqlSession.close();
    }


    /**
     * 下载分类内所有数据
     * @param sqlSession mybatis Session
     * @param categoryCode 分类编号,可选值:1-10,view_menu
     */
    public static void downloadCategory(SqlSession sqlSession,String categoryCode) throws IOException {
        String categoryUrl = BASE_URL + "food/group/" + categoryCode;

        List<String> urls = new ArrayList<String>();

        //循环读10页,读取所有内容
        for (int pageNum = 1; pageNum <= 10; pageNum++) {
            String pageUrl = categoryUrl + "?page=" + pageNum;

            Document document = Jsoup.connect(pageUrl).timeout(3000).userAgent("Mozilla").get();
            Elements elements = document.getElementsByClass("food-list").first().getElementsByTag("h4");
            for(Element element:elements){
                Element elementA = element.getElementsByTag("a").first();
                urls.add(elementA.attributes().get("href"));
            }
        }
        //遍历所有地址获取并下载
        for(String url:urls){
            Integer category = categoryCode.equals("view_menu")?11:Integer.parseInt(categoryCode);
            downloadFoodInfo(sqlSession,url,category);
        }
    }


    /**
     * 下载食物信息并存储到数据库中
     * @param sqlSession mybatis Session
     * @param foodUrl 食物Url,例如 /shiwu/sanxiandoupi  最终结果为 BASE_URL+foodUrl
     * @param category 所属分类
     * @return 成功与否
     * @throws IOException
     */
    public static boolean downloadFoodInfo(SqlSession sqlSession,String foodUrl,Integer category)throws IOException{
        IFoodsDAO iFoodsDAO = sqlSession.getMapper(IFoodsDAO.class);
        IFoodMeasurementDAO iFoodMeasurementDAO = sqlSession.getMapper(IFoodMeasurementDAO.class);
        String url = BASE_URL + foodUrl;
        Foods food = new Foods();
        food.setCategory(category);
        Document document = Jsoup.connect(url).timeout(3000).userAgent("Mozilla").get();
        Element elementContainer = document.getElementsByClass("widget-group-content").first();
        food.setName(elementContainer.getElementsByClass("crumb").first().ownText().replaceAll("/","").trim());
        elementContainer = elementContainer.getElementsByClass("widget-food-detail").first();

        String imgUrl = elementContainer.getElementsByClass("food-pic").first().getElementsByTag("a").first().attributes().get("href");
        Elements elementsContent = elementContainer.getElementsByClass("content");
        //分别是:介绍div,营养div,度量单位div
        Element elementIntro = elementsContent.get(0),
                elementNutrition = elementsContent.get(1),
                elementMeasurement = elementsContent.get(2);
        //获取设置别名
        if(elementIntro.getElementsByTag("li").first().text().contains("别名"))
            food.setName(food.getName()+",又叫:"+elementIntro.getElementsByTag("li").first().ownText());
        food.setCalorie(new BigDecimal(elementIntro.getElementsByClass("stress").first().ownText()));
        //推荐度,计算图片MD5然后寻找图片对应推荐分
        String imgRecommended = elementIntro.getElementsByTag("img").first().attr("src");
        food.setComment(elementIntro.getElementsByTag("p").first().ownText());

        //营养信息
        Elements dd = elementNutrition.getElementsByTag("dd");
        for(Element element:dd){
            String nutritionName = element.getElementsByClass("dt").first().text();
            String nutritionNum = element.getElementsByClass("dd").first().text();
            if(!"营养素".equals(nutritionName) && !"一".equals(nutritionNum)){
                switch (nutritionName){
                    case "热量(大卡)":
                        food.setCalorie(new BigDecimal(nutritionNum));break;
                    case "碳水化合物(克)":
                        food.setNutritionCarbohydrate(new BigDecimal(nutritionNum));break;
                    case "脂肪(克)":
                        food.setNutritionFat(new BigDecimal(nutritionNum));break;
                    case "蛋白质(克)":
                        food.setNutritionProtein(new BigDecimal(nutritionNum));break;
                    case "纤维素(克)":
                        food.setNutritionFibre(new BigDecimal(nutritionNum));break;
                    case "维生素A(微克)":
                        food.setNutritionVitaminA(new BigDecimal(nutritionNum));break;
                    case "维生素C(毫克)":
                        food.setNutritionVitaminC(new BigDecimal(nutritionNum));break;
                    case "维生素E(毫克)":
                        food.setNutritionVitaminE(new BigDecimal(nutritionNum));break;
                    case "胡萝卜素(微克)":
                        food.setNutritionCarotene(new BigDecimal(nutritionNum));break;
                    case "硫胺素(毫克)":
                        food.setNutritionThiamine(new BigDecimal(nutritionNum));break;
                    case "核黄素(毫克)":
                        food.setNutritionRiboflavin(new BigDecimal(nutritionNum));break;
                    case "烟酸(毫克)":
                        food.setNutritionNiacin(new BigDecimal(nutritionNum));break;
                    case "胆固醇(毫克)":
                        food.setNutritionCholesterol(new BigDecimal(nutritionNum));break;
                    case "镁(毫克)":
                        food.setNutritionMagnesium(new BigDecimal(nutritionNum));break;
                    case "钙(毫克)":
                        food.setNutritionCalcium(new BigDecimal(nutritionNum));break;
                    case "铁(毫克)":
                        food.setNutritionIron(new BigDecimal(nutritionNum));break;
                    case "锌(毫克)":
                        food.setNutritionZinc(new BigDecimal(nutritionNum));break;
                    case "铜(毫克)":
                        food.setNutritionCopper(new BigDecimal(nutritionNum));break;
                    case "锰(毫克)":
                        food.setNutritionManganese(new BigDecimal(nutritionNum));break;
                    case "钾(毫克)":
                        food.setNutritionPotassium(new BigDecimal(nutritionNum));break;
                    case "磷(毫克)":
                        food.setNutritionPhosphorus(new BigDecimal(nutritionNum));break;
                    case "钠(毫克)":
                        food.setNutritionSodium(new BigDecimal(nutritionNum));break;
                    case "硒(微克)":
                        food.setNutritionSelenium(new BigDecimal(nutritionNum));break;
                    default :
                        log.error("无法解析元素: "+nutritionName+":"+nutritionNum);
                }
            }
        }
        //获取推荐性图片的MD5并计算到底是哪个
        try{
            Connection.Response respRecommended = Jsoup.connect(imgRecommended).ignoreContentType(true).execute();
            byte[] byteRecommended = respRecommended.bodyAsBytes();
            food.setRecommended(getRecommended(byteRecommended));
        }catch(Exception e){
            log.error("获取图片推荐度出错:",e);
            food.setRecommended((short)0);
        }



        //保存Foods信息
        iFoodsDAO.insertSelective(food);
        //插入数据库并获取自增编号
        Integer foodId = food.getFoodId();

        //利用自增编号给图片命名并保存
        try{
            Connection.Response respImg = Jsoup.connect(imgUrl).ignoreContentType(true).execute();
            byte[] img = respImg.bodyAsBytes();
            Tools.savaFile(img,IMAGE_DIR,"food"+foodId+".png");
        }catch(Exception e){
            log.error("保存食物图片出错:",e);
        }

        //度量信息
        elementMeasurement = elementMeasurement.getElementsByTag("tbody").first();
        if(elementMeasurement!=null) {
            Elements elementsBody = elementMeasurement.getElementsByTag("tr");
            for (Element element : elementsBody) {
                FoodMeasurement foodMeasurement = new FoodMeasurement();
                foodMeasurement.setFoodId(foodId);
                String foodUnit = element.getElementsByTag("td").first().text().trim();
                String foodCalorie = element.getElementsByTag("td").last().text().replaceAll("大卡", "").trim();
                foodMeasurement.setUnit(foodUnit);
                foodMeasurement.setCalorie(Integer.parseInt(foodCalorie));
                //保存食物分类信息
                iFoodMeasurementDAO.insertSelective(foodMeasurement);
            }
        }
        log.info("download food : " + food.getName() + " successful");

        return true;
    }


    /**
     * 根据传进来的图片bytes数据来计算md5并转换为 推荐值
     * @param bytes 图片数据
     * @return 推荐值,正常返回值1-10,查不到返回0
     */
    private static Short getRecommended(byte[] bytes){
        Map<String,Short> map = new HashMap<>();
        map.put("", (short) 1);
        map.put("", (short) 2);
        map.put("B5B2ACAFB6B5FB0D500FB0826C693432", (short) 3);
        map.put("346A804E6B3EC05FBAF46F6DF0313E6A", (short) 4);
        map.put("BAE441AC48A24682F89AAB01395737B7", (short) 5);
        map.put("58721B85273F9F440CC47DA558496A3E", (short) 6);
        map.put("842B5D67E45098884019426351A7717D", (short) 7);
        map.put("39F8205124C7C5DB9025886C7C910CD7", (short) 8);
        map.put("2FC3147CD34A75978AF03EC68FD51F81", (short) 9);
        map.put("8231BD8D422AB559ED978A5BDC72ECF8", (short) 10);
        String md5 = Tools.getMD5FromBytes(bytes).toUpperCase();
        Short key = map.get(md5);
        return key!=null?key:(short)0;
    }


    /**
     * 测试数据库是否可读取
     */
    public void testSql() {
        SqlSession sqlSession = DBAccess.getSqlSession();
        IFoodCategoryDAO foodCategoryDAO = sqlSession.getMapper(IFoodCategoryDAO.class);
        List<FoodCategory> foodCategories = foodCategoryDAO.selectByExample(new FoodCategoryExample());
        for (FoodCategory foodCategory : foodCategories) {
            System.out.println(foodCategory.getId() + "\t" + foodCategory.getName());
        }

        sqlSession.commit();
        sqlSession.close();
    }
}
