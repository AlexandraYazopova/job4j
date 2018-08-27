package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Alexandra Yazopova (mailto:aleaxndra.yaz@gmail.com)
 * @version 1
 * @since 27.08.2018
 */

public class CalculatorTest {
    /**
     * Test addition.
     */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Test subtract.
     */
    @Test
    public void whenSubtractTenMinusTwoThenEight() {
        Calculator calc = new Calculator();
        calc.subtract(10D, 2D);
        double result = calc.getResult();
        double expected = 8D;
        assertThat(result, is(expected));
    }

    /**
     * Test division.
     */
    @Test
    public void whenDivisionTenOnTwoThenFive() {
        Calculator calc = new Calculator();
        calc.div(10D, 2D);
        double result = calc.getResult();
        double expected = 5D;
        assertThat(result, is(expected));
    }

    /**
     * Test multiple.
     */
    @Test
    public void whenMultipleTenOnTwoThenTwenty() {
        Calculator calc = new Calculator();
        calc.multiple(10D, 2D);
        double result = calc.getResult();
        double expected = 20D;
        assertThat(result, is(expected));
    }
}
