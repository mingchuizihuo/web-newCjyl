package com.idea.cjyl.totalmodule.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceImpl;

import com.idea.cjyl.totalmodule.web.dao.SaivianRememberMapper;
import com.idea.cjyl.totalmodule.web.domain.pojo.SaivianRemember;
import com.idea.cjyl.totalmodule.web.domain.pojo.SaivianRememberExample;
import com.idea.cjyl.totalmodule.web.service.SaivianRememberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SaivianRememberServiceImpl extends GenericServiceImpl<SaivianRemember, Long, SaivianRememberExample> implements SaivianRememberService {

    @Autowired
    private SaivianRememberMapper saivianrememberDao;

    @Override
    public GenericDao<SaivianRemember, Long, SaivianRememberExample> getDao() {
        return saivianrememberDao;
    }


    @Override
    public List<SaivianRemember> findAllByUser(Long userId) {
        SaivianRememberExample saivianRememberExample = new SaivianRememberExample();
        saivianRememberExample.createCriteria().andUserIdEqualTo(userId);
        List<SaivianRemember> saivianRemembers = saivianrememberDao.selectByExample(saivianRememberExample);
        return saivianRemembers;
    }
}
