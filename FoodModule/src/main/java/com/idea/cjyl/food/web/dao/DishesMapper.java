package com.idea.cjyl.food.web.dao;

import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.food.web.domain.pojo.Dishes;
import com.idea.cjyl.food.web.domain.pojo.DishesExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DishesMapper extends GenericDao {
    int countByExample(DishesExample example);

    int deleteByExample(DishesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Dishes record);

    int insertSelective(Dishes record);

    List<Dishes> selectByExampleWithBLOBs(DishesExample example);

    List<Dishes> selectByExample(DishesExample example);

    Dishes selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Dishes record, @Param("example") DishesExample example);

    int updateByExampleWithBLOBs(@Param("record") Dishes record, @Param("example") DishesExample example);

    int updateByExample(@Param("record") Dishes record, @Param("example") DishesExample example);

    int updateByPrimaryKeySelective(Dishes record);

    int updateByPrimaryKeyWithBLOBs(Dishes record);

    int updateByPrimaryKey(Dishes record);
}