package ru.job4j.array;

/**
 * Class MatrixCheck.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 03.09.2018
 */
public class MatrixCheck {

    /**
     * Method mono - to check the diagonal of the array mono or not
     * @param data -  the array.
     * @return Result.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i != data.length - 1; i++) {
                if ((data[0][0] != data[i + 1][i + 1]) || (data[data.length - 1][0] != data[data.length - i - 2][i + 1])) {
                    result = false;
                    break;
                }
        }
        return result;
    }
}