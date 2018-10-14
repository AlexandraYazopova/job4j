package ru.job4j.pseudo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Alexandra Yazopova (mailto:aleaxndra.yaz@gmail.com)
 * @version 1
 * @since 03.10.2018
 */
public class PaintTest {
    /**
     * Дефолтный вывод в консоль.
     */
   private final PrintStream stdout = System.out;

    /**
     * Буфер для результата.
     */
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    /**
     * Метод loadOutput - заменяет стандартный вывод на вывод в пямять для тестирования.
     */
    @Before
    public void loadOutput() {
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
     * Тест на получение псевдоизображения квадрата.
     */
    @Test
    public void whenDrawSquare() {
        new Paint().draw(new Square());
        assertThat(
                new String(out.toByteArray()),
                is(new StringBuilder()
                        .append("++++++")
                        .append("++++++")
                        .append("++++++")
                        .append("++++++")
                        .append(System.lineSeparator())
                        .toString()
                )
        );
    }

    /**
     * Тест на получение псевдоизображения трегольника.
     */
    @Test
    public void whenDrawTriangle() {
        new Paint().draw(new Triangle());
        assertThat(
                new String(out.toByteArray()),
                is(new StringBuilder()
                        .append("   +   ")
                        .append("  +++  ")
                        .append(" +++++ ")
                        .append("+++++++")
                        .append(System.lineSeparator())
                        .toString()
                )
        );
    }
}
