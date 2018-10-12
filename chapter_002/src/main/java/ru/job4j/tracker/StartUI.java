package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс StartUI - запуск приложения.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 23.09.2018
 */
public class StartUI {

    /**
     * Флажок для выхода из программы.
     */
    private boolean work = true;

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
     * Метод stop() для изменения флажка выхода из программы.
     */
    public void stop() {
       this.work = false;
    }

    /**
     * Основой цикл программы.
     */
    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        ///List<Integer> range = new ArrayList<>();
        menu.fillActions(this);
        //for (int i = 0; i != menu.getActionsLentgh(); i++) {
        //   range.add(i);
        //}
        do {
            menu.show();
            int key = Integer.valueOf(input.ask("Выберите пункт меню:"));
            menu.select(key);
        } while (!"да".equals(this.input.ask("Выйти?(да): ")));

    }

    /**
     * Запускт программы.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
