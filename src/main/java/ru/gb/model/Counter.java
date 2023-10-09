package ru.gb.model;


public class Counter {
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

