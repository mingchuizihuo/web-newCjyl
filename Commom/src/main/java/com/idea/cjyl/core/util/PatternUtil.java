/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.idea.cjyl.core.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <P>
 * Description:TODO
 * </p>
 * @author idea01
 * @version 1.0
 * @Date 2016年4月14日下午4:50:24
 */
public class PatternUtil {

    /**
     *
     * <P>
     * Description:验证邮箱
     * </p>
     * @author idea01
     * @version 1.0
     * @Date 2016年4月14日下午4:52:29
     * @param email
     * @return
     */
    public static boolean verifyEmail(String email){

        Pattern pattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    /**
     *
     * <P>
     * Description:验证手机号
     * </p>
     * @author idea01
     * @version 1.0
     * @Date 2016年4月14日下午4:54:00
     * @param tel
     * @return
     */
    public static boolean verifyTel(String tel){
        Pattern pattern = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
        Matcher matcher = pattern.matcher(tel);
        return matcher.matches();

    }
    /**
     *
     * <P>
     * Description:验证非法字符
     * </p>
     * @author idea01
     * @version 1.0
     * @Date 2016年4月14日下午4:57:25
     * @param userName
     * @return
     */
    public static boolean verifyUserName(String userName){
        String regEx="[`~!@#$%^&*()+=|{}':;',//[//].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
        Pattern   pattern   =   Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(userName);
        return matcher.matches();
    }
}

