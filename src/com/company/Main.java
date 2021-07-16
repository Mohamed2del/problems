package com.company;


import com.company.problem10.Machine;
import com.company.problem10.Problem10;
import com.company.solved.Problem4;

import java.lang.constant.Constable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
//
//
//        Problem10 p = new Problem10();
//        Constructor objectConstuctor = p.f("Computer",new Class[]{String.class});
//
//
//        Object instance = objectConstuctor.newInstance("Computer");
//
//        System.out.println(instance.getClass().getName());
        String s ;
        Problem10 p = new Problem10();
        Object object = p.f("VideoGame");

        Machine machine =(Machine) object;
        System.out.println(machine.getName());
//        Machine machine = (Machine)object;
//        machine.toString();
//        System.out.println(object.getClass().getName());

        }



    }


