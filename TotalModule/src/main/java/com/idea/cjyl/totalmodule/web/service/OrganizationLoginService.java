package com.idea.cjyl.totalmodule.web.service;

import com.idea.cjyl.core.generic.GenericServiceLevel;
import com.idea.cjyl.core.generic.GenericService;

import com.idea.cjyl.totalmodule.web.domain.pojo.OrganizationLogin;
import com.idea.cjyl.totalmodule.web.domain.pojo.OrganizationLoginExample;

import java.util.List;

public interface OrganizationLoginService extends GenericService<OrganizationLogin,Long,OrganizationLoginExample>{
    /**
     * 模糊查询机构名
     * @param organizationName
     * @return
     */
    public List<OrganizationLogin> likeGetOrganizationName(String organizationName);
}
