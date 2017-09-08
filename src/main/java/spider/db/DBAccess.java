package spider.db;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by weijia on 2017-09-08.
 * Mybatis访问数据库
 */
public class DBAccess {
    private static Reader reader = null;
    private static SqlSessionFactory sqlSessionFactory = null;
    private static final Logger logger = LogManager.getLogger(DBAccess.class);

    static{
        try {
            // 通过配置文件获取数据库连接信息
            reader = Resources.getResourceAsReader("mybatisConfig.xml");
        } catch (IOException e) {
            logger.error("获取Mybatis配置文件出错",e);
        }
        // 通过配置信息构建一个SqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    }

    /**
     * 获取一个SqlSession
     * @return
     */
    public static SqlSession getSqlSession(){
        // 通过sqlSessionFactory打开一个数据库会话
        return sqlSessionFactory.openSession();
    }
}
