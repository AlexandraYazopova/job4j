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

    /**
     * Main.
     * @param args - args.
     */
    public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);
        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками А и В : " + result);
    }
}
