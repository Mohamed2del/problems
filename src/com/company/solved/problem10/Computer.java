package com.company.solved.problem10;

public class Computer implements Machine {
    String name ;


    public Computer() {
        this.name="Computer";
    }



    @Override
    public String getName() {
        return name;
    }

    public String POg(){
        return "KOS";
    }
    @Override
    public String toString() {
        return "Computer";
    }
}
