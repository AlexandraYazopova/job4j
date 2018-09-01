package ru.job4j.array;

/**
 * Class Square.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 01.09.2018
 */
public class Square {

    /**
     * Method calculate - to create an array.
     * @param bound -  the limit of the array.
     * @return The array.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i != bound; i++) {
            rst[i] = (i + 1) * (i + 1);
        }
        return rst;
    }
}
