package com.idea.cjyl.core.util;

import freemarker.template.TemplateMethodModel;
import freemarker.template.TemplateModelException;

import java.util.List;

/**
 * Created by xiaolitong on 2017/6/19.
 * 银行卡隐藏位数
 */
public class FreemarkMethodBankCard implements TemplateMethodModel {
    @Override
    public Object exec(List list) throws TemplateModelException {
        String bankNum = (String) list.get(0);//银行卡
        int startNum = (int) list.get(1);//开始位数；
        int sparkNum = (int) list.get(2);//星星个数；
        int endNum = (int) list.get(3);//尾部个数；


        return bankNum.substring(0,sparkNum);
    }
}
