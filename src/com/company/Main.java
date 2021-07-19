package com.company;


import com.company.solved.Problem14;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        Problem14 p = new Problem14();
        int[][] cinemagrid = p.getCinemagrid();
        p.start(-5,5,cinemagrid);
        p.start(5,5,cinemagrid);
    }



    }


