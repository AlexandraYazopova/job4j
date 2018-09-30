package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Alexandra Yazopova (mailto:aleaxndra.yaz@gmail.com)
 * @version 1
 * @since 30.09.2018
 */
public class StartUITest {

    /**
     * Тест на добавление заявки.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "30092018", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test name"));
    }

    /**
     * Тест на редактирование заявки.
     */
    @Test
    public void whenUpdateItemThenTrackerHasUpdatedValue() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc", 30092018L));
        Input input = new StubInput(new String[]{"2", item.getId(), "test replace", "заменили заявку", "30092018", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
    }

    /**
     * Тест на удаление заявки.
     */
    @Test
    public void whenDeleteItemThenTrackerHasUpdatedValue() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("test 1", "desc", 30092018L));
        Item item2 = tracker.add(new Item("test 2", "desc", 30092018L));
        Input input = new StubInput(new String[]{"3", item1.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item2.getId()).getName(), is("test 2"));
    }

    /**
     * Тест на поиск заявки по id.
     */
    @Test
    public void whenFindItemById() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test 1", "desc", 30092018L));
        Input input = new StubInput(new String[]{"4", item.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test 1"));
    }

    /**
     * Тест на поиск заявки по имени.
     */
    @Test
    public void whenFindItemByName() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("test 1", "desc", 30092018L));
        Item item2 = tracker.add(new Item("test 2", "desc", 30092018L));
        Item item3 = tracker.add(new Item("test 1", "desc", 30092018L));
        Input input = new StubInput(new String[]{"5", "test 1", "6"});
        new StartUI(input, tracker).init();
        Item[] expect = new Item[] {item1, item3};
        assertThat(tracker.findByName("test 1"), is(expect));
    }
}
