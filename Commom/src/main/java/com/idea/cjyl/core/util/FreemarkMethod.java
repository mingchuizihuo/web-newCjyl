package com.idea.cjyl.core.util;

import freemarker.template.TemplateMethodModel;
import freemarker.template.TemplateModelException;

import java.util.List;

/**
 * Created by xiaolitong on 2017/6/19.
 * 获取随机数位数
 */

public class FreemarkMethod implements TemplateMethodModel {
    @Override
    public Object exec(List list) throws TemplateModelException {
        String random= (String) list.get(0);
        int num = (int) list.get(1);//获取位数
        return random.substring(0,num);
    }
}
