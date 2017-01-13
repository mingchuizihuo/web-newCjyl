package com.idea.cjyl.core.util;

import java.util.Date;

public class PictureAddressCreate {
    public static String pictureAddressCreate(Long id){
        Date nowDate = new Date();
        DateConversion.dateToString(nowDate);
        return DateConversion.dateToString(nowDate)+id;
    }
}