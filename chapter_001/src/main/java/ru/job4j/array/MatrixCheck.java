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
            for (int j = 0; j != data.length - 1; j++) {
                if ((i == j) && (data[i][j] != data[i + 1][j + 1])) {
                    result = false;
                    break;
                }
                if ((j == data.length - i - 2) && (data[i][j + 1] != data[i + 1][j])) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}