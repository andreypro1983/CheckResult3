package ru.gb.ui;

public class Menu {
    private static final int COUNT_MENU_ITEMS = 6;
    private static final int COUNT_ANIMAL_MENU_ITEMS = 6;
    private static final int COUNT_COMMAND_MENU_ITEMS = 10;
           public String mainMenu() {
            StringBuilder sb = new StringBuilder();
            sb.append("МЕНЮ:\n");
            sb.append("1. Добавить новое животное\n");
            sb.append("2. Вывести список команд животного\n");
            sb.append("3. Обучить животное новой команде\n");
            sb.append("4. Сохранить список животных\n");
            sb.append("5. Загрузить список животных\n");
            sb.append("6. Выход\n");
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

    public int getCountMainMenu(){
        return COUNT_MENU_ITEMS;
    }

    public int getCountAnimalMenu(){
        return COUNT_ANIMAL_MENU_ITEMS;
    }
    public int getCountCommandMenu(){
        return COUNT_COMMAND_MENU_ITEMS;
    }

    }

