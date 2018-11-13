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
        boolean addition = false;
        if (tasks.size() != 0) {
            for (Task i : tasks) {
                if (task.getPriority() < i.getPriority()) {
                    tasks.add(tasks.indexOf(i), task);
                    addition = true;
                    break;
                }
            }
            if (!addition) {
                tasks.add(tasks.size(), task);

            }
        } else {
            tasks.add(task);
        }

    }

    public Task take() {
        return this.tasks.poll();
    }

}
