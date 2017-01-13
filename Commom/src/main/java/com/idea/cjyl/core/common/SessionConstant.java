package com.idea.cjyl.core.common;

public class SessionConstant {

    public static final String	SESSION_USER_BEAN	= "userBean";

    public enum PictureType{
        STAFFHEAD((byte)1),
        SERVICEPICTURE((byte)2),
        SERVICEPAGEPCITURE((byte)3),
        DISHESPICTURE((byte)4);
        public final byte key;
        PictureType(byte key){
            this.key = key;
        }

    }




}