package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс ConvertMatrix2List - конвертация массива в лист.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 14.11.2018
 */
public class ConvertMatrix2List {

    /**
     * Метод конвертирует двумерный массив в лист
     * @param array - массив
     * @return лист
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] i : array) {
            for (int j : i) {
                list.add(j);
            }
        }return list;
    }
}
