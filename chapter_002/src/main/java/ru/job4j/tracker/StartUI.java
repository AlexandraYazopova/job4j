package ru.job4j.tracker;

public class StartUI {
    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String ADD = "0";

    /**
     * Константа меню для показа списка всех заявок.
     */
    private static final String ALL = "1";

    /**
     * Константа меню для редактирования заявки.
     */
    private static final String EDIT = "2";

    /**
     * Константа меню для удаления заявки.
     */
    private static final String DEL = "3";

    /**
     * Константа меню для поиска заявки по id.
     */
    private static final String BYID = "4";

    /**
     * Константа меню для поиска заявки по названию.
     */
    private static final String BYNAME = "5";
    /**
     * Константа для выхода из цикла.
     */
    private static final String EXIT = "6";

    /**
     * Получение данных от пользователя.
     */
    private final Input input;

    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     * @param input ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Основой цикл программы.
     */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню (цифру) : ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (ALL.equals(answer)) {
                this.showItems();
            } else if (EDIT.equals(answer)) {
                this.editItem();
            } else if (DEL.equals(answer)) {
                this.deleteItem();
            } else if (BYID.equals(answer)) {
                this.findItemById();
            } else if (BYNAME.equals(answer)) {
                this.findItemByName();
            } else if (EXIT.equals(answer)) {
                System.out.println("------------ Работа завершена --------------");
                exit = true;
            } else {
                System.out.println("------------ Некорректный ввод --------------");
            }
        }
    }

    /**
     * Метод реализует добавление новой заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        long date = Long.parseLong(this.input.ask("Введите дату :"));
        Item item = new Item(name, desc, date);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с id : " + item.getId() + " создана -----------");
    }

    /**
     * Метод реализует показ списка всех заявок.
     */
    private void showItems() {
        System.out.println("------------ Список заявок --------------");
        Item[] item = this.tracker.findAll();
        if (item.length != 0) {
            for (Item i : item) {
                System.out.println("Имя: " + i.getName() + ", описание: " + i.getDescription() + ", дата создания: " + i.getCreate() + ", id: " + i.getId());
            }
        } else {
            System.out.println("------------ Список пуст -----------");
        }
    }

    /**
     * Метод реализует редактирование заявки.
     */
    private void editItem() {
        System.out.println("------------ Редактирование заявки --------------");
        String id = this.input.ask("Введите id заявки :");
        String name = this.input.ask("Введите новое имя заявки :");
        String desc = this.input.ask("Введите новое описание заявки :");
        long date = Long.parseLong(this.input.ask("Введите дату :"));
        Item item = new Item(name, desc, date);
        boolean result = this.tracker.replace(id, item);
        if (result) {
            System.out.println("------------ Заявка с id : " + id + " изменена -----------");
        } else {
            System.out.println("------------ Заявка с id : " + id + " не найдена -----------");
        }

    }

    /**
     * Метод реализует удаление заявки.
     */
    private void deleteItem() {
        System.out.println("------------ Удаление заявки --------------");
        String id = this.input.ask("Введите id заявки :");
        boolean result = this.tracker.delete(id);
        if (result) {
            System.out.println("------------ Заявка с id : " + id + " удалена -----------");
        } else {
            System.out.println("------------ Заявка с id : " + id + " не найдена -----------");
        }
    }

    /**
     * Метод реализует поиск заявки по id.
     */
    private void findItemById() {
        System.out.println("------------ Поиск заявки по id --------------");
        String id = this.input.ask("Введите id заявки :");
        Item item = this.tracker.findById(id);
        if (item != null) {
            System.out.println("Имя: " + item.getName() + ", описание: " + item.getDescription() + ", дата создания: " + item.getCreate() + ", id: " + item.getId());
        } else {
            System.out.println("------------ Заявка с id : " + id + " не найдена -----------");
        }
    }

    /**
     * Метод реализует поиск заявки по названию.
     */
    private void findItemByName() {
        System.out.println("------------ Поиск заявки по имени --------------");
        String name = this.input.ask("Введите имя заявки :");
        Item[] item = this.tracker.findByName(name);
        if (item.length != 0) {
            for (Item i : item) {
                System.out.println("Имя: " + i.getName() + ", описание: " + i.getDescription() + ", дата создания: " + i.getCreate() + ", id: " + i.getId());
            }
        } else {
            System.out.println("------------ Заявок с именем : " + name + " не найдено -----------");
        }
    }

    /**
     * Метод показывает пользователю меню.
     */
    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0. Добавить заявку.");
        System.out.println("1. Показать все заявки.");
        System.out.println("2. Редактировать заявку.");
        System.out.println("3. Удалить заявку.");
        System.out.println("4. Найти заявку по id.");
        System.out.println("5. Найти заявку по имени");
        System.out.println("6. Выход");
        System.out.println(" ");
    }

    /**
     * Запускт программы.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}