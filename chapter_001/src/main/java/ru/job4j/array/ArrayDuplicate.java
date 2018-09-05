package ru.job4j.array;
import java.util.Arrays;
/**
 * Class ArrayDuplicate.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 05.09.2018
 */
public class ArrayDuplicate {

    /**
     * Method remove - to drop duplicates.
     * @param array -  the array.
     * @return Sorted array.
     */
    public String[] remove(String[] array) {
        int unique = array.length;
        for (int out = 0; out < unique; out++) {
            for (int in = out + 1; in < unique; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[unique - 1];
                    unique--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, unique);

    }
}
