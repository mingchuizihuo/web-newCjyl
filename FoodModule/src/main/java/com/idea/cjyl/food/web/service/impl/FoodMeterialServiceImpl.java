package com.idea.cjyl.food.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceLevelImpl;
import com.idea.cjyl.food.web.dao.FoodMeterialMapper;
import com.idea.cjyl.food.web.domain.pojo.FoodMeterialExample;
import com.idea.cjyl.food.web.service.FoodMeterialService;


import com.idea.cjyl.food.web.domain.pojo.FoodMeterial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class FoodMeterialServiceImpl extends GenericServiceLevelImpl<FoodMeterial, Long,FoodMeterialExample> implements FoodMeterialService {


        @Autowired
        private FoodMeterialMapper foodmeterialDao;
        @Override
        public GenericDao<FoodMeterial, Long,FoodMeterialExample> getDao() {
            return foodmeterialDao;
        }

        @Override
        public FoodMeterialExample getModelExamplTidEqualTo(Long tid) {
            FoodMeterialExample foodmeterialExample = new FoodMeterialExample();
            foodmeterialExample.createCriteria().andTidEqualTo(tid);
            return foodmeterialExample;
        }

        @Override
        public byte getLevel(FoodMeterial foodmeterial) {

            return foodmeterial.getMeterialTypeLevel();
        }

        @Override
        public Long getTid(FoodMeterial foodmeterial) {
            return foodmeterial.getTid();
        }

        @Override
        public void setLevel(FoodMeterial foodmeterial, Byte level) {
            foodmeterial.setMeterialTypeLevel(level);
        }

        @Override
        public void setTid(FoodMeterial foodmeterial) {
            foodmeterial.setTid(0L);
        }


}
