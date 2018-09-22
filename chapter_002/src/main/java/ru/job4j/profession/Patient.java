package ru.job4j.profession;

/**
 * Класс Patient - описывает студента.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 22.09.2018
 */
public class Patient {
    /**
     * Имя пациента.
     */
    private String name;

    /**
     * Конструктор Patient.
     */
    public Patient(String name) {
        this.name = name;
    }

    /**
     * Метод setName - установить имя пациента.
     */
    public void setName(String name) {
    }

    /**
     * Метод getName - узнать имя закрепленного пациента.
     */
    public String getName() {
        return name;
    }
}
