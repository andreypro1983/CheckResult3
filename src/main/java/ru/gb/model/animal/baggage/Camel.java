package ru.gb.model.animal.baggage;

import ru.gb.model.animal.command.Command;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Camel extends BaggageAnimal{
    private static final String DATE_FORMAT = "dd.MM.yyyy";
    public Camel(String name, Date birthday, int cargo) {
        super(name, birthday, cargo);
        this.getCommands().addCommand(Command.REST);
    }
    @Override
    public String getInfo() {
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
        String formattedBirthday = formatter.format(this.getBirthday());
        return "id:"+this.getId()+" Имя: "+this.getName()+" Дата рождения: "+ formattedBirthday+ " Команды: "+this.getCommands().showCommands()+ " Грузоподъемность: "+this.getCargo();
    }
    public String getShortInfo() {
        return "id:"+this.getId()+" Имя верблюда: "+this.getName()+" Команды: "+this.getCommands().showCommands();
    }

    public String getNumberAndAnimalInfo(int count){
        StringBuilder sb = new StringBuilder();
        sb.append(count+1).append(". ");
        sb.append(this.getShortInfo());
        sb.append("\n");
        return sb.toString();
    }
}
