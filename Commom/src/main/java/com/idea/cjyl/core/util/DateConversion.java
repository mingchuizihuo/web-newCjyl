package com.idea.cjyl.core.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateConversion {
    //获取年龄
    public static Integer getAge(Date birthdate) {
        Date nowDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        String nowDateYear = dateFormat.format(nowDate);
        String birthdateStr = dateFormat.format(birthdate);
        Integer age = Integer.parseInt(nowDateYear) - Integer.parseInt(birthdateStr);
        return age;
    }

    //格式化生日
    public static String getBirthday(Date birthdate) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        String birthdateStr = dateFormat.format(birthdate);
        return birthdateStr;
    }

    //字符串生日转时间
    public static Date getBirthdayDate(String birthDay) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birth = dateFormat.parse(birthDay);
        return birth;
    }

    //计算分钟差
    public static Integer calculateMinutePoor(Date minute) {
        Date nowDate = new Date();

        int poor = (int) (nowDate.getTime() - minute.getTime()) / 1000 / 60;
        if (poor < 20 && poor > 0) {
            return 1;
        } else if (poor > 20 && poor < 24) {
            return 2;
        } else if (poor > 24 && poor < 30) {
            return 3;
        } else if (poor > 30 && poor < 40) {
            return 4;
        } else {
            return 5;
        }
    }

    //时间转字符串
    public static String dateToString(Date nowDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssms");
        String dateString = dateFormat.format(nowDate);
        return dateString;
    }

    //计算消息时间间隔
    public static String messageMinutePoor(Date date) {
        Date nowDate = new Date();

        int poor = (int) (nowDate.getTime() - date.getTime()) / 1000 / 60;
        if (poor > 0 && poor < 5) {
            return "刚刚";
        } else if (poor < 60) {
            return poor + "分钟前";
        } else {
            return poor / 60 + "小时前";
        }
    }

    public static Date[] getWeekByYearWeek(Date startDate, Date endDate) {
        Date[] result = new Date[7];

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");



        Calendar cl = Calendar.getInstance();

        cl.setTime(startDate);


        Date mdate = cl.getTime();

        Date fdate;

        for (int a = 0; a < 7; a++) {
            fdate = new Date();
            fdate.setTime(mdate.getTime() + (a * 24 * 3600000));
            result[a]=fdate;

        }
        return result;

    }
}
