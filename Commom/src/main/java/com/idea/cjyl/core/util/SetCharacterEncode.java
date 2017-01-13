package com.idea.cjyl.core.util;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SetCharacterEncode {
    public static void setCharacter(HttpServletRequest request,HttpServletResponse response){
        try {
            request.setCharacterEncoding("utf-8");
            response.setContentType("text/html;charset=utf-8");
            response.setHeader("Cache-Control", "no-cache");
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  //这里不设置编码会有乱码

    }
}