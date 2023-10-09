package ru.gb.model.animal.home;

import ru.gb.model.animal.command.Command;

import java.util.Date;

public class Hamster extends HomeAnimal{
    public Hamster(String name, Date birthday) {
        super(name, birthday);
        this.getCommands().addCommand(Command.RUSTLE);
    }


}
