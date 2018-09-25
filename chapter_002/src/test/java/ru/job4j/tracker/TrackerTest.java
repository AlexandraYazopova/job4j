package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Alexandra Yazopova (mailto:aleaxndra.yaz@gmail.com)
 * @version 1
 * @since 23.09.2018
 */
public class TrackerTest {

    /**
     * Тест на добавление заявки и получение списка всех заявок.
     */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1", "testDescription", 123L);
        tracker.add(item1);
        Item item2 = new Item("test2", "testDescription", 124L);
        tracker.add(item2);
        Item item3 = new Item("test3", "testDescription", 125L);
        tracker.add(item3);
        Item[] expect = new Item[] {item1, item2, item3};
        assertThat(tracker.findAll(), is(expect));

    }

    /**
     * Тест на удаление заявки по id и получение списка всех заявок.
     */
    @Test
    public void whenDeleteFirstItem() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1", "testDescription1", 123L);
        tracker.add(item1);
        Item item2 = new Item("test2", "testDescription2", 124L);
        tracker.add(item2);
        Item item3 = new Item("test3", "testDescription3", 125L);
        tracker.add(item3);
        tracker.delete(item3.getId());
        Item[] expect = new Item[] {item1, item2};
        assertThat(tracker.findAll(), is(expect));

    }

    /**
     * Тест на изменение заявки.
     */
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2", 125L);
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    /**
     * Тест на получение заявки по имени.
     */
    @Test
    public void whenFindItemWithNameTest2() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test2", "testDescription", 123L);
        tracker.add(item1);
        Item item2 = new Item("test1", "testDescription", 124L);
        tracker.add(item2);
        Item item3 = new Item("test2", "testDescription", 125L);
        tracker.add(item3);
        Item[] expect = new Item[] {item1, item3};
        assertThat(tracker.findByName("test2"), is(expect));

    }

    /**
     * Тест на получение заявки по id.
     */
    @Test
    public void whenFindItemWithId() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1", "testDescription", 123L);
        tracker.add(item1);
        Item item2 = new Item("test2", "testDescription", 124L);
        tracker.add(item2);
        assertThat(tracker.findById(item2.getId()), is(item2));

    }
}
