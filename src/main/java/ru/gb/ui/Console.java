package ru.gb.ui;

import ru.gb.model.Service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {
    private MainMenu mainMenu;
    private Service service;

    private boolean isWork = true;

    public Console() {
        this.mainMenu = new MainMenu();
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void start(){
        while(isWork){
            print(mainMenu.menu());
            try {
                int inputValue = inputFromUser();
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

    private void addAnimal(){

    }

    private void showAnimalCommands(){

    }

    private void addCommandToAnimal(){

    }


    private int inputFromUser() throws RuntimeException,InputMismatchException{
        Scanner sc = new Scanner(System.in, "Cp866");
        int inputData;
        try {
            System.out.println("Выберите пункт меню:");
            inputData = sc.nextInt();
            if (inputData > 4 || inputData < 1) {
                throw new RuntimeException("Необходимо выбрать пункт от 1 до 4");
            }
        }
        catch (InputMismatchException e) {
            throw new InputMismatchException("Введеное значение не является числом");
        }
        return inputData;
    }
}
