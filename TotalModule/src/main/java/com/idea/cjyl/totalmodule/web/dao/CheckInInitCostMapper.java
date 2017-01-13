package com.idea.cjyl.totalmodule.web.dao;

import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.totalmodule.web.domain.pojo.CheckInInitCost;
import com.idea.cjyl.totalmodule.web.domain.pojo.CheckInInitCostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckInInitCostMapper extends GenericDao {
    int countByExample(CheckInInitCostExample example);

    int deleteByExample(CheckInInitCostExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CheckInInitCost record);

    int insertSelective(CheckInInitCost record);

    List<CheckInInitCost> selectByExample(CheckInInitCostExample example);

    CheckInInitCost selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CheckInInitCost record, @Param("example") CheckInInitCostExample example);

    int updateByExample(@Param("record") CheckInInitCost record, @Param("example") CheckInInitCostExample example);

    int updateByPrimaryKeySelective(CheckInInitCost record);

    int updateByPrimaryKey(CheckInInitCost record);
}