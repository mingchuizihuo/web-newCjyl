package com.idea.cjyl.totalmodule.web.controller;

import com.idea.cjyl.core.common.ResultData;
import com.idea.cjyl.core.generic.GenericController;
import com.idea.cjyl.totalmodule.web.domain.pojo.Product;
import com.idea.cjyl.totalmodule.web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/product")
public class ProductController extends GenericController {
    @Autowired
    private ProductService productService;

    /**
        * 添加商品
        * @param product
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(Product product){

        try {

                    productService.insert(product);


            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除商品
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                    productService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }
    /**
    * 批量删除商品
    *
    * @param ids
    * @return
    */
    @ResponseBody
    @RequestMapping(value = "dels", method = RequestMethod.POST)
    public ResultData del(String ids) {
        try {
            String[] idsArray = ids.split(",");
            for (String id : idsArray) {
                productService.delete(Long.parseLong(id));
            }

            } catch (Exception e) {
                return ResultData.build().delError();
            }
            return ResultData.build();

    }
    /**
    * 修改商品
    * @param product
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(Product product){
        try {
            productService.update(product);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有商品
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(productService.findAll(currentPage,limit));
    }
    
    @ResponseBody
    @RequestMapping(value = "findAllByType",method = RequestMethod.GET)
    public ResultData findAllByType(Integer productType){
        List<Product> productList =  productService.findAllByType(productType);
        return ResultData.build().parseList(productList);
    }

}