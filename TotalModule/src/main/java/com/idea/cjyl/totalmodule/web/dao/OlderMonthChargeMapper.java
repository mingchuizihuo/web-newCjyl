package com.idea.cjyl.totalmodule.web.dao;

import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderMonthCharge;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderMonthChargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OlderMonthChargeMapper extends GenericDao {
    int countByExample(OlderMonthChargeExample example);

    int deleteByExample(OlderMonthChargeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OlderMonthCharge record);

    int insertSelective(OlderMonthCharge record);

    List<OlderMonthCharge> selectByExample(OlderMonthChargeExample example);

    OlderMonthCharge selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OlderMonthCharge record, @Param("example") OlderMonthChargeExample example);

    int updateByExample(@Param("record") OlderMonthCharge record, @Param("example") OlderMonthChargeExample example);

    int updateByPrimaryKeySelective(OlderMonthCharge record);

    int updateByPrimaryKey(OlderMonthCharge record);
}