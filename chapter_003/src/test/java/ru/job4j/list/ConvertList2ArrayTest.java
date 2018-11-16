package ru.job4j.list;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

/**
 * Test.
 *
 * @author Alexandra Yazopova (mailto:aleaxndra.yaz@gmail.com)
 * @version 1
 * @since 13.11.2018
 */
public class ConvertList2ArrayTest {
    /**
     * Тест на конвертацию листа из 9 значений в двумерный массив 3*3.
     */
    @Test
    public void when9ElementsThen3to3() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Assert.assertThat(result, Is.is(expect));
    }

    /**
     * Тест на конвертацию листа из 8 значений в двумерный массив 4*2.
     */
    @Test
    public void when8ElementsThen4to2() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8),
                4
        );
        int[][] expect = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8}
        };
        Assert.assertThat(result, Is.is(expect));
    }

    /**
     * Тест на конвертацию листа из 7 значений в двумерный массив 3*3.
     */
    @Test
    public void when7ElementsThen3to3() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        Assert.assertThat(result, Is.is(expect));
    }

    /**
     * Тест на конвертацию листа из 9 значений в двумерный массив 5*2.
     */
    @Test
    public void when9ElementsThen5to2() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9),
                5
        );
        int[][] expect = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8},
                {9, 0}
        };
        Assert.assertThat(result, Is.is(expect));
    }
}
