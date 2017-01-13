package com.idea.cjyl.food.web.dao;

import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.food.web.domain.pojo.DishesMeterial;
import com.idea.cjyl.food.web.domain.pojo.DishesMeterialExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DishesMeterialMapper extends GenericDao {
    int countByExample(DishesMeterialExample example);

    int deleteByExample(DishesMeterialExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DishesMeterial record);

    int insertSelective(DishesMeterial record);

    List<DishesMeterial> selectByExample(DishesMeterialExample example);

    DishesMeterial selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DishesMeterial record, @Param("example") DishesMeterialExample example);

    int updateByExample(@Param("record") DishesMeterial record, @Param("example") DishesMeterialExample example);

    int updateByPrimaryKeySelective(DishesMeterial record);

    int updateByPrimaryKey(DishesMeterial record);
}