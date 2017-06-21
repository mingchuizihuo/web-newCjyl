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
        int startNum = Integer.parseInt(list.get(1).toString());//开始位数；
        int sparkNum = Integer.parseInt(list.get(2).toString());//星星个数；
        int endNum = Integer.parseInt(list.get(3).toString());//尾部个数；
        String sparkStr = "";
        for (int i = 0; i <sparkNum ; i++) {
            sparkStr+="*";
        }

        return bankNum.substring(0,startNum)+sparkStr+bankNum.substring(bankNum.length()-endNum,bankNum.length());
    }
}
