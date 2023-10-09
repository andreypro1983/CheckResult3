package ru.gb.ui;

import ru.gb.model.Service;
import ru.gb.model.exeption.InputUserDataExeption;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Console {
    private Menu menu;
    private Service service;

    private boolean isWork = true;

    private static final String addHomeAnimalMessage = "Введите <Имя> <Дату_рождения> животного через пробел:";
    private static final String addBaggageAnimalMessage = "Введите <Имя> <Дату_рождения> <Грузоподъемность> животного через пробел:";

    public Console() {
        this.menu = new Menu();
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void start(){
        while(isWork){
            print(menu.mainMenu());
            try {
                int inputValue = inputFromUser(4);
                switch (inputValue) {
                    case 1:
                        addAnimal();
                        break;
                    case 2:
                        showAnimalCommands();
                        break;
                    case 3:
                        addCommandToAnimal();
                        break;
                    case 4:
                        exit();
                        break;
                }
            }catch (InputMismatchException e) {
                print(e.getMessage() + "\n");
            }catch (RuntimeException e) {
                print(e.getMessage() + "\n");
            } catch (InputUserDataExeption e) {
                print(e.getMessage() + ". Вы ввели " + e.getUserCount() + " из " + e.getRightCount() + "\n"
                        + "\nПовторите попытку\n");
            } catch (DataFormatException e) {
                System.out.println(e.getMessage() + "\nПовторите попытку\n");
            }
        }
    }

    private void print(String text){
        System.out.println(text);
    }

    private void exit() {
        isWork = false;
        print("\nДо свидания!\n");
    }

    private void addAnimal() throws RuntimeException,InputMismatchException, InputUserDataExeption, DataFormatException {
        String newAnimal;
        print ("Добавление нового животного");
        print(menu.animalMenu());
        int inputValue = inputFromUser(6);
        switch (inputValue){
            case 1:
                newAnimal = inputNewAnimal(addHomeAnimalMessage);
                print(service.addAnimal(newAnimal,"dog")?"Животное успешно добавлено\n":"Не удалось добавить животное\n");
                break;
            case 2:
                newAnimal = inputNewAnimal(addHomeAnimalMessage);
                print(service.addAnimal(newAnimal,"cat")?"Животное успешно добавлено\n":"Не удалось добавить животное\n");
                break;
            case 3:
                newAnimal = inputNewAnimal(addHomeAnimalMessage);
                print(service.addAnimal(newAnimal,"hamster")?"Животное успешно добавлено\n":"Не удалось добавить животное\n");
                break;
            case 4:
                newAnimal = inputNewAnimal(addBaggageAnimalMessage);
                print(service.addAnimal(newAnimal,"horse")?"Животное успешно добавлено\n":"Не удалось добавить животное\n");
                break;
            case 5:
                newAnimal = inputNewAnimal(addBaggageAnimalMessage);
                print(service.addAnimal(newAnimal,"donkey")?"Животное успешно добавлено\n":"Не удалось добавить животное\n");
                break;
            case 6:
                newAnimal = inputNewAnimal(addBaggageAnimalMessage);
                print(service.addAnimal(newAnimal,"camel")?"Животное успешно добавлено\n":"Не удалось добавить животное\n");
                break;

        }



    }

//    private String inputHomeAnimals() throws NoSuchElementException{
//        String newAnimalInfo = inputString(addHomeAnimalMessage);
//        return newAnimalInfo;
//    }

    private String inputNewAnimal(String message) throws NoSuchElementException {
        print(message);
        Scanner sc = new Scanner(System.in,"Cp866");
        String inputName = sc.nextLine();
        if (inputName.isEmpty()){
            throw new NoSuchElementException("Данные не были введены");
        }
        return inputName;
    }




    private void showAnimalCommands(){

    }

    private void addCommandToAnimal(){

    }

//    private String inputNewAnimal(){
//        Scanner sc = new Scanner(System.in, "Cp866");
//        int
//    }


    private int inputFromUser(int maxMenuValue) throws RuntimeException,InputMismatchException{
        Scanner sc = new Scanner(System.in, "Cp866");
        int inputData;
        try {
            System.out.println("Выберите пункт меню:");
            inputData = sc.nextInt();
            if (inputData > maxMenuValue || inputData < 1) {

                throw new RuntimeException("Необходимо выбрать пункт от 1 до "+maxMenuValue);
            }
        }
        catch (InputMismatchException e) {
            throw new InputMismatchException("Введеное значение не является числом");
        }
        return inputData;
    }
}
