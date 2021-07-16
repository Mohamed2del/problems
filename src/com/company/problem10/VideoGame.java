package com.company.problem10;

public class VideoGame implements Machine{
    String name;
    public VideoGame() {
        name = "VideoGame";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "VideoGame";
    }
}
