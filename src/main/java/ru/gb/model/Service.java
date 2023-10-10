package ru.gb.model;

import ru.gb.model.animal.Animal;
import ru.gb.model.animal.baggage.Camel;
import ru.gb.model.animal.baggage.Donkey;
import ru.gb.model.animal.baggage.Horse;
import ru.gb.model.animal.home.Cat;
import ru.gb.model.animal.home.Dog;
import ru.gb.model.animal.home.Hamster;
import ru.gb.model.exeption.InputUserDataExeption;
import ru.gb.model.exeption.NoSuchInfoExeption;
import ru.gb.ui.Console;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.zip.DataFormatException;

public class Service {
    private static final String DATE_FORMAT = "dd.MM.yyyy";
    Console console;
    Counter counter;

    AnimalsList animalsList;

    public Service(Console console) {
        this.console = console;
        this.animalsList = new AnimalsList();
        this.counter = new Counter();
        console.setService(this);
    }

    public boolean addAnimal(String inputData,String typeAnimal) throws InputUserDataExeption,DataFormatException,NumberFormatException{
        String[] animalData =  parseAnimalData(inputData);
        Animal newAnimal;
        switch(typeAnimal){
            case "dog":
                if(checkCountInputElements(animalData,2)){
                    Date birthday = parseAnimalBirthday(animalData[1]);
                    newAnimal =new Dog(animalData[0],birthday);
                    addAnimalToAnimalsList(newAnimal);
                }
                break;
            case "cat":
                if(checkCountInputElements(animalData,2)){
                    Date birthday = parseAnimalBirthday(animalData[1]);
                    newAnimal =new Cat(animalData[0],birthday);
                    addAnimalToAnimalsList(newAnimal);
                }
                break;
            case "hamster":
                if(checkCountInputElements(animalData,2)){
                    Date birthday = parseAnimalBirthday(animalData[1]);
                    newAnimal =new Hamster(animalData[0],birthday);
                    addAnimalToAnimalsList(newAnimal);
                }
                break;
            case "horse":
                if(checkCountInputElements(animalData,3)){
                    Date birthday = parseAnimalBirthday(animalData[1]);
                    int cargo = parseAnimalCargo(animalData[2]);
                    newAnimal = new Horse(animalData[0],birthday,cargo);
                    addAnimalToAnimalsList(newAnimal);
                }
                break;
            case "donkey":
                if(checkCountInputElements(animalData,3)){
                    Date birthday = parseAnimalBirthday(animalData[1]);
                    int cargo = parseAnimalCargo(animalData[2]);
                    newAnimal = new Donkey(animalData[0],birthday,cargo);
                    addAnimalToAnimalsList(newAnimal);
                }
                break;
            case "camel":
                if(checkCountInputElements(animalData,3)){
                    Date birthday = parseAnimalBirthday(animalData[1]);
                    int cargo = parseAnimalCargo(animalData[2]);
                    newAnimal = new Camel(animalData[0],birthday,cargo);
                    addAnimalToAnimalsList(newAnimal);
                }
                break;

        }
   return true;
    }

    private void addAnimalToAnimalsList (Animal animal){
        animal.setId(counter.getId());
        counter.add();
        animalsList.addAnimal(animal);
    }

    public String showDogs(){
        return animalsList.showDogs().isEmpty() ? "\nИнформация не найдена\n": animalsList.showDogs();
    }

    public String showCats(){
        return animalsList.showCats().isEmpty() ? "\nИнформация не найдена\n": animalsList.showCats();
    }

    public String showHamsters(){
        return animalsList.showHamsters().isEmpty() ? "\nИнформация не найдена\n": animalsList.showHamsters();
    }

    public String showHorses(){
        return animalsList.showHorses().isEmpty() ? "\nИнформация не найдена\n": animalsList.showHorses();
    }

    public String showDonkeys(){
        return animalsList.showDonkeys().isEmpty() ? "\nИнформация не найдена\n": animalsList.showDonkeys();
    }
    public String showCamels(){
        return animalsList.showCamels().isEmpty() ? "\nИнформация не найдена\n": animalsList.showCamels();
    }

    public String getAnimalsByName(String animalName) throws NoSuchInfoExeption {
        return animalsList.getAnimalsInfoByName(animalName);
    }

    public int getCountAnimalsByName(String animalName){
        return animalsList.getCountAnimalsByName(animalName);
    }

    public boolean addCommandToAnimal(String animalName,int animalNumber,int commandNumber){
        return animalsList.addCommandToAnimal(animalName,animalNumber,commandNumber);
    }

    private String[] parseAnimalData(String inputData){
        return inputData.split(" ");
    }

    private boolean checkCountInputElements(String[] inputData, int rightCount) throws InputUserDataExeption{
        boolean isCorrect = true;
        if (inputData.length < rightCount) {
            isCorrect = false;
            throw new InputUserDataExeption("Введено меньше данных чем требовалось",inputData.length,rightCount);
        } else if (inputData.length > rightCount) {
            isCorrect = false;
            throw new InputUserDataExeption("Введено меньше данных чем требовалось",inputData.length,rightCount);
        } else {
            return isCorrect;
        }
    }



    private Date parseAnimalBirthday(String birthday) throws DataFormatException{
        Date parseDate;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
            sdf.setLenient(false);
            parseDate = sdf.parse(birthday);
        } catch (Exception e) {
            parseDate = null;
            throw new DataFormatException("Введенная дата не соответствует формату " + DATE_FORMAT.toLowerCase());
        }
        return parseDate;
    }

    private int parseAnimalCargo(String cargo) throws NumberFormatException {
        return Integer.parseInt(cargo);
    }


}
