package ru.gb.ui;

public class MainMenu {
           public String menu() {
            StringBuilder sb = new StringBuilder();
            sb.append("МЕНЮ:\n");
            sb.append("1. Добавить новое животное\n");
            sb.append("2. Вывести список команд животного\n");
            sb.append("3. Обучить животное новой команде\n");
            sb.append("4. Выход\n");
            return sb.toString();
        }


    }

