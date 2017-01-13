package com.idea.cjyl.food.web.dao;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.food.web.domain.pojo.DishesTypeDishes;
import com.idea.cjyl.food.web.domain.pojo.DishesTypeDishesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DishesTypeDishesMapper extends GenericDao {
    int countByExample(DishesTypeDishesExample example);

    int deleteByExample(DishesTypeDishesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DishesTypeDishes record);

    int insertSelective(DishesTypeDishes record);

    List<DishesTypeDishes> selectByExample(DishesTypeDishesExample example);

    DishesTypeDishes selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DishesTypeDishes record, @Param("example") DishesTypeDishesExample example);

    int updateByExample(@Param("record") DishesTypeDishes record, @Param("example") DishesTypeDishesExample example);

    int updateByPrimaryKeySelective(DishesTypeDishes record);

    int updateByPrimaryKey(DishesTypeDishes record);
}