package spider.dao;

import spider.entity.FoodMeasurement;
import spider.entity.FoodMeasurementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IFoodMeasurementDAO {
    long countByExample(FoodMeasurementExample example);

    int deleteByExample(FoodMeasurementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FoodMeasurement record);

    int insertSelective(FoodMeasurement record);

    List<FoodMeasurement> selectByExample(FoodMeasurementExample example);

    FoodMeasurement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FoodMeasurement record, @Param("example") FoodMeasurementExample example);

    int updateByExample(@Param("record") FoodMeasurement record, @Param("example") FoodMeasurementExample example);

    int updateByPrimaryKeySelective(FoodMeasurement record);

    int updateByPrimaryKey(FoodMeasurement record);
}