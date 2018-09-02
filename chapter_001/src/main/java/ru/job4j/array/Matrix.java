package ru.job4j.array;

/**
 * Class Matrix.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 03.09.2018
 */
public class Matrix {

    /**
     * Method multiple - to create the matrix.
     * @param size -  the size of matrix.
     * @return Matrix.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i != table.length; i++) {
            for (int j = 0; j != table.length; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
