package com.idea.cjyl.totalmodule.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceImpl;

import com.idea.cjyl.totalmodule.web.dao.ProductMapper;
import com.idea.cjyl.totalmodule.web.domain.pojo.Product;
import com.idea.cjyl.totalmodule.web.domain.pojo.ProductExample;
import com.idea.cjyl.totalmodule.web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl extends GenericServiceImpl<Product, Long, ProductExample> implements ProductService {

    @Autowired
    private ProductMapper productDao;

    @Override
    public GenericDao<Product, Long, ProductExample> getDao() {
        return productDao;
    }


    @Override
    public List<Product> findAllByType(Integer productType) {
        if(productType==0){
            List<Product> products = productDao.selectByExample(new ProductExample());
            return products;
        }else {
            ProductExample example = new ProductExample();
            example.createCriteria().andProductTypeEqualTo(productType);
            List<Product> products = productDao.selectByExample(example);
            return products;
        }
    }
}
