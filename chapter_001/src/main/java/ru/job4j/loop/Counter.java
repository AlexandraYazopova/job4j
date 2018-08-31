package ru.job4j.loop;

/**
 * Class Counter.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 31.08.2018
 */
public class Counter {

    /**
     * Method add - the sum of even numbers.
     * @param start -  the beginning of the range.
     * @param finish -  the end of the range.
     * @return Sum.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = 0; start <= finish; i++) {
            if (start % 2 == 0) {
            sum = sum + start;
            }
            start++;
        }
        return sum;
    }
}
