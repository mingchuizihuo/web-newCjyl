package com.idea.cjyl.totalmodule.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceImpl;

import com.idea.cjyl.totalmodule.web.dao.ConsumptionRecordMapper;
import com.idea.cjyl.totalmodule.web.dao.SaivianRememberMapper;
import com.idea.cjyl.totalmodule.web.domain.pojo.ConsumptionRecord;
import com.idea.cjyl.totalmodule.web.domain.pojo.ConsumptionRecordExample;
import com.idea.cjyl.totalmodule.web.domain.pojo.SaivianRemember;
import com.idea.cjyl.totalmodule.web.service.ConsumptionRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ConsumptionRecordServiceImpl extends GenericServiceImpl<ConsumptionRecord, Long, ConsumptionRecordExample> implements ConsumptionRecordService {

    @Autowired
    private ConsumptionRecordMapper consumptionrecordDao;
    @Autowired
    private SaivianRememberMapper saivianRememberMapper;

    @Override
    public GenericDao<ConsumptionRecord, Long, ConsumptionRecordExample> getDao() {
        return consumptionrecordDao;
    }

    @Override
    public ConsumptionRecord insert(ConsumptionRecord consumptionRecord) {

        SaivianRemember saivianRemember = saivianRememberMapper.
                selectByPrimaryKey(consumptionRecord.getUserSaivianId());
        consumptionRecord.setBankCardNum(saivianRemember.getBankCardNum());
        consumptionRecord.setBankName(saivianRemember.getBankName());
        consumptionRecord.setBankType(saivianRemember.getBankType());
        consumptionRecord.setBankEffectiveDate(saivianRemember.getBankEffectiveDate());
        String consumMoney = consumptionRecord.getConsumeMoney();
        Double d =Math.ceil(Double.parseDouble(consumMoney)*6.8097);
        consumptionRecord.setConsumeMoney(d+"");

        consumptionRecord.setConsumeMonth(5+"");
        return super.insert(consumptionRecord);
    }
}
