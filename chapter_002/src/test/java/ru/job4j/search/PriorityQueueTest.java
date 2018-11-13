package ru.job4j.search;

import org.junit.Test;
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
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        Task result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
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
