package ru.job4j.search;

import java.util.LinkedList;

/**
 * Класс PriorityQueue - список задач по приоритету.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 11.11.2018
 */
public class PriorityQueue {
    /**
     * @param хранит ссылку на связный список объектов типа Task.
     */
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод добавляет задачу в соответствии с номером приоритета
     * @param task - задача
     */
    public void put(Task task) {
        int index = 0;
        for (Task i : tasks) {
            if (task.getPriority() < i.getPriority()) {
                break;
            }
            index++;
        }
        tasks.add(index, task);
        }

    public Task take() {
        return this.tasks.poll();
    }

}
