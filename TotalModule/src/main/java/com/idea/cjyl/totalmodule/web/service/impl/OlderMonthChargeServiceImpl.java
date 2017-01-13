package com.idea.cjyl.totalmodule.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericDaoMyself;
import com.idea.cjyl.core.generic.GenericServiceImpl;

import com.idea.cjyl.core.generic.GenericServiceVOImpl;
import com.idea.cjyl.totalmodule.web.dao.OlderMonthChargeMapper;
import com.idea.cjyl.totalmodule.web.dao.myself.OlderMonthChargeMapperMyself;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderExample;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderMonthCharge;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderMonthChargeExample;
import com.idea.cjyl.totalmodule.web.domain.vo.OlderMonthChargeVO;
import com.idea.cjyl.totalmodule.web.service.OlderMonthChargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OlderMonthChargeServiceImpl extends GenericServiceVOImpl<OlderMonthChargeVO, OlderMonthCharge, Long, OlderMonthChargeExample> implements OlderMonthChargeService {

    @Autowired
    private OlderMonthChargeMapper oldermonthchargeDao;
    @Autowired
    private OlderMonthChargeMapperMyself olderMonthChargeMapperMyself;

    @Override
    public GenericDao<OlderMonthCharge, Long, OlderMonthChargeExample> getDao() {
        return oldermonthchargeDao;
    }


    @Override
    public GenericDaoMyself<OlderMonthChargeVO, OlderMonthCharge, Long, OlderMonthChargeExample> getVODao() {
        return olderMonthChargeMapperMyself;
    }

    @Override
    public OlderMonthChargeExample getModelExample(OlderMonthCharge olderMonthCharge) {
        OlderMonthChargeExample olderMonthChargeExample = new OlderMonthChargeExample();
        OlderMonthChargeExample.Criteria criteria = olderMonthChargeExample.createCriteria();
        if (olderMonthCharge.getOlderId() != null) {
            criteria.andOlderIdEqualTo(olderMonthCharge.getOlderId());

        }
        if(olderMonthCharge.getOlderMonthChargeState()!=null){
            criteria.andOlderMonthChargeStateEqualTo(olderMonthCharge.getOlderMonthChargeState());
        }
        return olderMonthChargeExample;
    }
}
