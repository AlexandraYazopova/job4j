package ru.job4j.profession;

/**
 * Класс House - описывает строительный объект.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 22.09.2018
 */
public class House {
    /**
     * Номер объекта.
     */
    private int number;

    /**
     * Ширина объекта.
     */
    private int width;

    /**
     * Высота объекта.
     */
    private int height;

    /**
     * Конструктор House.
     */
    public House(int number, int width, int height) {

        this.number = number;
        this.width = width;
        this.height = height;
    }
}
