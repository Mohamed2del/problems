package com.company.problem10;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Problem10 {



    public Constructor f (String className , Class[] parametersClasses) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        Constructor<?> c = Class.forName("com.company.problem10."+childClass).getDeclaredConstructor(constructorParam.getClass());
//
//        c.setAccessible(true);
//        c.newInstance(new Object[]{constructorParam});
//
////        Class s = Class.forName("com.company.problem10."+childClass);
//        Object z = s.getDeclaredConstructor(constructorParam.getClass()).newInstance(constructorParam);


        Class classToInstantiate = Class.forName("com.company.problem10."+className);
        Constructor<?> theClassInstructor = classToInstantiate.getDeclaredConstructor(parametersClasses);
        Object instance = theClassInstructor.newInstance("Computer");

        return theClassInstructor;
    }



}
