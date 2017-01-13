package com.idea.cjyl.core.util;

import com.alibaba.druid.sql.visitor.functions.Char;

/**
 * Created by xiao on 2016/12/7.
 */
public class HumpAndCapital {

    public static String hump2Capital(String hump){
        String capital ="";
        char[] charArray = hump.toCharArray();
        String[] charStr = new String[charArray.length];
        int count=0;
        for (char c :charArray){
            if(c>=65&&c<=90){
                int a = c+32;
                c=(char)a;
                if(count!=0){
                    charStr[count] = "_"+c;
                }else{
                    charStr[count] = c+"";
                }

            }else{
                charStr[count] = c+"";
            }


            capital+=charStr[count];
            count++;
        }

        return capital;
    }

    public static void main(String[] args){

        System.out.println(hump2Capital("dsaDsad"));
    }

    public static String  capital2Hump(String capital){
        String hump = null;
        return hump;
    }
}
