package com.idea.cjyl.totalmodule.web.dao;

import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderInitialFee;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderInitialFeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OlderInitialFeeMapper extends GenericDao {
    int countByExample(OlderInitialFeeExample example);

    int deleteByExample(OlderInitialFeeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OlderInitialFee record);

    int insertSelective(OlderInitialFee record);

    List<OlderInitialFee> selectByExample(OlderInitialFeeExample example);

    OlderInitialFee selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OlderInitialFee record, @Param("example") OlderInitialFeeExample example);

    int updateByExample(@Param("record") OlderInitialFee record, @Param("example") OlderInitialFeeExample example);

    int updateByPrimaryKeySelective(OlderInitialFee record);

    int updateByPrimaryKey(OlderInitialFee record);
}