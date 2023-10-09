package ru.gb.model.animal.baggage;

import ru.gb.model.animal.command.Command;

import java.util.Date;

public class Camel extends BaggageAnimal{
    public Camel(String name, Date birthday, int cargo) {
        super(name, birthday, cargo);
        this.getCommands().addCommand(Command.REST);
    }


}
