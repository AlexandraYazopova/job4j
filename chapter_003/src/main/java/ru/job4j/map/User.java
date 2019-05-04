package ru.job4j.map;

import java.util.Objects;

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

    /**
     * Метод getId - установка id пользователя
     * @return id пользователя.
     */
    public int getId() {
        return id;
    }

    /**
     * Переопределение equals()
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        return id == user.id && name.equals(user.name) && city.equals(user.city);
    }

    /**
     * Переопределение hashCode() вручную
     */
    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + id;
        result = 37 * result + name.hashCode();
        result = 37 * result + city.hashCode();
        return result;

        //Переопределение hashCode() авто -  return Objects.hash(id, name, city);
    }
}
