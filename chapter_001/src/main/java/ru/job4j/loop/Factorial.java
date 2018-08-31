package ru.job4j.loop;

/**
 * Class Factorial
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 31.08.2018
 */
public class Factorial {

    /**
     * Method calc - the factorial of number.
     * @param n -  a number.
     * @return Factorial.
     */
    public int calc(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
