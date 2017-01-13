package com.idea.cjyl.totalmodule.web.dao;

import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.totalmodule.web.domain.pojo.ServiceCharge;
import com.idea.cjyl.totalmodule.web.domain.pojo.ServiceChargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceChargeMapper extends GenericDao {
    int countByExample(ServiceChargeExample example);

    int deleteByExample(ServiceChargeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ServiceCharge record);

    int insertSelective(ServiceCharge record);

    List<ServiceCharge> selectByExample(ServiceChargeExample example);

    ServiceCharge selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ServiceCharge record, @Param("example") ServiceChargeExample example);

    int updateByExample(@Param("record") ServiceCharge record, @Param("example") ServiceChargeExample example);

    int updateByPrimaryKeySelective(ServiceCharge record);

    int updateByPrimaryKey(ServiceCharge record);
}