package ru.job4j.loop;

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
public class CounterTest {
    /**
     * Test to calculate the sum of even numbers.
     */
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
    Counter counter = new Counter();
    int result = counter.add(1, 10);
    assertThat(result, is(30));
    }
}