package ru.gb.ui;

import ru.gb.model.Service;
import ru.gb.model.exeption.InputUserDataExeption;
import ru.gb.model.exeption.NoSuchInfoExeption;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Console {
    private Menu menu;
    private Service service;

    private boolean isWork = true;

    private static final String ADD_HOME_ANIMAL_MESSAGE = "\nВведите <Имя> <Дату_рождения> животного через пробел:";
    private static final String ADD_BAGGAGE_ANIMAL_MESSAGE = "\nВведите <Имя> <Дату_рождения> <Грузоподъемность> животного через пробел:";

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
                int inputValue = inputFromUser(menu.getCountMainMenu());
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
                        save();
                        break;
                    case 5:
                        load();
                        break;
                    case 6:
                        exit();
                        break;
                }
            }catch(NoSuchInfoExeption e){
                print("\n"+e.getMessage() + "\n");
            }catch (InputMismatchException e) {
                print("\n"+e.getMessage() + "\n");
            }catch (NoSuchElementException e) {
                print("\n"+e.getMessage() + "\n");
            } catch (InputUserDataExeption e) {
                print("\n"+e.getMessage() + ". Вы ввели " + e.getUserCount() + " из " + e.getRightCount() + "\n"
                        + "\nПовторите попытку\n");
            } catch (DataFormatException e) {
                print("\n"+e.getMessage() + "\nПовторите попытку\n");
            }catch (IOException e) {
                print("\n"+e.getMessage() + "\nПовторите попытку\n");
            }
        }
    }

    private void print(String text){
        System.out.println(text);
    }

    private void save() throws IOException {
        print("\nСохранение текущего списка животных:\n");
        service.save();
        print("Сохранение успешно завершено\n");
        }
    private void load() throws IOException {
        print("\nЗагрузка сохраненного списка животных:\n");
        service.load();
        print("Загрузка успешно завершена\n");
    }


    private void exit() {
        isWork = false;
        print("\nДо свидания!\n");
    }

    private void addAnimal() throws InputMismatchException,NoSuchElementException, InputUserDataExeption, DataFormatException {
        String newAnimal;
        print ("\nДобавление нового животного");
        print(menu.animalMenu());
        int inputValue = inputFromUser(menu.getCountAnimalMenu());
        switch (inputValue){
            case 1:
                newAnimal = inputTextFromUser(ADD_HOME_ANIMAL_MESSAGE);
                print(service.addAnimal(newAnimal,"dog")?"\nЖивотное успешно добавлено\n":"\nНе удалось добавить животное\n");
                break;
            case 2:
                newAnimal = inputTextFromUser(ADD_HOME_ANIMAL_MESSAGE);
                print(service.addAnimal(newAnimal,"cat")?"\nЖивотное успешно добавлено\n":"\nНе удалось добавить животное\n");
                break;
            case 3:
                newAnimal = inputTextFromUser(ADD_HOME_ANIMAL_MESSAGE);
                print(service.addAnimal(newAnimal,"hamster")?"\nЖивотное успешно добавлено\n":"\nНе удалось добавить животное\n");
                break;
            case 4:
                newAnimal = inputTextFromUser(ADD_BAGGAGE_ANIMAL_MESSAGE);
                print(service.addAnimal(newAnimal,"horse")?"\nЖивотное успешно добавлено\n":"\nНе удалось добавить животное\n");
                break;
            case 5:
                newAnimal = inputTextFromUser(ADD_BAGGAGE_ANIMAL_MESSAGE);
                print(service.addAnimal(newAnimal,"donkey")?"\nЖивотное успешно добавлено\n":"\nНе удалось добавить животное\n");
                break;
            case 6:
                newAnimal = inputTextFromUser(ADD_BAGGAGE_ANIMAL_MESSAGE);
                print(service.addAnimal(newAnimal,"camel")?"\nЖивотное успешно добавлено\n":"\nНе удалось добавить животное\n");
                break;

        }
    }


    private String inputTextFromUser(String message) throws NoSuchElementException {
        print(message);
        Scanner sc = new Scanner(System.in);
        String inputName = sc.nextLine();
        if (inputName.isEmpty()){
            throw new NoSuchElementException("Данные не были введены");
        }
        return inputName;
    }




    private void showAnimalCommands() throws NoSuchElementException,InputMismatchException{
        print ("\nОтображение списка команд животного");
        print(menu.animalMenu());
        int inputValue = inputFromUser(menu.getCountAnimalMenu());
        print("\nРезультат:");
        switch (inputValue){
            case 1:
                print(service.showDogs());
                break;
            case 2:
                print(service.showCats());
                break;
            case 3:
                print(service.showHamsters());
                break;
            case 4:
                print(service.showHorses());
                break;
            case 5:
                print(service.showDonkeys());
                break;
            case 6:
                print(service.showCamels());
                break;
        }

    }

    private void addCommandToAnimal() throws NoSuchElementException, NoSuchInfoExeption,InputMismatchException {
        int animalNumber;
        print ("\nОбучить животное новой команде\n");
        String animalName = inputTextFromUser("Введите имя животного:");
        int getCountAnimals =service.getCountAnimalsByName(animalName);
        print("\nРезультаты поиска:");
        print(service.getAnimalsByName(animalName));
        if(getCountAnimals > 1){
            animalNumber =inputFromUser(getCountAnimals)-1;
        }else{animalNumber = 0;}
        print(menu.commandMenu());
        int commandNumber =inputFromUser(menu.getCountCommandMenu());
        print(service.addCommandToAnimal(animalName,animalNumber,commandNumber)?"\nКоманда успешно добавлена\n": "\nТакая команда уже существует\n");
    }


    private int inputFromUser(int maxMenuValue) throws NoSuchElementException,InputMismatchException{
        Scanner sc = new Scanner(System.in);
        int inputData;
        try {
            System.out.println("Выберите пункт меню:");
            inputData = sc.nextInt();
            if (inputData > maxMenuValue || inputData < 1) {

                throw new NoSuchElementException("Необходимо выбрать пункт от 1 до "+maxMenuValue);
            }
        }
        catch (InputMismatchException e) {
            throw new InputMismatchException("Введеное значение не является числом");
        }
        return inputData;
    }
}
