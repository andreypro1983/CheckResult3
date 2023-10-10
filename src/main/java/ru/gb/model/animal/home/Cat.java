package ru.gb.model.animal.home;

import ru.gb.model.animal.command.Command;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cat extends HomeAnimal{
    private static final String DATE_FORMAT = "dd.MM.yyyy";
    public Cat(String name, Date birthday) {
        super(name, birthday);
        this.getCommands().addCommand(Command.MEOW);
    }
    @Override
    public String getInfo() {
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
        String formattedBirthday = formatter.format(this.getBirthday());
        return "id:"+this.getId()+" Имя: "+this.getName()+" Дата рождения: "+ formattedBirthday+ " Команды: "+this.getCommands().showCommands();
    }
    public String getShortInfo() {
        return "id:"+this.getId()+" Имя кошки: "+this.getName()+" Команды: "+this.getCommands().showCommands();
    }
    public String getNumberAndAnimalInfo(int count){
        StringBuilder sb = new StringBuilder();
        sb.append(count+1).append(". ");
        sb.append(this.getShortInfo());
        sb.append("\n");
        return sb.toString();
    }
}