package com.idea.cjyl.totalmodule.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceImpl;

import com.idea.cjyl.totalmodule.web.dao.ConsumptionRecordMapper;
import com.idea.cjyl.totalmodule.web.domain.pojo.ConsumptionRecord;
import com.idea.cjyl.totalmodule.web.domain.pojo.ConsumptionRecordExample;
import com.idea.cjyl.totalmodule.web.service.ConsumptionRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class ConsumptionRecordServiceImpl extends GenericServiceImpl<ConsumptionRecord, Long,ConsumptionRecordExample> implements ConsumptionRecordService {

       @Autowired
       private ConsumptionRecordMapper consumptionrecordDao;
       @Override
       public GenericDao<ConsumptionRecord, Long,ConsumptionRecordExample> getDao() {
       return consumptionrecordDao;
       }


}
