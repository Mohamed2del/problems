package com.company;

import com.company.solved.Problem5.Person;
import com.company.solved.Problem5.Problem5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Problem5 p = new Problem5();
        ArrayList<Person> persons = new ArrayList<>();
        p.addObjects(persons);
        p.ascendingSort(persons);

        p.printlist(persons);

        System.out.println("============================ \n");
        ArrayList<Person> persons2 = new ArrayList<>();
        p.addObjects(persons2);
        p.descendingOrder(persons2);
        p.printlist(persons2);
    }
}
