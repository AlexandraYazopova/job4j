package ru.job4j.array;

/**
 * Class BubbleSort.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 02.09.2018
 */
public class BubbleSort {

    /**
     * Method sort - to sort the array.
     * @param array -  the array.
     * @return Sorted array.
     */
    public int[] sort(int[] array) {
        for (int index = 0; index != array.length - 1; index++) {
            for (int i = 0; i != array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
             }
        }
        return array;
    }
}