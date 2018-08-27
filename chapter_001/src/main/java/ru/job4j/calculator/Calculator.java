package ru.job4j.calculator;

/**
 * Class Calculator.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 27.08.2018
 */

public class Calculator {

    /**
     * Contains Result.
     */
    private double result;

    /**
     * Method add.
     * @param first - first arg.
     * @param second - second arg.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Method subtract.
     * @param first - first arg.
     * @param second - second arg.
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Method div.
     * @param first - first arg.
     * @param second - second arg.
     */
    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Method multiple.
     * @param first - first arg.
     * @param second - second arg.
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    /**
     * Method getResult.
     * @return - result.
     */
    public double getResult() {
        return this.result;
    }
}
