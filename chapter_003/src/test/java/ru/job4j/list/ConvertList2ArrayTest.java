package ru.job4j.list;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    /**
     * Тест на конвертацию листа массивов в один лист значений.
     */
    @Test
    public void convert2listOn1list() {
        ConvertList2Array convertList = new ConvertList2Array();
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{1, 2});
        list.add(new int[]{3, 4, 5, 6});
        List<Integer> expect = Arrays.asList(
                1, 2, 3, 4, 5, 6
        );
        List<Integer> result = convertList.convert(list);
        Assert.assertThat(result, Is.is(expect));
    }

    /**
     * Тест на конвертацию листа массивов в один лист значений.
     */
    @Test
    public void convert3listOn1list() {
        ConvertList2Array convertList = new ConvertList2Array();
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{3, 4, 5, 6});
        list.add(new int[]{8});
        list.add(new int[]{10, 11});
        List<Integer> expect = Arrays.asList(
                3, 4, 5, 6, 8, 10, 11
        );
        List<Integer> result = convertList.convert(list);
        Assert.assertThat(result, Is.is(expect));
    }
}
