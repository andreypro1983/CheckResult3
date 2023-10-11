package ru.gb.model.animal;

import ru.gb.model.animal.command.Commands;

import java.io.Serializable;
import java.util.Date;

public abstract class Animal implements Serializable {
    private int id;
    private String name;
    private Date birthday;

    private Commands commands;



    public  Animal (String name, Date birthday){
        this.id =0;
        this.name=name;
        this.birthday=birthday;
        this.commands = new Commands();
    }
    public int getId() {return  id;}
    public Date getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public Commands getCommands() {
        return commands;
    }

    public abstract String getInfo();

    public abstract String getNumberAndAnimalInfo(int count);

    public void setId(int id) {
        this.id = id;
    }
}
