package com.idea.cjyl.totalmodule.web.dao;

import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.totalmodule.web.domain.pojo.OrganizationLogin;
import com.idea.cjyl.totalmodule.web.domain.pojo.OrganizationLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationLoginMapper extends GenericDao {
    int countByExample(OrganizationLoginExample example);

    int deleteByExample(OrganizationLoginExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrganizationLogin record);

    int insertSelective(OrganizationLogin record);

    List<OrganizationLogin> selectByExample(OrganizationLoginExample example);

    OrganizationLogin selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrganizationLogin record, @Param("example") OrganizationLoginExample example);

    int updateByExample(@Param("record") OrganizationLogin record, @Param("example") OrganizationLoginExample example);

    int updateByPrimaryKeySelective(OrganizationLogin record);

    int updateByPrimaryKey(OrganizationLogin record);
}