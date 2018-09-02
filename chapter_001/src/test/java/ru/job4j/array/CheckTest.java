package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Alexandra Yazopova (mailto:aleaxndra.yaz@gmail.com)
 * @version 1
 * @since 02.09.2018
 */
public class CheckTest {

    /**
     * Test to check the array mono by true. Odd amount.
     */
    @Test
    public void whenDataMonoByTrueThenTrueOddAmount() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * Test to check the array not mono. Odd amount.
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    /**
     * Test to check the array mono by true. Even amount.
     */
    @Test
    public void whenDataMonoByTrueThenTrueEvenAmount() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * Test to check the array not mono. Even amount.
     */
    @Test
    public void whenDataNotMonoByTrueThenFalseEvenAmount() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, true, false};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}
