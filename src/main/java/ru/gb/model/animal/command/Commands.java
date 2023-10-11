package ru.gb.model.animal.command;

import java.io.Serializable;
import java.util.ArrayList;

public class Commands implements Serializable {
    private ArrayList<Command> commands;

    public Commands(){
        this.commands = new ArrayList<Command>();
    }

    public ArrayList<Command> getArrayCommands (){
        return this.commands;
    }

    public void addCommand (Command command){
        commands.add(command);
    }

    public String showCommands() {
        StringBuilder sb = new StringBuilder();
        if (commands.isEmpty()) {
            return "Нет команд";
        }else {
                for (Command command : commands) {
                    sb.append(command);
                    sb.append(", ");
                }
                sb.deleteCharAt(sb.length()-2);
            return sb.toString();
        }
    }




    }