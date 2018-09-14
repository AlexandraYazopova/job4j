package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Alexandra Yazopova (mailto:aleaxndra.yaz@gmail.com)
 * @version 1
 * @since 13.09.2018
 */
public class ControlTest {

    /**
     * Test to union and sort the first array {1, 2, 3, 4, 6} and the second array {2, 4, 8}.
     */
    @Test
    public void sortThirdArray() {
        Control sorting = new Control();
        int[] arrayFirst = new int[] {1, 2, 3, 4, 6};
        int[] arraySecond = new int[] {2, 4, 8};
        int[] result = sorting.sortArray(arrayFirst, arraySecond);
        int[] expect = new int[] {1, 2, 2, 3, 4, 4, 6, 8};
        assertThat(result, is(expect));
    }

    /**
     * Test to union and sort the first array {1, 8} and the second array {10}.
     */
    @Test
    public void sortThirdArrayAgain() {
        Control sorting = new Control();
        int[] arrayFirst = new int[] {1, 8};
        int[] arraySecond = new int[] {10};
        int[] result = sorting.sortArray(arrayFirst, arraySecond);
        int[] expect = new int[] {1, 8, 10};
        assertThat(result, is(expect));
    }
}
