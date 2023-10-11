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
import ru.gb.model.handler.Loadable;
import ru.gb.model.handler.Saveble;
import ru.gb.ui.Console;

import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

public class Service {
    private static final String DATE_FORMAT = "dd.MM.yyyy";
    private Console console;
    private Saveble saveble;
    private Loadable loadable;

    private static final String PATH = "src/main/java/ru/gb/model/db/animalsList.txt";

    AnimalsList animalsList;

    public Service(Console console,Saveble saveble, Loadable loadable) {
        this.console = console;
        this.animalsList = new AnimalsList();
        this.saveble = saveble;
        this.loadable = loadable;
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

    public void load() throws IOException {
        if (loadable != null) {
            this.animalsList =  (AnimalsList) loadable.load(PATH);
        }
    }

    public void save() throws IOException {
        if (saveble != null) {
            saveble.save(PATH, animalsList);
        }
    }


    private void addAnimalToAnimalsList (Animal animal){
//        animal.setId(counter.getId());
//        counter.add();
        animalsList.addAnimal(animal);
    }

    public String showDogs(){
        String info =animalsList.showDogs();
        return info.isEmpty() ? "Информация не найдена\n": info;
    }

    public String showCats(){
        String info =animalsList.showCats();
        return info.isEmpty() ? "Информация не найдена\n": info;
    }

    public String showHamsters(){
        String info =animalsList.showHamsters();
        return info.isEmpty() ? "Информация не найдена\n": info;
    }

    public String showHorses(){
        String info =animalsList.showHorses();
        return info.isEmpty() ? "Информация не найдена\n": info;
    }

    public String showDonkeys(){
        String info =animalsList.showDonkeys();
        return info.isEmpty() ? "Информация не найдена\n": info;
    }
    public String showCamels(){
        String info =animalsList.showCamels();
        return info.isEmpty() ? "Информация не найдена\n": info;
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
