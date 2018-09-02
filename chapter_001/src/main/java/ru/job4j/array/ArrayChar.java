package ru.job4j.array;

/**
 * Class ArrayChar.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 02.09.2018
 */
public class ArrayChar {

    /**
     * Contains array.
     */
    private char[] data;

    /**
     * Constructor ArrayChar of new array.
     * @param line - a string of words.
     */
    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Method startWith - to check the array starts from prefix.
     * @param prefix -  the prefix.
     * @return Result.
     */
      public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int index = 0; index != value.length; index++) {
            if (data[index] != value[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
