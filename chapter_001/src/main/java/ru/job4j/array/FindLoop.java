package ru.job4j.array;

/**
 * Class FindLoop.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 01.09.2018
 */
public class FindLoop {

    /**
     * Method calculate - to create an array.
     * @param data -  the array.
     * @param el -  the target value.
     * @return The index of target value.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index != data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
