package com.twpathashala.game;

//Understands the location of mine
class Mine {
    private final String[][] SET;
    private int adjacent;

    Mine(String[][] SET) {
        this.SET = SET;
    }

    boolean exist(int row, int column) {
        adjacent = 0;
        if (isMine(SET[row][column])) return true;
        addValueIfMineExistLeft(row, column);
        addValueIfMineExistRight(row, column);
        addValueIfMineExistTop(row, column);
        addValueIfMineExistDown(row, column);
        return false;
    }

    private void addValueIfMineExistDown(int row, int column) {
        if ((column + 1) < getColumns()) {
            if (SET[row][column + 1].equals("m")) {
                adjacent++;
            }
        }
    }

    private void addValueIfMineExistTop(int row, int column) {
        if ((column - 1) >= 0) {
            if (SET[row][column - 1].equals("m")) {
                adjacent++;
            }
        }
    }

    private void addValueIfMineExistRight(int row, int column) {
        if ((row + 1) < getRows()) {
            if (SET[row + 1][column].equals("m")) {
                adjacent++;
            }
        }
    }

    private void addValueIfMineExistLeft(int row, int column) {
        if ((row - 1) >= 0) {
            if (SET[row - 1][column].equals("m")) {
                adjacent++;
            }
        }
    }

    private boolean isMine(String s) {
        if (s.equals("m")) {
            return true;
        }
        return false;
    }

    int getAdjacent() {
        return adjacent;
    }

    int getRows() {
        return SET.length;
    }

    int getColumns() {
        return SET[0].length;
    }

    String[][] getInput() {
        return SET;
    }
}
