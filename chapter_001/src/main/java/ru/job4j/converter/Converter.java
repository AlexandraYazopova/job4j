package ru.job4j.converter;

/**
 * Class Converter.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 27.08.2018
 */
public class Converter {

     /**
     * Method rubleToDollar - converter rubles to dollar.
     * @param value rubles.
     * @return Dollar.
     */
    public int rubleToDollar(int value) {
        return value / 60;
    }

    /**
     * Method rubleToEuro - converter rubles to euro.
     * @param value rubles.
     * @return Euro.
     */
    public int rubleToEuro(int value) {
        return value / 70;
    }

    /**
     * Method dollarToRubles - converter dollars to rubles.
     * @param value dollars.
     * @return Rubles.
     */
    public int dollarToRubles(int value) {
        return value * 60;
    }

    /**
     * Method euroToRubles - converter euro to rubles.
     * @param value euro.
     * @return Rubles.
     */
    public int euroToRubles(int value) {
        return value * 70;
    }


}