package com.company.problem10;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Problem10 {



    public Object f (String className ) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        Constructor<?> c = Class.forName("com.company.problem10."+childClass).getDeclaredConstructor(constructorParam.getClass());
//
//        c.setAccessible(true);
//        c.newInstance(new Object[]{constructorParam});
//
////        Class s = Class.forName("com.company.problem10."+childClass);
//        Object z = s.getDeclaredConstructor(constructorParam.getClass()).newInstance(constructorParam);


        Class<?> clazz = Class.forName("com.company.problem10."+className);
        Class[] param = null;
        Constructor<?> constructor = clazz.getDeclaredConstructor(param);
        Object instance = constructor.newInstance();

        return instance;
    }



}
