package ru.job4j.tracker;

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
     * Метод ask - задать пользователю вопрос.
     * @return ответ.
     */
    @Override
    public String ask(String question) {
        return this.answers[position++];
    }
}
