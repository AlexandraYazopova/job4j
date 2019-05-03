package ru.job4j.map;

/**
 * Класс User - описание пользователя.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 28.11.2018
 */
public class User {
    /**
     * Уникальный ключ пользователя.
     */
    private int id;

    /**
     * Имя пользователя.
     */
    public String name;

    /**
     * Город пользователя.
     */
    public String city;

    /**
     * Конструктор User.
     */
    public User(int id, String  name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}
