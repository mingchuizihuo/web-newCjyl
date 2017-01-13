package com.idea.cjyl.totalmodule.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceImpl;

import com.idea.cjyl.totalmodule.web.dao.OlderAdmissionAndDischargeLogMapper;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderAdmissionAndDischargeLog;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderAdmissionAndDischargeLogExample;
import com.idea.cjyl.totalmodule.web.service.OlderAdmissionAndDischargeLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class OlderAdmissionAndDischargeLogServiceImpl extends GenericServiceImpl<OlderAdmissionAndDischargeLog, Long,OlderAdmissionAndDischargeLogExample> implements OlderAdmissionAndDischargeLogService {

       @Autowired
       private OlderAdmissionAndDischargeLogMapper olderadmissionanddischargelogDao;
       @Override
       public GenericDao<OlderAdmissionAndDischargeLog, Long,OlderAdmissionAndDischargeLogExample> getDao() {
       return olderadmissionanddischargelogDao;
       }


}
