package com.idea.cjyl.core.util;

import org.springframework.core.convert.converter.Converter;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat dataFormat2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        dateFormat.setLenient(false);dataFormat2.setLenient(false);
        try {

            if(source.indexOf("年")!=-1){
                return dataFormat2.parse(source.replace("\"",""));
            }
            return dateFormat.parse(source);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}