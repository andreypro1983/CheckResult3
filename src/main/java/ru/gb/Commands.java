package ru.gb;

import java.util.ArrayList;

public class Commands {
    private ArrayList<Command> commands;

    public Commands(){
        this.commands = new ArrayList<Command>();
    }

    public ArrayList<Command> getCommands (){
        return this.commands;
    }

}