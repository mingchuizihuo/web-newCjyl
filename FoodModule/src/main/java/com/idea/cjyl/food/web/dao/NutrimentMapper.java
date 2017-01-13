package com.idea.cjyl.food.web.dao;

import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.food.web.domain.pojo.Nutriment;

import com.idea.cjyl.food.web.domain.pojo.Nutriment;
import com.idea.cjyl.food.web.domain.pojo.NutrimentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NutrimentMapper extends GenericDao {
    int countByExample(NutrimentExample example);

    int deleteByExample(NutrimentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nutriment record);

    int insertSelective(Nutriment record);

    List<Nutriment> selectByExample(NutrimentExample example);

    Nutriment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nutriment record, @Param("example") NutrimentExample example);

    int updateByExample(@Param("record") Nutriment record, @Param("example") NutrimentExample example);

    int updateByPrimaryKeySelective(Nutriment record);

    int updateByPrimaryKey(Nutriment record);
}