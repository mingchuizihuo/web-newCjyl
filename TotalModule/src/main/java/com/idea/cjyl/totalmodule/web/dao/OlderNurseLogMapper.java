package com.idea.cjyl.totalmodule.web.dao;

import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderNurseLog;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderNurseLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OlderNurseLogMapper extends GenericDao {
    int countByExample(OlderNurseLogExample example);

    int deleteByExample(OlderNurseLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OlderNurseLog record);

    int insertSelective(OlderNurseLog record);

    List<OlderNurseLog> selectByExample(OlderNurseLogExample example);

    OlderNurseLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OlderNurseLog record, @Param("example") OlderNurseLogExample example);

    int updateByExample(@Param("record") OlderNurseLog record, @Param("example") OlderNurseLogExample example);

    int updateByPrimaryKeySelective(OlderNurseLog record);

    int updateByPrimaryKey(OlderNurseLog record);
}