package ru.gb.ui;

public class Menu {
           public String mainMenu() {
            StringBuilder sb = new StringBuilder();
            sb.append("МЕНЮ:\n");
            sb.append("1. Добавить новое животное\n");
            sb.append("2. Вывести список команд животного\n");
            sb.append("3. Обучить животное новой команде\n");
            sb.append("4. Выход\n");
            return sb.toString();
        }

        public String animalMenu(){
            StringBuilder sb = new StringBuilder();
            sb.append("Список животных:\n");
            sb.append("1. Собака\n");
            sb.append("2. Кошка\n");
            sb.append("3. Хомяк\n");
            sb.append("4. Лошадь\n");
            sb.append("5. Осел\n");
            sb.append("6. Верблюд\n");
            return sb.toString();
        }

    public String commandMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append("Выберите команду для добавления:\n");
        sb.append("1. VOICE\n");
        sb.append("2. REJOICE\n");
        sb.append("3. RUN\n");
        sb.append("4. JUMP\n");
        sb.append("5. BRING_THING\n");
        sb.append("6. REST\n");
        sb.append("7. RUSTLE\n");
        sb.append("8. MEOW\n");
        sb.append("9. BARK\n");
        sb.append("10. NEIGH\n");
        return sb.toString();
    }


    }

