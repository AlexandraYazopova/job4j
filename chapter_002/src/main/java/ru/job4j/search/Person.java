package ru.job4j.search;

/**
 * Класс Person - описание человека.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 09.11.2018
 */
public class Person {
    /**
     * Имя человека.
     */
    private String name;

    /**
     * Фамилия человека.
     */
    private String surname;

    /**
     * Номер телефона человека.
     */
    private String phone;

    /**
     * Адрес человека.
     */
    private String address;

    /**
     * Конструктор.
     */
    public Person(String name, String surname, String phone, String address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
    }

    /**
     * Метод getName - узнать имя человека.
     * @return имя.
     */
    public String getName() {
        return name;
    }

    /**
     * Метод getSurname - узнать фамилию человека.
     * @return фамилия.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Метод getPhone - узнать номер телефона человека.
     * @return номер телефона.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Метод getAddress - узнать адрес человека.
     * @return адрес.
     */
    public String getAddress() {
        return address;
    }
}
