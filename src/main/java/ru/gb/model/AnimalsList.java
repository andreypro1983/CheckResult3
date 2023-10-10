package ru.gb.model;

import ru.gb.model.animal.Animal;
import ru.gb.model.animal.baggage.Camel;
import ru.gb.model.animal.baggage.Donkey;
import ru.gb.model.animal.baggage.Horse;
import ru.gb.model.animal.command.Command;
import ru.gb.model.animal.command.Commands;
import ru.gb.model.animal.home.Cat;
import ru.gb.model.animal.home.Dog;
import ru.gb.model.animal.home.Hamster;
import ru.gb.model.exeption.NoSuchInfoExeption;

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





    public String getAnimalsInfoByName(String animalName) throws NoSuchInfoExeption{
        ArrayList<Animal> animalsList = getAnimalsByName(animalName);
        if(!animalsList.isEmpty()){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (Animal animal: animalsList) {
            if (animal instanceof Dog) {
                sb.append(((Dog)animal).getNumberAndAnimalInfo(count));
                count++;
            } else if (animal instanceof Cat) {
                sb.append(((Cat)animal).getNumberAndAnimalInfo(count));
                count++;
            }else if (animal instanceof Hamster) {
                sb.append(((Hamster)animal).getNumberAndAnimalInfo(count));
                count++;
            }else if (animal instanceof Horse) {
                sb.append(((Horse)animal).getNumberAndAnimalInfo(count));
                count++;
            }else if (animal instanceof Donkey) {
                sb.append(((Donkey)animal).getNumberAndAnimalInfo(count));
                count++;
            }else if (animal instanceof Camel) {
                sb.append(((Camel) animal).getNumberAndAnimalInfo(count));
                count++;
            }
        }
            return sb.toString();
        }
        else throw new NoSuchInfoExeption("Информация по животным с именем "+animalName+" не найдена");
//        {return null;}
    }

    public int getCountAnimalsByName(String animalName){
        return getAnimalsByName(animalName).size();
    }

    public boolean addCommandToAnimal(String animalName,int animalNumber,int commandNumber){
        Commands commands = getAnimalsByName(animalName).get(animalNumber).getCommands();
        ArrayList<Command> animalCommands = commands.getArrayCommands();
        Command newCommand = getCommandByNumber(commandNumber-1);
        if (!animalCommands.contains(newCommand)){
            commands.addCommand(newCommand);
            return true;
        }else {return false;}
    }


    private Command getCommandByNumber(int number){
        Command valueCommand = null;
        for (Command command:Command.values()) {
            if (command.ordinal() == number) {
                valueCommand = command;
                break;
            }
        }
     return  valueCommand;
    }

    private ArrayList<Animal> getAnimalsByName(String animalName) {
        ArrayList<Animal> animalsList = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getName().equals(animalName)) {
                animalsList.add(animal);
            }
        }
        return animalsList;
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }
//
//    public void deleteAnimal(Animal animal){
//
//    }



}
