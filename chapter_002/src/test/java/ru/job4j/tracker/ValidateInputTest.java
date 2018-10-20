package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Test.
 *
 * @author Alexandra Yazopova (mailto:aleaxndra.yaz@gmail.com)
 * @version 1
 * @since 19.10.2018
 */
public class ValidateInputTest {
    /**
     * Дефолтный вывод в консоль.
     */
    private final PrintStream out = System.out;

    /**
     * Буфер для результата.
     */
    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();

    /**
     * @param хранит ссылку на массив пунктов меню.
     */
    private List<Integer> range = new ArrayList();

    /**
     * Метод loadMem - заменяет стандартный вывод на вывод в пямять для тестирования.
     */
    @Before
    public void loadMem() {
        range = Arrays.asList(0, 1, 2, 3, 4, 5, 6);
        System.setOut(new PrintStream(this.mem));
    }

    /**
     * Метод loadSys - возвращает обратно стандартный вывод в консоль.
     */
    @After
    public void loadSys() {
        System.setOut(this.out);
    }

    /**
     * Тест - Пользователь ввел некорректное значение (не числовое).
     */
    @Test
    public void whenInvalidInputNFE() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"invalid", "1"})
        );
        input.ask("Ввод: ", range);
        assertThat(
                this.mem.toString(),
                is(
                        String.format("Пожалуйста введите корректное значение.%n")
                )
        );
    }

    /**
     * Тест - Пользователь ввел некорректное значение (не из списка меню).
     */
    @Test
    public void whenInvalidInputMOE() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"25", "1"})
        );
        input.ask("Ввод: ", range);
        assertThat(
                this.mem.toString(),
                is(
                        String.format("Пожалуйста введите значение из списка.%n")
                )
        );
    }
}
