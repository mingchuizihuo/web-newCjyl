package com.idea.cjyl.food.web.dao;

import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.food.web.domain.pojo.FoodMeterialNutrimentExample;

import com.idea.cjyl.food.web.domain.pojo.FoodMeterialNutriment;
import com.idea.cjyl.food.web.domain.pojo.FoodMeterialNutrimentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodMeterialNutrimentMapper extends GenericDao {
    int countByExample(FoodMeterialNutrimentExample example);

    int deleteByExample(FoodMeterialNutrimentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FoodMeterialNutriment record);

    int insertSelective(FoodMeterialNutriment record);

    List<FoodMeterialNutriment> selectByExample(FoodMeterialNutrimentExample example);

    FoodMeterialNutriment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FoodMeterialNutriment record, @Param("example") FoodMeterialNutrimentExample example);

    int updateByExample(@Param("record") FoodMeterialNutriment record, @Param("example") FoodMeterialNutrimentExample example);

    int updateByPrimaryKeySelective(FoodMeterialNutriment record);

    int updateByPrimaryKey(FoodMeterialNutriment record);
}