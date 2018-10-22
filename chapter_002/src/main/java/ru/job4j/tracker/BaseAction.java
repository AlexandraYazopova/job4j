package ru.job4j.tracker;

/**
 * Абстрактный класс BaseAction - задает номер и название пункта меню.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 22.10.2018
 */
public abstract class BaseAction implements UserAction {
    /**
     * @param хранит ключ пункта меню.
     */
    private final int key;

    /**
     * @param хранит название пункта меню.
     */
    private final String name;

    /**
     * Конструктор.
     * @param key - ключ.
     * @param name - название.
     */
    protected BaseAction(final int key, final String name) {
        this.key = key;
        this.name = name;
    }

    /**
     * Метод возвращает ключ опции.
     * @return ключ
     */
    @Override
    public int key() {
        return this.key;
    }

    /**
     * Метод возвращает информацию о данном пункте меню.
     * @return Строка меню
     */
    @Override
    public String info() {
        return String.format("%s. %s", this.key, this.name);
    }
}
