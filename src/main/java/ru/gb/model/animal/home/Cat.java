package ru.gb.model.animal.home;

import ru.gb.model.animal.command.Command;

import java.util.Date;

public class Cat extends HomeAnimal{
    public Cat(String name, Date birthday) {
        super(name, birthday);
        this.getCommands().addCommand(Command.MEOW);
    }


}