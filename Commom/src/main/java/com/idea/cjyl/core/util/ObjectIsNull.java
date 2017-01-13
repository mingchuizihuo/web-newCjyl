package com.idea.cjyl.core.util;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by 10238 on 2016/10/11.
 */
public class ObjectIsNull {


    public static boolean isNUll(Object object,String[] propertys) throws InvocationTargetException, IllegalAccessException {
        Class<?> objectClass = (Class) object.getClass();


            for (String property:propertys
                 ) {

                Method[] methods = objectClass.getMethods();
                for (Method m : methods
                        ) {

                    if (m.getName().startsWith("get")) {
                        if (m.getName().toString().equals("get" + property)) {

                            if (m.invoke(object)==null|| m.invoke(object).equals("") || m.invoke(object)==(Integer)0 || m.invoke(object)==(Double)0.0 ) {

                                return false;
                            }

                        }
                    }
                }

            }

                return true;


    }

}
