package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Alexandra Yazopova (mailto:aleaxndra.yaz@gmail.com)
 * @version 1
 * @since 31.08.2018
 */
public class MaxTest {
    /**
     * Test - to choose max arg between two args.
     */
    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 5);
        assertThat(result, is(5));
    }
    /**
     * Test - to choose max arg between three args.
     */
    @Test
    public void whenFirstMaxSecondAndThird() {
        Max maxim = new Max();
        int result = maxim.max(7, 5, 3);
        assertThat(result, is(7));
    }

    /**
     * Test - to choose max arg between three args.
     */
    @Test
    public void whenSecondMaxFirstAndThird() {
        Max maxim = new Max();
        int result = maxim.max(3, 8, 4);
        assertThat(result, is(8));
    }

    /**
     * Test - to choose max arg between three args.
     */
    @Test
    public void whenThirdMaxFirstAndSecond() {
        Max maxim = new Max();
        int result = maxim.max(3, 4, 5);
        assertThat(result, is(5));
    }
}

