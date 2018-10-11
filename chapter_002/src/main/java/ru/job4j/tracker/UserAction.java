package ru.job4j.tracker;

/**
 * Интерфейс UserAction - описывает днйствие пользователя.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 04.10.2018
 */
public interface UserAction {
    /**
     * Метод возвращает ключ опции.
     * @return ключ
     */
    int key();

    /**
     * Основной метод.
     * @param input объект типа Input
     * @param tracker объект типа Tracker
     */
    void execute(Input input, Tracker tracker);

    /**
     * Метод возвращает информацию о данном пункте меню.
     * @return Строка меню
     */
    String info();
}
