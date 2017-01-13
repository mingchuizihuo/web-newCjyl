package com.idea.cjyl.food.web.dao;

import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.food.web.domain.pojo.DishesPicture;
import com.idea.cjyl.food.web.domain.pojo.DishesPictureExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DishesPictureMapper extends GenericDao {
    int countByExample(DishesPictureExample example);

    int deleteByExample(DishesPictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DishesPicture record);

    int insertSelective(DishesPicture record);

    List<DishesPicture> selectByExample(DishesPictureExample example);

    DishesPicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DishesPicture record, @Param("example") DishesPictureExample example);

    int updateByExample(@Param("record") DishesPicture record, @Param("example") DishesPictureExample example);

    int updateByPrimaryKeySelective(DishesPicture record);

    int updateByPrimaryKey(DishesPicture record);
}