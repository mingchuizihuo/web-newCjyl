package com.idea.cjyl.totalmodule.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceLevelImpl;

import com.idea.cjyl.totalmodule.web.dao.DataDictionaryMapper;
import com.idea.cjyl.totalmodule.web.domain.pojo.DataDictionary;
import com.idea.cjyl.totalmodule.web.domain.pojo.DataDictionaryExample;
import com.idea.cjyl.totalmodule.web.service.DataDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class DataDictionaryServiceImpl extends GenericServiceLevelImpl<DataDictionary, Long,DataDictionaryExample> implements DataDictionaryService {


        @Autowired
        private DataDictionaryMapper datadictionaryDao;
        @Override
        public GenericDao<DataDictionary, Long,DataDictionaryExample> getDao() {
            return datadictionaryDao;
        }

        @Override
        public DataDictionaryExample getModelExamplTidEqualTo(Long tid) {
            DataDictionaryExample datadictionaryExample = new DataDictionaryExample();
            datadictionaryExample.createCriteria().andTidEqualTo(tid);
            return datadictionaryExample;
        }

        @Override
        public byte getLevel(DataDictionary datadictionary) {

            return datadictionary.getDataLevel();
        }

        @Override
        public Long getTid(DataDictionary datadictionary) {
            return datadictionary.getTid();
        }

        @Override
        public void setLevel(DataDictionary datadictionary, Byte level) {
            datadictionary.setDataLevel(level);
        }

        @Override
        public void setTid(DataDictionary datadictionary) {
            datadictionary.setTid(0L);
        }


}
