package com.idea.cjyl.food.web.dao;

import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.food.web.domain.pojo.DishesType;

import com.idea.cjyl.food.web.domain.pojo.DishesTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DishesTypeMapper extends GenericDao {
    int countByExample(DishesTypeExample example);

    int deleteByExample(DishesTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DishesType record);

    int insertSelective(DishesType record);

    List<DishesType> selectByExample(DishesTypeExample example);

    DishesType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DishesType record, @Param("example") DishesTypeExample example);

    int updateByExample(@Param("record") DishesType record, @Param("example") DishesTypeExample example);

    int updateByPrimaryKeySelective(DishesType record);

    int updateByPrimaryKey(DishesType record);
}