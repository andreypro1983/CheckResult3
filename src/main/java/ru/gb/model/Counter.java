package ru.gb.model;


import java.io.Serializable;

public class Counter implements Serializable {
    private int id;

    public Counter(){
        id=0;
    }
    public void add(){
        id++;
    }

    public int getId() {
        return id;
    }

}

