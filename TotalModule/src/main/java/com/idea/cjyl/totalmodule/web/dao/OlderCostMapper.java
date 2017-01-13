package com.idea.cjyl.totalmodule.web.dao;

import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderCost;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderCostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OlderCostMapper extends GenericDao {
    int countByExample(OlderCostExample example);

    int deleteByExample(OlderCostExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OlderCost record);

    int insertSelective(OlderCost record);

    List<OlderCost> selectByExample(OlderCostExample example);

    OlderCost selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OlderCost record, @Param("example") OlderCostExample example);

    int updateByExample(@Param("record") OlderCost record, @Param("example") OlderCostExample example);

    int updateByPrimaryKeySelective(OlderCost record);

    int updateByPrimaryKey(OlderCost record);
}