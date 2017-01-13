package com.idea.cjyl.core.generic;

import com.idea.cjyl.core.common.ResultData;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 10238 on 2016/11/11.
 */
public abstract class GenericTestController<Model,ModelExample> extends GenericController{

    public abstract GenericService getGenericService();


    /**
     * 添加床位
     * @param model
     * @return
     */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.GET)
    public ResultData add(Model model){

        try {
            getGenericService().insert(model);


        }catch (Exception e){
            return ResultData.build().addErroe();
        }
        return ResultData.build();

    }

    /**
     * 查询单个
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "findOne",method = RequestMethod.GET)
    public ResultData findOne(Long id){

        return ResultData.build().put("aData",getGenericService().selectById(id));
    }

    public ResultData findByExample(Model model){


        return null;
    }
}
