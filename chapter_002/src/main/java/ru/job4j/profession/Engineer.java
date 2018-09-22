package ru.job4j.profession;

/**
 * Класс Engineer - описывает имя и специальность инженера, показывает его строительные объекты - дома.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 22.09.2018
 */
public class Engineer extends Profession {
    /**
     * Инженер строит конкретный дом.
     */
    private House house;

    /**
     * Конструктор Engineer - переопределение полей.
     */
    public Engineer(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }

    /**
     * Метод setHouse - закрепить строительный объект за инженером.
     */
    public void setHouse(House house) {
    }

    /**
     * Метод getHouse - узнать имя закрепленного строительного объекта.
     * @return строительный объект.
     */
    public House getHouse() {
        return house;
    }
}
