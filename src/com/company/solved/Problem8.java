package com.company.solved;

public class Problem8 {

    //Write a program to print from 1 to 100 without for loop or while

    public void oneToHundred(int i){
        if(i > 100)
            return;
        System.out.println(i++);
        oneToHundred(i);

    }

}
