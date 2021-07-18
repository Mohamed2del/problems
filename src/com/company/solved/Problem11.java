package com.company.solved;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
Write a program to execute in parallel N calls to a method which sleep 1 second, for
example if N is 10 so method will print any string 10 times in one second
 */
public class Problem11 implements Runnable {
    int n ;
    ExecutorService executorService = Executors.newFixedThreadPool(10);

    public Problem11(int n){
        this.n = n;
    }

    Runnable task = () -> {
        System.out.println("Executing Task1 inside : " + Thread.currentThread().getName());
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            throw new IllegalStateException(ex);
        }
    };

    public List<Runnable> listTasks(int n){
        List tasks = new ArrayList<Runnable>();
        for (int i = 0; i < n ; i++) {
            tasks.add(executorService.submit(task));
        }
        return tasks;
    }


    @Override
    public void run() {
        listTasks(n);
        executorService.shutdown();

    }
}

