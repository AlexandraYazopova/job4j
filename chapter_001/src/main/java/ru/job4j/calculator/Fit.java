package ru.job4j.calculator;

/**
 * Class Fit for ideal fit.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 27.08.2018
 */

public class Fit {

    /**
     * Method manWeight - ideal man weight.
     * @param height man height.
     * @return Ideal weight.
     */
    public double manWeight(double height) {
        return (height - 100D) * 1.15;
    }

    /**
     * Method womanWeight - ideal woman weight.
     * @param height woman height.
     * @return Ideal weight.
     */
    public double womanWeight(double height) {
        return (height - 110D) * 1.15;
    }
}