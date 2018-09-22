package ru.job4j.profession;

/**
 * Класс Student - описывает студента.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 22.09.2018
 */
public class Student {
    /**
     * Имя студента.
     */
    private String name;

    /**
     * Конструктор Student.
     */
    public Student(String name) {
        this.name = name;
    }

    /**
     * Метод setName - установить имя студента.
     */
    public void setName(String name) {
    }

    /**
     * Метод getName - узнать имя студента.
     */
    public String getName() {
        return name;
    }
}
