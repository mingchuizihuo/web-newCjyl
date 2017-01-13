package com.idea.cjyl.food.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceImpl;
import com.idea.cjyl.food.web.dao.DishesTypeDishesMapper;
import com.idea.cjyl.food.web.domain.pojo.DishesTypeDishes;
import com.idea.cjyl.food.web.domain.pojo.DishesTypeDishesExample;
import com.idea.cjyl.food.web.service.DishesTypeDishesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class DishesTypeDishesServiceImpl extends GenericServiceImpl<DishesTypeDishes, Long,DishesTypeDishesExample> implements DishesTypeDishesService {
    @Autowired
    private DishesTypeDishesMapper dishestypedishesDao;
    @Override
    public GenericDao<DishesTypeDishes, Long,DishesTypeDishesExample> getDao() {
        return dishestypedishesDao;
    }

}
