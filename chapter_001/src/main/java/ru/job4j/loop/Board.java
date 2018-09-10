package ru.job4j.loop;

/**
 * Class Board.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 01.09.2018
 */
public class Board {

     /**
     * Method paint - to create a chessboard.
     * @param width -  the width of the chessboard.
     * @param height -  the height of the chessboard.
     * @return The chessboard.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String line = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 0) {
                    screen.append("x");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(line);
        }
        return screen.toString();
    }
}
