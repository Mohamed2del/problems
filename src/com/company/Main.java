package com.company;

import com.company.solved.Problem5.Person;
import com.company.solved.Problem5.Problem5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

      Problem9 p = new Problem9();
      p.sql("select FIRST_NAME,MIDDLE_NAME,PHONE,AGE,ADDRESS from USER where STATUS=0 and/or AGE>21");
    }
}
