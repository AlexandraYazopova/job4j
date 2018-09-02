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
public class BubbleSortTest {

    /**
     * Test to sort the array {1, 5, 4, 2, 3, 1, 7, 8, 0, 5}.
     */
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort sorting = new BubbleSort();
        int[] input = new int[] {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] result = sorting.sort(input);
        int[] expect = new int[] {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(result, is(expect));
    }

    /**
     * Test to sort the array {1, 5, 4, 2, 3, 1, 7}.
     */
    @Test
    public void whenSortArrayWithSevenElementsThenSortedArray() {
        BubbleSort sorting = new BubbleSort();
        int[] input = new int[] {1, 5, 4, 2, 2, 1, 7};
        int[] result = sorting.sort(input);
        int[] expect = new int[] {1, 1, 2, 2, 4, 5, 7};
        assertThat(result, is(expect));
    }
}
