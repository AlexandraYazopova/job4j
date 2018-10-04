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
public class SquareTest {
    /**
     * Тест на получение псевдоизображения квадрата.
     */
    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(
                square.draw(),
                is(new StringBuilder()
                        .append("++++++")
                        .append("++++++")
                        .append("++++++")
                        .append("++++++")
                        .toString()
                )
        );
    }
}
