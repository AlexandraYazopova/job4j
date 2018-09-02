package ru.job4j.array;

/**
 * Class Check.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 02.09.2018
 */
public class Check {

    /**
     * Method mono - to check the array mono or not.
     * @param data -  the array.
     * @return Result.
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
       for (int index = 0; index != data.length - 1; index++) {
           if (data[index] != data[index + 1]) {
               result = false;
               break;
           }
       }
        return result;
    }
}

