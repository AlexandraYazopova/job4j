package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Alexandra Yazopova (mailto:aleaxndra.yaz@gmail.com)
 * @version 1
 * @since 01.09.2018
 */
public class SquareTest {

    /**
     * Test to create the array of 3 numbers.
     */
    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9};
        assertThat(rst, is(expect));
    }

    /**
     * Test to create the array of 6 numbers.
     */
    @Test
    public void whenBound6() {
        int bound = 6;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9, 16, 25, 36};
        assertThat(rst, is(expect));
    }

    /**
     * Test to create the array of 0 numbers.
     */
    @Test
    public void whenBound0Then0() {
        int bound = 0;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {};
        assertThat(rst, is(expect));
    }

    /**
     * Test to create the array of 10 numbers.
     */
    @Test
    public void whenBound10() {
        int bound = 10;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
        assertThat(rst, is(expect));
    }
}
