package com.twpathashala.game;

//Understands the location of mine
class Mine {
    private final String[][] SET;
    private int adjacent;
    private final String MINE = "m";

    Mine(String[][] SET) {
        this.SET = SET;
    }

    boolean exist(int row, int column) {
        adjacent = 0;
        if (isMine(SET[row][column])) {
            return true;
        }
        addValueIfMineExistLeft(row, column);
        addValueIfMineExistRight(row, column);
        addValueIfMineExistTop(row, column);
        addValueIfMineExistDown(row, column);
        return false;
    }

    private void addValueIfMineExistDown(int row, int column) {
        if ((column + 1) < getColumns()) {
            addIfMineExist(SET[row][column + 1]);
        }
    }

    private void addValueIfMineExistTop(int row, int column) {
        if ((column - 1) >= 0) {
            addIfMineExist(SET[row][column - 1]);
        }
    }

    private void addValueIfMineExistRight(int row, int column) {
        if ((row + 1) < getRows()) {
            addIfMineExist(SET[row + 1][column]);
        }
    }

    private void addValueIfMineExistLeft(int row, int column) {
        if ((row - 1) >= 0) {
            addIfMineExist(SET[row - 1][column]);
        }
    }

    private void addIfMineExist(String s) {
        if (s.equals(MINE)) {
            adjacent++;
        }
    }

    private boolean isMine(String s) {
        return (s.equals(MINE));
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

    public boolean print() {
        for (int i = 0; i < getRows(); i++) {
            iterateColumns(SET[i]);
            System.out.println();
        }
        return true;
    }

    private void iterateColumns(String[] strings) {
        for (int j = 0; j < getColumns(); j++) {
            System.out.print(strings[j]);
        }
    }
}
