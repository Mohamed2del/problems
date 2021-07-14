package com.company;

import com.company.solved.Problem9;

public class Main {

    public static void main(String[] args) {
	// write your code here

      Problem9 p = new Problem9();
      p.sql("select FIRST_NAME,MIDDLE_NAME,PHONE,AGE,ADDRESS from USER where STATUS=0 and/or AGE>21");
    }
}
