package com.idea.cjyl.food.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceImpl;
import com.idea.cjyl.food.web.dao.FoodMeterialNutrimentMapper;
import com.idea.cjyl.food.web.domain.pojo.FoodMeterialNutriment;
import com.idea.cjyl.food.web.domain.pojo.FoodMeterialNutrimentExample;
import com.idea.cjyl.food.web.service.FoodMeterialNutrimentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class FoodMeterialNutrimentServiceImpl extends GenericServiceImpl<FoodMeterialNutriment, Long,FoodMeterialNutrimentExample> implements FoodMeterialNutrimentService {

       @Autowired
       private FoodMeterialNutrimentMapper foodmeterialnutrimentDao;
       @Override
       public GenericDao<FoodMeterialNutriment, Long,FoodMeterialNutrimentExample> getDao() {
       return foodmeterialnutrimentDao;
       }


}
