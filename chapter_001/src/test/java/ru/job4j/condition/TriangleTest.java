package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test.
 *
 * @author Alexandra Yazopova (mailto:aleaxndra.yaz@gmail.com)
 * @version 1
 * @since 29.08.2018
 */
public class TriangleTest {
    /**
     * Test to calculate an area of the triangle.
     */
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 0);

        Triangle triangle = new Triangle(a, b, c);

        double result = triangle.area();
        double expected = 2D;
        assertThat(result, closeTo(expected, 0.1));
    }

    /**
     * Test to check for existence of the triangle.
     */
    @Test
    public void whenTriangleNotExist() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 0);

        Triangle triangle = new Triangle(a, b, c);

        boolean result = triangle.exist(2, 4, 6);
        boolean expect = false;
        assertThat(result, is(expect));
    }

    /**
     * Test to check for existence of the triangle.
     */
    @Test
    public void whenTriangleNotExistAgain() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 0);

        Triangle triangle = new Triangle(a, b, c);

        boolean result = triangle.exist(6, 4, 2);
        boolean expect = false;
        assertThat(result, is(expect));
    }
    /**
     * Test to check for existence of the triangle.
     */
    @Test
    public void whenTriangleNotExistAgainAndAgain() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 0);

        Triangle triangle = new Triangle(a, b, c);

        boolean result = triangle.exist(6, 2, 4);
        boolean expect = false;
        assertThat(result, is(expect));
    }
}
