package com.idea.cjyl.totalmodule.web.dao;

import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderAdmissionAndDischargeLog;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderAdmissionAndDischargeLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OlderAdmissionAndDischargeLogMapper extends GenericDao {
    int countByExample(OlderAdmissionAndDischargeLogExample example);

    int deleteByExample(OlderAdmissionAndDischargeLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OlderAdmissionAndDischargeLog record);

    int insertSelective(OlderAdmissionAndDischargeLog record);

    List<OlderAdmissionAndDischargeLog> selectByExample(OlderAdmissionAndDischargeLogExample example);

    OlderAdmissionAndDischargeLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OlderAdmissionAndDischargeLog record, @Param("example") OlderAdmissionAndDischargeLogExample example);

    int updateByExample(@Param("record") OlderAdmissionAndDischargeLog record, @Param("example") OlderAdmissionAndDischargeLogExample example);

    int updateByPrimaryKeySelective(OlderAdmissionAndDischargeLog record);

    int updateByPrimaryKey(OlderAdmissionAndDischargeLog record);
}