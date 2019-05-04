package ru.job4j.comparable;

/**
 * Класс User - описание пользователя.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 03.05.2018
 */
public class User {

    /**
     * Имя пользователя.
     */
    public String name;

    /**
     * Возраст пользователя.
     */
    public int age;

    /**
     * Конструктор User.
     */
    public User(String  name, int age) {
        this.name = name;
        this.age = age;
    }
}
