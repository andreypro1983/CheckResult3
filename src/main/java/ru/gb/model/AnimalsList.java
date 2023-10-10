package ru.gb.model;

import ru.gb.model.animal.Animal;
import ru.gb.model.animal.baggage.Camel;
import ru.gb.model.animal.baggage.Donkey;
import ru.gb.model.animal.baggage.Horse;
import ru.gb.model.animal.home.Cat;
import ru.gb.model.animal.home.Dog;
import ru.gb.model.animal.home.Hamster;

import java.util.ArrayList;

public class AnimalsList {
    private ArrayList<Animal> animals;

    public AnimalsList(){
        this.animals = new ArrayList<Animal>();
    }


    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public String showDogs(){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (Animal animal: animals) {
            if (animal instanceof Dog){
                Dog dog = (Dog)animal;
                sb.append(count+1).append(". ");
                sb.append(dog.getInfo());
                sb.append("\n");
                count++;
            }
        }
        return sb.toString();
    }

    public String showCats(){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (Animal animal: animals) {
            if (animal instanceof Cat){
                Cat cat = (Cat)animal;
                sb.append(count+1).append(". ");
                sb.append(cat.getInfo());
                sb.append("\n");
                count++;
            }
        }
        return sb.toString();
    }

    public String showHamsters(){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (Animal animal: animals) {
            if (animal instanceof Hamster){
                Hamster hamster = (Hamster)animal;
                sb.append(count+1).append(". ");
                sb.append(hamster.getInfo());
                sb.append("\n");
                count++;
            }
        }
        return sb.toString();
    }

    public String showHorses(){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (Animal animal: animals) {
            if (animal instanceof Horse){
                Horse horse = (Horse)animal;
                sb.append(count+1).append(". ");
                sb.append(horse.getInfo());
                sb.append("\n");
                count++;
            }
        }
        return sb.toString();
    }

    public String showDonkeys(){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (Animal animal: animals) {
            if (animal instanceof Donkey){
                Donkey donkey = (Donkey)animal;
                sb.append(count+1).append(". ");
                sb.append(donkey.getInfo());
                sb.append("\n");
                count++;
            }
        }
        return sb.toString();
    }

    public String showCamels(){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (Animal animal: animals) {
            if (animal instanceof Camel){
                Camel camel = (Camel)animal;
                sb.append(count+1).append(". ");
                sb.append(camel.getInfo());
                sb.append("\n");
                count++;
            }
        }
        return sb.toString();
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }
//
//    public void deleteAnimal(Animal animal){
//
//    }



}
