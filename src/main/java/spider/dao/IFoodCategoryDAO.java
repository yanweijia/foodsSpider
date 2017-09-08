package spider.dao;

import spider.entity.FoodCategory;
import spider.entity.FoodCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IFoodCategoryDAO {
    long countByExample(FoodCategoryExample example);

    int deleteByExample(FoodCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FoodCategory record);

    int insertSelective(FoodCategory record);

    List<FoodCategory> selectByExample(FoodCategoryExample example);

    FoodCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FoodCategory record, @Param("example") FoodCategoryExample example);

    int updateByExample(@Param("record") FoodCategory record, @Param("example") FoodCategoryExample example);

    int updateByPrimaryKeySelective(FoodCategory record);

    int updateByPrimaryKey(FoodCategory record);
}