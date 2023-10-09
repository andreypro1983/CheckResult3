package ru.gb.model.animal.baggage;

import ru.gb.model.animal.Animal;

import java.util.Date;

public abstract class BaggageAnimal extends Animal {
    private int cargo;

    public BaggageAnimal(String name, Date birthday, int weight) {
        super(name, birthday);
        this.cargo = weight;
    }

    public int getCargo() {
        return cargo;
    }
}
