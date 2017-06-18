package com.idea.cjyl.totalmodule.web.controller;

import com.idea.cjyl.core.common.ResultData;
import com.idea.cjyl.core.generic.GenericController;
import com.idea.cjyl.totalmodule.web.domain.pojo.Shop;
import com.idea.cjyl.totalmodule.web.service.ShopService;
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
@RequestMapping("serve/shop")
public class ShopController extends GenericController {
    @Autowired
    private ShopService shopService;

    /**
        * 添加商铺
        * @param shop
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(Shop shop){

        try {
                    shopService.insert(shop);


            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除商铺
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                    shopService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }
    /**
    * 批量删除商铺
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
                shopService.delete(Long.parseLong(id));
            }

            } catch (Exception e) {
                return ResultData.build().delError();
            }
            return ResultData.build();

    }
    /**
    * 修改商铺
    * @param shop
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(Shop shop){
        try {
            shopService.update(shop);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有商铺
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(shopService.findAll(currentPage,limit));
    }

    @ResponseBody
    @RequestMapping(value = "findAllByType",method = RequestMethod.GET)
    public ResultData findAllByType(Integer shopType){
        List<Shop> shopList =  shopService.findAllByType(shopType);
        return ResultData.build().parseList(shopList);
    }

}