package ru.gb.animal;

import java.util.Date;

public abstract class Animal {
    private int id;
    private String name;
    private Date birthday;



    public  Animal (String name, Date birthday){
        this.id =0;
        this.name=name;
        this.birthday=birthday;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }
}
