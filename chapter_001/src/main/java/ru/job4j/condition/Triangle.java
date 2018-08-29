package ru.job4j.condition;

/**
 * Class Triangle.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 29.08.2018
 */
public class Triangle {
    /**
     * Contains the first top of the triangle.
     */
    private Point a;

    /**
     * Contains the second top of the triangle.
     */
    private Point b;

    /**
     * Contains the third top of the triangle.
     */
    private Point c;

    /**
     * Constructor Point of new point.
     * @param a - a coordinate of the first top .
     * @param b - a coordinate of the second top.
     * @param c - a coordinate of the third top.
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Method period - to calculate a half of perimeter.
     * @param ab - a distance between a and b.
     * @param ac - a distance between a and c.
     * @param bc - a distance between b and c.
     * @return a half of perimeter.
     */
    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }

    /**
     * Method area - to calculate an area of the triangle.
     * @return an area of triangle.
     */
    public double area() {
        double rsl = -1;
        double ab = this.a.distanceTo(this.b);
        double ac = this.a.distanceTo(this.c);
        double bc = this.b.distanceTo(this.c);
        double p = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {

            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }

    /**
     * Method exist - check for existence of the triangle.
     * @param ab - a distance between a and b.
     * @param ac - a distance between a and c.
     * @param bc - a distance between b and c.
     * @return an existence of the triangle.
     */
    public boolean exist(double ab, double ac, double bc) {

        return ((ab + bc) > ac) && ((ab + ac) > bc) && ((bc + ac) > ab);

    }


}
