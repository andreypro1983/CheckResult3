package ru.gb.model.animal.home;

import ru.gb.model.animal.command.Command;
import ru.gb.model.animal.command.Commands;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dog extends HomeAnimal{
    private static final String DATE_FORMAT = "dd.MM.yyyy";
    public Dog(String name, Date birthday) {
        super(name, birthday);
        this.getCommands().addCommand(Command.BARK);
    }

    @Override
    public String getInfo() {
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
        String formattedBirthday = formatter.format(this.getBirthday());
        return "id:"+this.getId()+" Имя: "+this.getName()+" Дата рождения: "+ formattedBirthday+ " Команды: "+this.getCommands().showCommands();
    }


}
