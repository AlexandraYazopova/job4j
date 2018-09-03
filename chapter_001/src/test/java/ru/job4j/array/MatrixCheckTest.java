package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Alexandra Yazopova (mailto:aleaxndra.yaz@gmail.com)
 * @version 1
 * @since 03.09.2018
 */
public class MatrixCheckTest {

    /**
     * Test to check the diagonal of the array mono by true. Odd amount.
     */
    @Test
    public void whenDataMonoByTrueThenTrueOddAmount() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true},
                {false, true, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * Test to check the diagonal of the array not mono. Odd amount.
     */
    @Test
    public void whenDataNotMonoThenFalseOddAmount() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, false},
                {false, false, true},
                {false, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    /**
     * Test to check the diagonal of the array mono by true. Even amount.
     */
    @Test
    public void whenDataMonoByTrueThenTrueEvenAmount() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, false, false},
                {false, true, false, true},
                {true, false, true, true},
                {false, false, true, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * Test to check the diagonal of the array mono by true. Even amount.
     */
    @Test
    public void whenDataNotMonoThenFalseEvenAmount() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, false, false},
                {false, true, false, true},
                {true, false, false, true},
                {false, false, true, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}