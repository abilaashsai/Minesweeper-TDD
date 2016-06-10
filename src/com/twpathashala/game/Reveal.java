package com.twpathashala.game;

//Understands the user choice
class Reveal {
    private final Mine MINE;
    private int count = 0;
    private final int TOTALROWS;
    private final int TotalColumn;
    private final String[][] input;
    private final String INITIALSTATE = "x";


    Reveal(Mine MINE) {
        this.MINE = MINE;
        TOTALROWS = MINE.getRows();
        TotalColumn = MINE.getColumns();
        input = new String[TOTALROWS][TotalColumn];
        initializeToInitialState();
    }

    Boolean open(int row, int column) throws GameEnd {
        if (!MINE.exist(row, column)) {
            trackIfInInitialState(input[row][column]);
            checkIfClearedMineField();
            input[row][column] = String.valueOf(MINE.getAdjacent());
            return true;
        }
        throw new GameEnd("Oops, you stepped on a MINE ! Game over !");
    }

    Boolean flag(int row, int column) throws GameEnd {
        String FLAG = "F";
        if (!INITIALSTATE.equals(input[row][column]) && !input[row][column].equals(FLAG)) {
            return false;
        }
        input[row][column] = FLAG;
        count++;
        checkIfClearedMineField();
        return true;
    }

    String[][] getInput() {
        return input;
    }

    private void initializeToInitialState() {
        for (int i = 0; i < TOTALROWS; i++) {
            for (int j = 0; j < TotalColumn; j++) {
                input[i][j] = INITIALSTATE;
            }
        }
    }

    private void checkIfClearedMineField() throws GameEnd {
        if (count == TOTALROWS * TotalColumn) {
            throw new GameEnd("Wow, you cleared the minefield ! Game over !");
        }
    }

    private void trackIfInInitialState(String s) {
        if (s.equals(INITIALSTATE)) {
            count++;
        }
    }
}
