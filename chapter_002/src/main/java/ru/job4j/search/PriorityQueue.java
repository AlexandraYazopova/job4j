package ru.job4j.search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PriorityQueue {
    /**
     * @param хранит ссылку на связный список объектов типа Task.
     */
    private LinkedList<Task> tasks = new LinkedList<>();

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
