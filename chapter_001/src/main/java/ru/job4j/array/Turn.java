package ru.job4j.array;

/**
 * Class Turn.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 02.09.2018
 */
public class Turn {

    /**
     * Method turn - to turn the array.
     * @param array -  the array.
     * @return Inverted array.
     */
    public int[] turn(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int temp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;
        }
        return array;
    }
}
