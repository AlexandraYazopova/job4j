package ru.job4j.pseudo;

/**
 * Класс Paint - выводит псевдоизображение в консоль.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 03.10.2018
 */
public class Paint {
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }
}
