package com.idea.cjyl.food.web.dao;

import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.food.web.domain.pojo.WeekFoodExample;

import com.idea.cjyl.food.web.domain.pojo.WeekFood;
import com.idea.cjyl.food.web.domain.pojo.WeekFoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeekFoodMapper extends GenericDao {
    int countByExample(WeekFoodExample example);

    int deleteByExample(WeekFoodExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WeekFood record);

    int insertSelective(WeekFood record);

    List<WeekFood> selectByExample(WeekFoodExample example);

    WeekFood selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WeekFood record, @Param("example") WeekFoodExample example);

    int updateByExample(@Param("record") WeekFood record, @Param("example") WeekFoodExample example);

    int updateByPrimaryKeySelective(WeekFood record);

    int updateByPrimaryKey(WeekFood record);
}