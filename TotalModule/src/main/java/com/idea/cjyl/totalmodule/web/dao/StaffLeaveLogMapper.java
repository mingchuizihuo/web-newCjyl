package com.idea.cjyl.totalmodule.web.dao;

import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.totalmodule.web.domain.pojo.StaffLeaveLog;
import com.idea.cjyl.totalmodule.web.domain.pojo.StaffLeaveLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffLeaveLogMapper extends GenericDao {
    int countByExample(StaffLeaveLogExample example);

    int deleteByExample(StaffLeaveLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StaffLeaveLog record);

    int insertSelective(StaffLeaveLog record);

    List<StaffLeaveLog> selectByExample(StaffLeaveLogExample example);

    StaffLeaveLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StaffLeaveLog record, @Param("example") StaffLeaveLogExample example);

    int updateByExample(@Param("record") StaffLeaveLog record, @Param("example") StaffLeaveLogExample example);

    int updateByPrimaryKeySelective(StaffLeaveLog record);

    int updateByPrimaryKey(StaffLeaveLog record);
}