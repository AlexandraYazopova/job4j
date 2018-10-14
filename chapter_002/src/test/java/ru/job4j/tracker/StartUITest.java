package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
     * Новый объект типа Tracker.
     */
    Tracker tracker = new Tracker();

    /**
     * Новый заявка 1.
     */
    Item item1 = new Item("test 1", "desc", 30092018L);

    /**
     * Новый заявка 2.
     */
    Item item2 = new Item("test 2", "desc", 30092018L);

    /**
     * Новый заявка 3.
     */
    Item item3 = new Item("test 1", "desc", 30092018L);

   /**
    * Дефолтный вывод в консоль.
    */
    private final PrintStream stdout = System.out;

    /**
     * Буфер для результата.
     */
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    /**
     * Меню.
     */
    private final StringBuilder menu  = new StringBuilder()
                                                .append("Меню.")
                                                .append(System.lineSeparator())
                                                .append("0. Добавить заявку.")
                                                .append(System.lineSeparator())
                                                .append("1. Показать все заявки.")
                                                .append(System.lineSeparator())
                                                .append("2. Редактировать заявку.")
                                                .append(System.lineSeparator())
                                                .append("3. Удалить заявку.")
                                                .append(System.lineSeparator())
                                                .append("4. Найти заявку по id.")
                                                .append(System.lineSeparator())
                                                .append("5. Найти заявку по имени.")
                                                .append(System.lineSeparator())
                                                .append("6. Выход.")
                                                .append(System.lineSeparator())
                                                .append(" ")
                                                .append(System.lineSeparator());
    /**
     * Метод loadOutput - заменяет стандартный вывод на вывод в пямять для тестирования.
     */
    @Before
    public void loadOutput() {
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        System.setOut(new PrintStream(this.out));
    }

    /**
     * Метод backOutput - возвращает обратно стандартный вывод в консоль.
     */
    @After
    public void backOutput() {
        System.setOut(this.stdout);
    }

    /**
     * Тест - Пользователь выбрал пункт меню - Добавить заявку.
     */
    //Test
    /**public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Input input = new StubInput(new String[]{"0", "test name", "desc", "30092018", "6"});
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                .append(menu)
                .append("------------ Добавление новой заявки --------------")
                .append(System.lineSeparator())
                .append("------------ Новая заявка с id : " + tracker.findAll()[3].getId() + " создана -----------")
                .append(System.lineSeparator())
                .append(menu)
                .append("------------ Работа завершена --------------")
                .append(System.lineSeparator())
                .toString()));
    }*/

    /**
     * Тест - Пользователь выбрал пункт меню - Показать все заявки.
     */
    //@Test
    /**public void showAllItems() {
        Input input = new StubInput(new String[]{"1", "6"});
        new StartUI(input, tracker).init();
        Item[] expect = new Item[] {item1, item2, item3};
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                .append(menu)
                .append("------------ Список заявок --------------")
                .append(System.lineSeparator())
                .append(item1)
                .append(System.lineSeparator())
                .append(item2)
                .append(System.lineSeparator())
                .append(item3)
                .append(System.lineSeparator())
                .append(menu)
                .append("------------ Работа завершена --------------")
                .append(System.lineSeparator())
                .toString()));
    }*/

    /**
     * Тест - Пользователь выбрал пункт меню - Редактировать заявку.
     */
    //@Test
    /**public void whenUpdateItemThenTrackerHasUpdatedValue() {
        Input input = new StubInput(new String[]{"2", item1.getId(), "test replace", "заменили заявку", "30092018", "6"});
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                .append(menu)
                .append("------------ Редактирование заявки --------------")
                .append(System.lineSeparator())
                .append("------------ Заявка с id : " + item1.getId() + " изменена -----------")
                .append(System.lineSeparator())
                .append(menu)
                .append("------------ Работа завершена --------------")
                .append(System.lineSeparator())
                .toString()));
    }*/

    /**
     * Тест - Пользователь выбрал пункт меню - Удалить заявку.
     */
   // @Test
    /**public void whenDeleteItemThenTrackerHasUpdatedValue() {
        Input input = new StubInput(new String[]{"3", item1.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                .append(menu)
                .append("------------ Удаление заявки --------------")
                .append(System.lineSeparator())
                .append("------------ Заявка с id : " + item1.getId() + " удалена -----------")
                .append(System.lineSeparator())
                .append(menu)
                .append("------------ Работа завершена --------------")
                .append(System.lineSeparator())
                .toString()));
    }*/

    /**
     * Тест - Пользователь выбрал пункт меню - Найти заявку по id.
     */
    //@Test
    /**public void whenFindItemById() {
        Input input = new StubInput(new String[]{"4", item1.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                .append(menu)
                .append("------------ Поиск заявки по id --------------")
                .append(System.lineSeparator())
                .append(item1)
                .append(System.lineSeparator())
                .append(menu)
                .append("------------ Работа завершена --------------")
                .append(System.lineSeparator())
                .toString()));
    }*/

    /**
     * Тест - Пользователь выбрал пункт меню - Найти заявку по имени.
     */
    //@Test
    /**public void whenFindItemByName() {
        Input input = new StubInput(new String[]{"5", "test 1", "6"});
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                .append(menu)
                .append("------------ Поиск заявки по имени --------------")
                .append(System.lineSeparator())
                .append(item1)
                .append(System.lineSeparator())
                .append(item3)
                .append(System.lineSeparator())
                .append(menu)
                .append("------------ Работа завершена --------------")
                .append(System.lineSeparator())
                .toString()));
    }*/
}