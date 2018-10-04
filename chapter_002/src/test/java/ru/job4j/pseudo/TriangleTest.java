package ru.job4j.pseudo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Alexandra Yazopova (mailto:aleaxndra.yaz@gmail.com)
 * @version 1
 * @since 03.10.2018
 */
public class TriangleTest {
    /**
     * Тест на получение псевдоизображения трегольника.
     */
    @Test
    public void whenDrawTriangle() {
        Triangle triangle = new Triangle();
        assertThat(
                triangle.draw(),
                is(new StringBuilder()
                        .append("   +   ")
                        .append("  +++  ")
                        .append(" +++++ ")
                        .append("+++++++")
                        .toString()
                )
        );
    }
}
