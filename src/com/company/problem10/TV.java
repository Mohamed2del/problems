package com.company.problem10;

public class TV implements Machine{

    String name;

    public TV() {
        this.name = "Tv";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TV";
    }
}
