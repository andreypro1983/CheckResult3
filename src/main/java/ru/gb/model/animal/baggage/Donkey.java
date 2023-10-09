package ru.gb.model.animal.baggage;

import ru.gb.model.animal.command.Command;

import java.util.Date;

public class Donkey extends BaggageAnimal{
    public Donkey(String name, Date birthday, int weight) {
        super(name, birthday, weight);
        this.getCommands().addCommand(Command.RUN);
    }


}
