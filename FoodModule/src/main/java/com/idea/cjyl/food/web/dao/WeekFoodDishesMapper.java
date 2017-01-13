package com.idea.cjyl.food.web.dao;

;
import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.food.web.domain.pojo.WeekFoodDishes;
import com.idea.cjyl.food.web.domain.pojo.WeekFoodDishesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeekFoodDishesMapper extends GenericDao {
    int countByExample(WeekFoodDishesExample example);

    int deleteByExample(WeekFoodDishesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WeekFoodDishes record);

    int insertSelective(WeekFoodDishes record);

    List<WeekFoodDishes> selectByExample(WeekFoodDishesExample example);

    WeekFoodDishes selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WeekFoodDishes record, @Param("example") WeekFoodDishesExample example);

    int updateByExample(@Param("record") WeekFoodDishes record, @Param("example") WeekFoodDishesExample example);

    int updateByPrimaryKeySelective(WeekFoodDishes record);

    int updateByPrimaryKey(WeekFoodDishes record);
}