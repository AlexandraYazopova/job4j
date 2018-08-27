package ru.job4j.converter;

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

public class ConverterTest {
    /**
     * Test converter rubles to dollar.
     */
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    /**
     * Test converter rubles to euro.
     */
    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }

    /**
     * Test converter dollars to rubles.
     */
    @Test
    public void when7DollarToRubleThen420() {
        Converter converter = new Converter();
        int result = converter.dollarToRubles(7);
        assertThat(result, is(420));
    }

    /**
     * Test converter euro to rubles.
     */
    @Test
    public void when7EuroToRubleThen490() {
        Converter converter = new Converter();
        int result = converter.euroToRubles(7);
        assertThat(result, is(490));
    }
}