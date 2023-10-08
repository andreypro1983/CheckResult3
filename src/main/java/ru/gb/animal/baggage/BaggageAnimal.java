package ru.gb.animal.baggage;

import ru.gb.animal.Animal;

import java.util.Date;

public abstract class BaggageAnimal extends Animal {
    private int weight;

    public BaggageAnimal(String name, Date birthday, int weight) {
        super(name, birthday);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
