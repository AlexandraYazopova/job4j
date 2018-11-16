package ru.job4j.search;

/**
 * Класс Task - описание задачи.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 09.11.2018
 */
public class Task {
    /**
     * Описание задачи.
     */
    private String desc;

    /**
     * Номер порядка приоритета.
     */
    private int priority;

    /**
     * Конструктор.
     */
    public Task(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }

    /**
     * Метод getDesc - узнать описание задачи.
     * @return описание задачи.
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Метод getPriority - узнать приоритетность задачи.
     * @return порядок приоритета.
     */
    public int getPriority() {
        return priority;
    }
}
