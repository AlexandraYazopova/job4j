package ru.job4j.tracker;

import java.util.List;

/**
 * Класс StubInput - считывание введенных данных из консоли.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 23.09.2018
 */
public class StubInput implements Input {

    /**
     * Массив - последовательность ответов пользователя.
     */
    private final String[] answers;

    /**
     * Счетчик.
     */
    private int position = 0;

    /**
     * Конструктор.
     */
    public StubInput(String[] answers) {
        this.answers = answers;
    }

    /**
     * Метод ask - задать пользователю вопрос, получить ответ в виде строки.
     * @return ответ.
     */
    @Override
    public String ask(String question) {
        return this.answers[position++];
    }

    /**
     * Метод askDate - задать пользователю вопрос о времени заявки, получить ответ в виде строки.
     * @return ответ.
     */
    @Override
    public String askDate(String question) {
        return this.answers[position++];
    }

    /**
     * Метод ask - задать пользователю вопрос, получить ответ в виде числа.
     * @throw ответ.
     */
    @Override
    public int ask(String question,  List<Integer> range) {

        //throw new UnsupportedOperationException();
        return -1;
    }
}
