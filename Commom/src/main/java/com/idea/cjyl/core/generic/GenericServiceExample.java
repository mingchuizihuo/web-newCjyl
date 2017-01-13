package com.idea.cjyl.core.generic;

import com.github.pagehelper.Page;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Administrator on 2016/11/14.
 */
public interface GenericServiceExample<Model> {

    public Page<Model> findByExample(Model model, Integer currentPage, Integer limit) throws InvocationTargetException, IllegalAccessException;
}
