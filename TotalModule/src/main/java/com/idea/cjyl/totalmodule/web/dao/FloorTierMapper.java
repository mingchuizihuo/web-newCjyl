package com.idea.cjyl.totalmodule.web.dao;

import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.totalmodule.web.domain.pojo.FloorTier;
import com.idea.cjyl.totalmodule.web.domain.pojo.FloorTierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FloorTierMapper extends GenericDao {
    int countByExample(FloorTierExample example);

    int deleteByExample(FloorTierExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FloorTier record);

    int insertSelective(FloorTier record);

    List<FloorTier> selectByExample(FloorTierExample example);

    FloorTier selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FloorTier record, @Param("example") FloorTierExample example);

    int updateByExample(@Param("record") FloorTier record, @Param("example") FloorTierExample example);

    int updateByPrimaryKeySelective(FloorTier record);

    int updateByPrimaryKey(FloorTier record);
}