package com.idea.cjyl.core.generic;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/11/14.
 */
public abstract class GenericServiceExampleImpl<Model,ModelExample> extends GenericServiceImpl implements GenericServiceExample<Model>{

    /**
     * 获取普通查询对象
     * @return
     */
    public abstract ModelExample getModelExample();



    /**
     * 按条件查询
     * @param model
     * @param currentPage
     * @param limit
     * @return
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public Page<Model> findByExample(Model model, Integer currentPage, Integer limit) throws InvocationTargetException, IllegalAccessException {
        if(currentPage==null){
            currentPage=1;
        }
        if(limit==null){
            limit=10;
        }
        ModelExample example = getModelExample();
        Class clazz = model.getClass();
        Class clazzExample = example.getClass();
        Method[] methodExamples = clazzExample.getMethods();
        Method[] methods =  clazz.getMethods();


        for (Method method:methods){
            String methodNameHead = method.getName().substring(0,3);

            if(methodNameHead.equals("get")){
                String methodFieldName = method.getName().substring(3);
                Object o = method.invoke(model);
                if(o!=null){
                    for (Method methodExample:methodExamples){
                        String exampleAndName = "and"+methodFieldName+"EqualTo";
                        if(methodExample.getName().equals(exampleAndName)){
                            methodExample.invoke(example,o);
                        }
                    }
                }
            }
        }

        PageHelper.startPage(currentPage, limit);
        Page<Model> list = (Page<Model>) getDao()
                .selectByExample(example);
        return list;
    }

}
