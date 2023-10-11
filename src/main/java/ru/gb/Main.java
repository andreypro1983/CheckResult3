package ru.gb;

import ru.gb.model.handler.FileHandler;
import ru.gb.model.handler.Loadable;
import ru.gb.model.handler.Saveble;
import ru.gb.model.Service;
import ru.gb.ui.Console;


public class Main {
    public static void main(String[] args) {

        Console console = new Console();
        Saveble saveble = new FileHandler();
        Loadable loadable = new FileHandler();
        Service service = new Service(console,saveble,loadable);
        console.start();

    }
}