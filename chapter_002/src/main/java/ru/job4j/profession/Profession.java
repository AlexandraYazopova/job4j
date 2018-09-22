package ru.job4j.profession;

/**
 * Класс Profession - родительский класс для Doctor, Teacher, Engineer.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 22.09.2018
 */
public class Profession {
    /**
     * Имя человека.
     */
    public String name;

    /**
     * Профессия человека.
     */
    public String profession;

    /**
     * Пустой конструктор.
     */
    public Profession() {
    }

    /**
     * Конструктор с полями name и  profession.
     */
    public Profession(String name, String profession) {
       this.name = name;
       this.profession = profession;
    }

    /**
     * Метод getName - узнать имя человека.
     * @return имя человека.
     */
    public String getName() {
        return name;
    }

    /**
     * Метод getProfession - узнать профессию человека.
     * @return профессия человека.
     */
    public String getProfession() {
        return profession;
    }
}
