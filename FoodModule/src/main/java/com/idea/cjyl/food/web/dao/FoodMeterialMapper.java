package com.idea.cjyl.food.web.dao;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.food.web.domain.pojo.FoodMeterial;
import com.idea.cjyl.food.web.domain.pojo.FoodMeterialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodMeterialMapper extends GenericDao {
    int countByExample(FoodMeterialExample example);

    int deleteByExample(FoodMeterialExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FoodMeterial record);

    int insertSelective(FoodMeterial record);

    List<FoodMeterial> selectByExample(FoodMeterialExample example);

    FoodMeterial selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FoodMeterial record, @Param("example") FoodMeterialExample example);

    int updateByExample(@Param("record") FoodMeterial record, @Param("example") FoodMeterialExample example);

    int updateByPrimaryKeySelective(FoodMeterial record);

    int updateByPrimaryKey(FoodMeterial record);
}