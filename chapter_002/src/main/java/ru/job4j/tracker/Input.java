package ru.job4j.tracker;

import java.util.List;

/**
 * Интерфейс Input - реализует общение с пользователем.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 23.09.2018
 */
public interface Input {
    String ask(String question);

    String askDate(String question);

    int ask(String question, List<Integer> range);

}
