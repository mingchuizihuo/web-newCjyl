package com.idea.cjyl.totalmodule.web.service;

import com.idea.cjyl.core.generic.GenericService;
import com.idea.cjyl.totalmodule.web.domain.pojo.Product;
import com.idea.cjyl.totalmodule.web.domain.pojo.ProductExample;

import java.util.List;

public interface ProductService extends GenericService<Product,Long,ProductExample>{


    //根据类型获取产品列表
    List<Product> findAllByType(Integer productType);
}
