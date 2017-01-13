package com.idea.cjyl.totalmodule.web.service.impl;


import com.idea.cjyl.core.generic.*;

import com.idea.cjyl.totalmodule.web.dao.OlderInitialFeeMapper;
import com.idea.cjyl.totalmodule.web.dao.myself.OlderInitialFeeMapperMyself;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderInitialFee;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderInitialFeeExample;
import com.idea.cjyl.totalmodule.web.domain.vo.OlderInitialFeeVO;
import com.idea.cjyl.totalmodule.web.service.OlderInitialFeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OlderInitialFeeServiceImpl extends GenericServiceVOImpl<OlderInitialFeeVO, OlderInitialFee, Long, OlderInitialFeeExample> implements OlderInitialFeeService {

    @Autowired
    private OlderInitialFeeMapper olderinitialfeeDao;
    @Autowired
    private OlderInitialFeeMapperMyself olderInitialFeeMapperMyself;

    @Override
    public GenericDao<OlderInitialFee, Long, OlderInitialFeeExample> getDao() {
        return olderinitialfeeDao;
    }


    @Override
    public GenericDaoMyself<OlderInitialFeeVO, OlderInitialFee, Long, OlderInitialFeeExample> getVODao() {
        return olderInitialFeeMapperMyself;
    }

    @Override
    public OlderInitialFeeExample getModelExample(OlderInitialFee olderInitialFee) {
        OlderInitialFeeExample olderInitialFeeExample = new OlderInitialFeeExample();
        OlderInitialFeeExample.Criteria criteria = olderInitialFeeExample.createCriteria();
        if (olderInitialFee.getOlderId() != null) {
            criteria.andOlderIdEqualTo(olderInitialFee.getOlderId());
        }
        if(olderInitialFee.getCheckInInitCostState()!=null){
            criteria.andCheckInInitCostStateEqualTo(olderInitialFee.getCheckInInitCostState());
        }
        return olderInitialFeeExample;
    }
}
