package com.idea.cjyl.totalmodule.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericDaoMyself;

import com.idea.cjyl.core.generic.GenericServiceVOImpl;
import com.idea.cjyl.totalmodule.web.dao.OlderKinsfolkMapper;
import com.idea.cjyl.totalmodule.web.dao.myself.OlderKinsfolkMapperMyself;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderKinsfolk;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderKinsfolkExample;
import com.idea.cjyl.totalmodule.web.domain.vo.OlderKinsfolkVO;
import com.idea.cjyl.totalmodule.web.service.OlderKinsfolkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OlderKinsfolkServiceImpl extends GenericServiceVOImpl<OlderKinsfolkVO, OlderKinsfolk, Long, OlderKinsfolkExample> implements OlderKinsfolkService {

    @Autowired
    private OlderKinsfolkMapper olderkinsfolkDao;
    @Autowired
    private OlderKinsfolkMapperMyself olderKinsfolkMapperMyself;

    @Override
    public GenericDao<OlderKinsfolk, Long, OlderKinsfolkExample> getDao() {
        return olderkinsfolkDao;
    }

    @Override
    public GenericDaoMyself<OlderKinsfolkVO, OlderKinsfolk, Long, OlderKinsfolkExample> getVODao() {
        return olderKinsfolkMapperMyself;
    }

    @Override
    public OlderKinsfolkExample getModelExample(OlderKinsfolk olderKinsfolk) {
        OlderKinsfolkExample olderKinsfolkExampleExample = new OlderKinsfolkExample();
        OlderKinsfolkExample.Criteria criteria = olderKinsfolkExampleExample.createCriteria();
        if (olderKinsfolk.getOlderId() != null) {
            criteria.andOlderIdEqualTo(olderKinsfolk.getOlderId());
        }
        return olderKinsfolkExampleExample;
    }

}
