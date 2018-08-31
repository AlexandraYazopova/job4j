package ru.job4j.max;
/**
 * Class Max.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 31.08.2018
 */
public class Max {

    /**
     * Method max - maximum between first and second args.
     * @param first - first arg.
     * @param second - second arg.
     * @return Maximum arg.
     */
    public int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }

    /**
     * Method max - maximum between three args.
     * @param first - first arg.
     * @param second - second arg.
     * @param third - third arg.
     * @return Maximum arg.
     */
    public int max(int first, int second, int third) {
        int temp = this.max(first, second);
        temp = this.max(temp, third);
        return temp;
    }
}
