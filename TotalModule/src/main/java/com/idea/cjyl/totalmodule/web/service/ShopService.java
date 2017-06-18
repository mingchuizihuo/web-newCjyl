package com.idea.cjyl.totalmodule.web.service;

import com.idea.cjyl.core.generic.GenericService;
import com.idea.cjyl.totalmodule.web.domain.pojo.Shop;
import com.idea.cjyl.totalmodule.web.domain.pojo.ShopExample;

import java.util.List;

public interface ShopService extends GenericService<Shop,Long,ShopExample>{


    //根据商铺类型获取商铺
    List<Shop> findAllByType(Integer shopType);
}
