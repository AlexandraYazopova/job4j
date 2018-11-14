package ru.job4j.list;

import java.util.List;

/**
 * Класс ConvertList2Array - конвертация листа в двумерный массив.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 09.11.2018
 */
public class ConvertList2Array {

    /**
     * Метод конвертирует лист со значениями в двумерный массив
     * @param list - лист со значениями
     * @param rows - количество строк в массиве
     * @return массив
     */
    public int[][] toArray(List<Integer> list, int rows) {
        int cells;
        if (list.size() % rows == 0) {
            cells = list.size() / rows;
        } else {
            cells = list.size() / rows + 1;
        }
        int[][] array = new int[rows][cells];
        int index = 0;
        for (int i = 0; i != rows; i++) {
            for (int j = 0; j != cells; j++) {
                if (index < list.size()) {
                    array[i][j] = list.get(index++);
                } else {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }
}
