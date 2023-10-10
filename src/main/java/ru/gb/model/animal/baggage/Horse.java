package ru.gb.model.animal.baggage;

import ru.gb.model.animal.command.Command;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Horse extends BaggageAnimal{
    private static final String DATE_FORMAT = "dd.MM.yyyy";

    public Horse(String name, Date birthday, int cargo) {
        super(name, birthday, cargo);
        this.getCommands().addCommand(Command.NEIGH);
    }

    @Override
    public String getInfo() {
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
        String formattedBirthday = formatter.format(this.getBirthday());
        return "id:"+this.getId()+" Имя: "+this.getName()+" Дата рождения: "+ formattedBirthday+ " Команды: "+this.getCommands().showCommands()+ " Грузоподъемность: "+this.getCargo();
    }

}
