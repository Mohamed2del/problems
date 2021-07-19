package com.company;


import com.company.solved.Problem5.Person;
import com.company.solved.Problem5.Problem5;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        Problem14 p = new Problem14();
        int[][] cinemagrid = p.getCinemagrid();
        System.out.println(cinemagrid[5][5]);
        p.start(5,5,cinemagrid);
        p.start(5,5,cinemagrid);
    }



    }


