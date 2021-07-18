package com.company;


import com.company.solved.Problem5.Person;
import com.company.solved.Problem5.Problem5;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        Problem5 p = new Problem5();
        ArrayList<Person> persons = new ArrayList<>();
        p.addObjects(persons);
        Map m = p.arrayListtohash(persons);

        m = p.sortnew(m);


    }



    }


