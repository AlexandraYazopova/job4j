package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

/**
 * Внешний класс EditItem - Редактировать заявку.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 10.10.2018
 */
class EditItem implements UserAction {

    @Override
    public int key() {
        return 2;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println(" ");
        System.out.println("------------ Редактирование заявки --------------");
        String id = input.ask("Введите id заявки :");
        String name = input.ask("Введите новое имя заявки :");
        String desc = input.ask("Введите новое описание заявки :");
        Item item = new Item(name, desc, tracker.generateDate());
        boolean result = tracker.replace(id, item);
        if (result) {
            System.out.println("------------ Заявка с id : " + id + " изменена -----------");
        } else {
            System.out.println("------------ Заявка с id : " + id + " не найдена -----------");
        }
    }

    @Override
    public String info() {
        return String.format("%s. %s", this.key(), "Редактировать заявку.");
    }
}

/**
 * Класс MenuTracker - содержит меню программы и основные действия.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 10.10.2018
 */
public class MenuTracker {

    /**
     * @param хранит ссылку на объект .
     */
    private Input input;

    /**
     * @param хранит ссылку на объект .
     */
    private Tracker tracker;

    /**
     * @param хранит ссылку на массив типа UserAction.
     */
    private List<UserAction> actions = new ArrayList<>();

    /**
     * Конструктор.
     * @param input   объект типа Input
     * @param tracker объект типа Tracker
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Метод для получения массива меню.
     * @return длину массива
     */
    public int getActionsLentgh() {
        return this.actions.size();
    }

    /**
     * Метод заполняет массив пунктами меню.
     */
    public void fillActions(StartUI ui) {
        this.actions.add(this.new AddItem());
        this.actions.add(new MenuTracker.ShowItems());
        this.actions.add(new EditItem());
        this.actions.add(this.new DeleteItem());
        this.actions.add(this.new FindItemById());
        this.actions.add(this.new FindItemsByName());
        this.actions.add(this.new ExitProgram(ui));
    }

    /**
     * Метод заполняет массив номерами пунктов меню.
     */
    public List<Integer> fillNumberMenu() {
        List<Integer> range = new ArrayList<>();
        for (int i = 0; i < getActionsLentgh(); i++) {
            range.add(i);
        }
        return range;
    }

    /**
     * Метод в зависимости от указанного ключа, выполняет соотвествующие действие.
     *
     * @param key ключ операции
     */
    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);
    }

    /**
     * Метод выводит на экран меню.
     */
    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    /**
     * Внутренний класс AddItem - Добавление заявки.
     *
     * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
     * @version 1
     * @since 10.10.2018
     */
    public class AddItem implements UserAction {

        @Override
        public int key() {
            return 0;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println(" ");
            System.out.println("------------ Добавление новой заявки --------------");
            String name = input.ask("Введите имя заявки :");
            String desc = input.ask("Введите описание заявки :");
            Item item = new Item(name, desc, tracker.generateDate());
            tracker.add(item);
            System.out.println("------------ Новая заявка с id : " + item.getId() + " создана -----------");
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Добавить заявку.");
        }

    }

    /**
     * Статический внутренний класс ShowItems - Показать все заявки.
     *
     * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
     * @version 1
     * @since 10.10.2018
     */
    public static class ShowItems implements UserAction {

        @Override
        public int key() {
            return 1;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println(" ");
            System.out.println("------------ Список заявок --------------");
            Item[] item = tracker.findAll();
            if (item.length != 0) {
                for (Item i : item) {
                    System.out.println(i);
                }
            } else {
                System.out.println("------------ Список пуст -----------");
            }
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Показать все заявки.");
        }
    }

    /**
     * Внутренний класс DeleteItem - Удалить заявку.
     *
     * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
     * @version 1
     * @since 10.10.2018
     */
    public class DeleteItem implements UserAction {

        @Override
        public int key() {
            return 3;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println(" ");
            System.out.println("------------ Удаление заявки --------------");
            String id = input.ask("Введите id заявки :");
            boolean result = tracker.delete(id);
            if (result) {
                System.out.println("------------ Заявка с id : " + id + " удалена -----------");
            } else {
                System.out.println("------------ Заявка с id : " + id + " не найдена -----------");
            }
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Удалить заявку.");
        }
    }

    /**
     * Внутренний класс FindItemById - Найти заявку по id.
     *
     * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
     * @version 1
     * @since 10.10.2018
     */
    public class FindItemById implements UserAction {

        @Override
        public int key() {
            return 4;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println(" ");
            System.out.println("------------ Поиск заявки по id --------------");
            String id = input.ask("Введите id заявки :");
            Item item = tracker.findById(id);
            if (item != null) {
                System.out.println(item);
            } else {
                System.out.println("------------ Заявка с id : " + id + " не найдена -----------");
            }
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Найти заявку по id.");
        }
    }

    /**
     * Внутренний класс FindItemsByName - Найти заявку по имени.
     *
     * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
     * @version 1
     * @since 10.10.2018
     */
    public class FindItemsByName implements UserAction {

        @Override
        public int key() {
            return 5;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println(" ");
            System.out.println("------------ Поиск заявки по имени --------------");
            String name = input.ask("Введите имя заявки :");
            Item[] item = tracker.findByName(name);
            if (item.length != 0) {
                for (Item i : item) {
                    System.out.println(i);
                }
            } else {
                System.out.println("------------ Заявок с именем : " + name + " не найдено -----------");
            }
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Найти заявку по имени.");
        }
    }

    /**
     * Внутренний класс ExitProgram - Выход.
     *
     * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
     * @version 1
     * @since 10.10.2018
     */
    public class ExitProgram implements UserAction {

        /**
         * @param хранит ссылку на объект .
         */
        private final StartUI ui;

        /**
         * Конструктор.
         * @param ui объект типа StartUI.
         */
        public ExitProgram(StartUI ui) {
            this.ui = ui;
        }

        @Override
        public int key() {
            return 6;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println(" ");
            System.out.println("------------ Работа завершена --------------");
            this.ui.stop();
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Выход.");
        }
    }
}
