package com.idea.cjyl.totalmodule.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceImpl;

import com.idea.cjyl.totalmodule.web.dao.ShopMapper;
import com.idea.cjyl.totalmodule.web.domain.pojo.Shop;
import com.idea.cjyl.totalmodule.web.domain.pojo.ShopExample;
import com.idea.cjyl.totalmodule.web.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ShopServiceImpl extends GenericServiceImpl<Shop, Long, ShopExample> implements ShopService {

    @Autowired
    private ShopMapper shopDao;

    @Override
    public GenericDao<Shop, Long, ShopExample> getDao() {
        return shopDao;
    }



    @Override
    public List<Shop> findAllByType(Integer shopType) {
        if(shopType==0){
            List<Shop> shops = shopDao.selectByExample(new ShopExample());
            return shops;
        }else{
            ShopExample shopExample = new ShopExample();
            shopExample.createCriteria().andShopTypeEqualTo(shopType);
            List<Shop> shops = shopDao.selectByExample(shopExample);
            return shops;
        }

    }
}
