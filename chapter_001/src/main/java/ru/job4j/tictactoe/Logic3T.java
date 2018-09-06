package ru.job4j.tictactoe;

public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    public boolean hasGap() {
        boolean result = false;
        for (int i =0; i != table.length; i++) {
            for (int j =0; j != table.length; j++) {
                if ((!table[i][j].hasMarkX()) && !table[i][j].hasMarkO()) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public boolean isWinnerX() {
        return win(true);
    }

    public boolean isWinnerO() {
        return win(false);
    }

    private boolean hasMark(Figure3T cell, boolean checkMarkX) {
        if (checkMarkX) {
                checkMarkX = cell.hasMarkX();
        } else {
                checkMarkX = cell.hasMarkO();
        }
        return checkMarkX;
    }

    public boolean win(boolean checkMarkX) {
        boolean winner = false;
        for (int i =0; i != table.length  && !winner; i++) {
            winner = true;
            for (int j =0; j != table.length; j++) {
                if (!hasMark(table[i][j], checkMarkX)) {
                    winner = false;
                    break;
                }
            }
        }

        if (!winner) {
            for (int i =0; i != table.length && !winner; i++) {
                winner = true;
                for (int j =0; j != table.length; j++) {
                    if (!hasMark(table[j][i], checkMarkX)) {
                        winner = false;
                        break;
                    }
                }
            }
        }

        if (!winner) {
            winner = true;
            for (int i =0; i != table.length; i++) {
                if (!hasMark(table[i][i], checkMarkX)) {
                    winner = false;
                    break;
                }
            }
        }

        if (!winner) {
            winner = true;
            for (int i =0; i != table.length; i++) {
                if (!hasMark(table[table.length - i - 1][i], checkMarkX)) {
                    winner = false;
                    break;
                }
            }
        }
        return winner;
    }
}