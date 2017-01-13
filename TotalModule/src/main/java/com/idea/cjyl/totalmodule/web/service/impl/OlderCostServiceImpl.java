package com.idea.cjyl.totalmodule.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericDaoMyself;
import com.idea.cjyl.core.generic.GenericServiceImpl;

import com.idea.cjyl.core.generic.GenericServiceVOImpl;
import com.idea.cjyl.totalmodule.web.dao.OlderCostMapper;
import com.idea.cjyl.totalmodule.web.dao.myself.OlderCostMapperMyself;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderCost;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderCostExample;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderExample;
import com.idea.cjyl.totalmodule.web.domain.vo.OlderCostVO;
import com.idea.cjyl.totalmodule.web.service.OlderCostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OlderCostServiceImpl extends GenericServiceVOImpl<OlderCostVO, OlderCost, Long, OlderCostExample> implements OlderCostService {

    @Autowired
    private OlderCostMapper oldercostDao;
    @Autowired
    private OlderCostMapperMyself olderCostMapperMyself;

    @Override
    public GenericDao<OlderCost, Long, OlderCostExample> getDao() {
        return oldercostDao;
    }


    @Override
    public GenericDaoMyself<OlderCostVO, OlderCost, Long, OlderCostExample> getVODao() {
        return olderCostMapperMyself;
    }

    @Override
    public OlderCostExample getModelExample(OlderCost olderCost) {
        OlderCostExample olderCostExample = new OlderCostExample();
        OlderCostExample.Criteria criteria = olderCostExample.createCriteria();
                if(olderCost.getOlderId()!=null){
                    criteria.andOlderIdEqualTo(olderCost.getOlderId());
                }
                if(olderCost.getServiceChargeState()!=null){
                    criteria.andServiceChargeStateEqualTo(olderCost.getServiceChargeState());
                }
        return olderCostExample;
    }
}
