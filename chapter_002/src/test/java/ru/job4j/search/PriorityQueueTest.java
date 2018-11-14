package ru.job4j.search;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Alexandra Yazopova (mailto:aleaxndra.yaz@gmail.com)
 * @version 1
 * @since 11.11.2018
 */
public class PriorityQueueTest {

    /**
     * Тест на добавление задачи по приоритету.
     */
    @Test
    public void whenHigherPriorityOne() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("middle5", 5));
        queue.put(new Task("urgent2", 2));
        queue.put(new Task("middle3", 3));
        queue.put(new Task("low8", 8));
        queue.put(new Task("urgent1", 1));
        queue.put(new Task("low11", 11));
        Task result = queue.take();
        assertThat(result.getDesc(), is("urgent1"));
    }

    /**
     * Тест на добавление задачи по приоритету.
     */
    @Test
    public void whenHigherPrioritySix() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 9));
        queue.put(new Task("middle", 6));
        Task result = queue.take();
        assertThat(result.getDesc(), is("middle"));
    }
}
