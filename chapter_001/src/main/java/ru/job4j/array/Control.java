package ru.job4j.array;

/**
 * Class Control - to union two sorted arrays in the third sorted array.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 13.09.2018
 */
public class Control {

    /**
     * Method sort - to sort the array.
     * @param arrayFirst -  the first sorted array.
     * @param arraySecond -  the second sorted array.
     * @return The third sorted array.
     */
    public int[] sortArray(int[] arrayFirst, int[] arraySecond) {
        int[] arrayThird = new int[arrayFirst.length + arraySecond.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arrayFirst.length && j < arraySecond.length) {
            if (arrayFirst[i] < arraySecond[j]) {
                arrayThird[k] = arrayFirst[i];
                i++;
            } else {
                arrayThird[k] = arraySecond[j];
                j++;
            }
            k++;
        }
        while (i < arrayFirst.length) {
            arrayThird[k] = arrayFirst[i];
            i++;
            k++;
        }

        while (j < arraySecond.length) {
            arrayThird[k] = arraySecond[j];
            j++;
            k++;
        }
        return arrayThird;
    }
}
