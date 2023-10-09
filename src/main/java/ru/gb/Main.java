package ru.gb;

import ru.gb.model.Service;
import ru.gb.ui.Console;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Console console = new Console();
        Service service = new Service(console);
        console.start();

    }
}