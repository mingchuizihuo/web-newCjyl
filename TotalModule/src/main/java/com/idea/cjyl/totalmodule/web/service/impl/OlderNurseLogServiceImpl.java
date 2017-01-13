package com.idea.cjyl.totalmodule.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericDaoMyself;
import com.idea.cjyl.core.generic.GenericServiceImpl;

import com.idea.cjyl.core.generic.GenericServiceVOImpl;
import com.idea.cjyl.totalmodule.web.dao.OlderNurseLogMapper;
import com.idea.cjyl.totalmodule.web.dao.myself.OlderNurseLogMapperMyself;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderExample;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderNurseLog;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderNurseLogExample;
import com.idea.cjyl.totalmodule.web.domain.vo.OlderNurseLogVO;
import com.idea.cjyl.totalmodule.web.service.OlderNurseLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OlderNurseLogServiceImpl extends GenericServiceVOImpl<OlderNurseLogVO, OlderNurseLog, Long, OlderNurseLogExample> implements OlderNurseLogService {

    @Autowired
    private OlderNurseLogMapper oldernurselogDao;
    @Autowired
    private OlderNurseLogMapperMyself olderNurseLogMapperMyself;

    @Override
    public GenericDao<OlderNurseLog, Long, OlderNurseLogExample> getDao() {
        return oldernurselogDao;
    }


    @Override
    public GenericDaoMyself<OlderNurseLogVO, OlderNurseLog, Long, OlderNurseLogExample> getVODao() {
        return olderNurseLogMapperMyself;
    }

    @Override
    public OlderNurseLogExample getModelExample(OlderNurseLog olderNurseLog) {
        OlderNurseLogExample olderNurseLogExample = new OlderNurseLogExample();
        OlderNurseLogExample.Criteria criteria = olderNurseLogExample.createCriteria();
        if(olderNurseLog.getOlderId()!=null){
            criteria.andOlderIdEqualTo(olderNurseLog.getOlderId());
        }
        return super.getModelExample(olderNurseLog);
    }
}
