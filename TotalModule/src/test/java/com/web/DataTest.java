package com.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by xiao on 2016/12/14.
 */
public class DataTest {
    public static void main(String[] args) throws ParseException {

        Calendar cal_1=Calendar.getInstance();

        Date date = new Date();
                Long dateLong = date.getTime();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Long aaa = simpleDateFormat.parse("2014-02-01").getTime();


        System.out.println((dateLong-aaa)/3600/24/365/1000);


    }
}
