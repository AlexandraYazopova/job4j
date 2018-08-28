package ru.job4j.condition;

/**
 * Class DummyBot.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 28.08.2018
 */
public class DummyBot {

    /**
     * Method answer - to answer the questions.
     * @param question  - a question from the client.
     * @return Answer.
     */
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Спросите другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
}
