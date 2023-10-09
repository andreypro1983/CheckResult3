package ru.gb.model.animal.home;

import ru.gb.model.animal.Animal;

import java.util.Date;

public abstract class HomeAnimal extends Animal {
    public HomeAnimal(String name, Date birthday) {
        super(name, birthday);
    }

}
