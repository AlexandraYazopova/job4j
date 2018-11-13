package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    /**
     * @param хранит ссылку на связный список объектов типа Task.
     */
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        if (tasks.size() != 0) {
            for (Task i : tasks) {
                if (task.getPriority() < i.getPriority()) {
                    tasks.add(tasks.indexOf(i), task);
                    break;
                }
            }
        } else {
            tasks.add(task);
        }

    }

    public Task take() {
        return this.tasks.poll();
    }
}
