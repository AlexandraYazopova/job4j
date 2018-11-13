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
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 2));
        queue.put(new Task("middle", 3));
        queue.put(new Task("lower", 8));
        queue.put(new Task("lower", 1));
        queue.put(new Task("lower", 11));
        Task result = queue.take();
        assertThat(result, is("urgent"));
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
