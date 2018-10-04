package ru.job4j.pseudo;

/**
 * Класс Triangle.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 03.10.2018
 */
public class Triangle implements Shape {
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("   +   ");
        pic.append("  +++  ");
        pic.append(" +++++ ");
        pic.append("+++++++");
        return pic.toString();
    }
}
