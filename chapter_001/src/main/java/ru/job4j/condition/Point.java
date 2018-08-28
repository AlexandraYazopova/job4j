package ru.job4j.condition;

/**
 * Class Point.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 28.08.2018
 */
public class Point {

    /**
     * Contains X coordinate.
     */
    private int x;

    /**
     * Contains Y coordinate.
     */
    private int y;

    /**
     * Constructor Point of new point.
     * @param x - X coordinate.
     * @param y - Y coordinate.
     */
    public  Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Method distanceTo.
     * @param that - enter point.
     * @return Distance from current point to enter point.
     */
    public double distanceTo(Point that) {
        return Math.sqrt(
                Math.pow(that.x - this.x, 2) + Math.pow(that.y - this.y, 2)
        );
    }
}
