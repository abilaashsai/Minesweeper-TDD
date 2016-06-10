package com.twpathashala.game;

//Understands the user choice
class Reveal {
    Mine mine;
    private int count = 0;
    final private int TotalRow;
    final int TotalColumn;
    private String[][] input;
    Display display;

    Reveal(Mine mine) {
        this.mine = mine;
        TotalRow = mine.getRows();
        TotalColumn = mine.getColumns();
        input = new String[TotalRow][TotalColumn];
        for (int i = 0; i < TotalRow; i++) {
            for (int j = 0; j < TotalColumn; j++) {
                input[i][j] = "x";
            }
        }
    }

    public Boolean open(int row, int column) throws GameEnd {
        if (!mine.exist(row, column)) {
            if (!input[row][column].equals("F") && input[row][column].equals("x")) {
                count++;
            }
            if (count == TotalRow * TotalColumn) {
                throw new GameEnd("Wow, you cleared the minefield ! Game over !");
            }
            input[row][column] = String.valueOf(mine.getAdjacent());
            return true;
        }
        throw new GameEnd("Oops, you stepped on a mine ! Game over !");
    }

    public Boolean flag(int row, int column) throws GameEnd {
        if (!"x".equals(input[row][column]) && !input[row][column].equals("F")) {
            return false;
        }
        input[row][column] = "F";
        count++;
        if (count == TotalRow * TotalColumn) {
            throw new GameEnd("Wow, you cleared the minefield ! Game over !");
        }
        return true;
    }

    String[][] getInput() {
        return input;
    }
}
