package ru.job4j.chess;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import java.util.Optional;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Logic {
    private final Figure[] figures = new Figure[32];
    private int index = 0;

    public void add(Figure figure) {
        this.figures[this.index++] = figure;
    }

    public boolean move(Cell source, Cell dest) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        int index = this.findBy(source);
        if (index == -1) {
            throw new FigureNotFoundException("Фигура не найдена");
        }
        if (!this.checkWay(source, dest, index)) {
            throw new ImpossibleMoveException("Фигура так ходить не может");
        }
        if (!this.checkPath(source, dest)) {
            throw new OccupiedWayException("На пути находятся другие фигуры");
        }
        this.figures[index] = this.figures[index].copy(dest);
        return true;
    }

    public void clean() {
        for (int position = 0; position != this.figures.length; position++) {
            this.figures[position] = null;
        }
        this.index = 0;
    }

    private int findBy(Cell cell) {
        int rst = -1;
        for (int index = 0; index != this.figures.length; index++) {
            if (this.figures[index] != null && this.figures[index].position().equals(cell)) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    private boolean checkWay(Cell source, Cell dest, int index) {
        boolean rst = false;
        Cell[] steps = this.figures[index].way(source, dest);
        if (steps.length > 0 && steps[steps.length - 1].equals(dest)) {
            rst = true;
        }
        return rst;
    }

    private boolean checkPath(Cell source, Cell dest) {
        boolean rst = true;

        return rst;
    }
}