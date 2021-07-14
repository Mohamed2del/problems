package com.company;

/*
Write a program to execute in parallel N calls to a method which sleep 1 second, for
example if N is 10 so method will print any string 10 times in one second
 */
public class Problem11  extends Thread {


    public void printAnyString()  throws InterruptedException  {
        System.out.println("Any String");
        Thread.sleep(1000);
    }

    public void run(){
        try {
            task(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void task(int n) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            printAnyString();
        }
    }


}
