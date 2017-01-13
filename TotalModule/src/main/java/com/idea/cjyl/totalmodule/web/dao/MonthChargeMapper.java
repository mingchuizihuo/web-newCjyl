package com.idea.cjyl.totalmodule.web.dao;

import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.totalmodule.web.domain.pojo.MonthCharge;
import com.idea.cjyl.totalmodule.web.domain.pojo.MonthChargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MonthChargeMapper extends GenericDao {
    int countByExample(MonthChargeExample example);

    int deleteByExample(MonthChargeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MonthCharge record);

    int insertSelective(MonthCharge record);

    List<MonthCharge> selectByExample(MonthChargeExample example);

    MonthCharge selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MonthCharge record, @Param("example") MonthChargeExample example);

    int updateByExample(@Param("record") MonthCharge record, @Param("example") MonthChargeExample example);

    int updateByPrimaryKeySelective(MonthCharge record);

    int updateByPrimaryKey(MonthCharge record);
}