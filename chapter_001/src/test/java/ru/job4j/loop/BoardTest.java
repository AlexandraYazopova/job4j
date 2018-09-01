package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Alexandra Yazopova (mailto:aleaxndra.yaz@gmail.com)
 * @version 1
 * @since 01.09.2018
 */

public class BoardTest {

    /**
     * Test to to create a chessboard 3 x 3.
     */
    @Test
    public void whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
        Board board = new Board();
        String result = board.paint(3, 3);
        final String line = System.getProperty("line.separator");
        assertThat(result,
                is(String.format("x x%s x %sx x%s", line, line, line)));
    }

    /**
     * Test to to create a chessboard 5 x 4.
     */
    @Test
    public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {
        Board board = new Board();
        String result = board.paint(5, 4);
        final String line = System.getProperty("line.separator");
        assertThat(result,
                is(String.format("x x x%s x x %sx x x%s x x %s", line, line, line, line)));
    }
}
