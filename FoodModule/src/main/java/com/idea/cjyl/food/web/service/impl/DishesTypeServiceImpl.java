package com.idea.cjyl.food.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceLevelImpl;
import com.idea.cjyl.food.web.domain.pojo.DishesType;

import com.idea.cjyl.food.web.dao.DishesTypeMapper;
import com.idea.cjyl.food.web.domain.pojo.DishesTypeExample;
import com.idea.cjyl.food.web.service.DishesTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class DishesTypeServiceImpl extends GenericServiceLevelImpl<DishesType, Long,DishesTypeExample> implements DishesTypeService {


        @Autowired
        private DishesTypeMapper dishestypeDao;
        @Override
        public GenericDao<DishesType, Long,DishesTypeExample> getDao() {
            return dishestypeDao;
        }

        @Override
        public DishesTypeExample getModelExamplTidEqualTo(Long tid) {
            DishesTypeExample dishestypeExample = new DishesTypeExample();
            dishestypeExample.createCriteria().andTidEqualTo(tid);
            return dishestypeExample;
        }

        @Override
        public byte getLevel(DishesType dishestype) {

            return dishestype.getDishesTypeLevel();
        }

        @Override
        public Long getTid(DishesType dishestype) {
            return dishestype.getTid();
        }

        @Override
        public void setLevel(DishesType dishestype, Byte level) {
            dishestype.setDishesTypeLevel(level);
        }

        @Override
        public void setTid(DishesType dishestype) {
            dishestype.setTid(0L);
        }


}
