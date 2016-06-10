package com.twpathashala.game;

//Understands the location of mine
class Mine {
    private String[][] set;
    private int adjacent;

    Mine(String[][] set) {
        this.set = set;
    }

    boolean exist(int row, int column) {
        adjacent = 0;
        if (set[row][column].equals("m")) {
            return true;
        }
        adjacent = 0;
        if ((row - 1) >= 0) {
            if (set[row - 1][column].equals("m")) {
                adjacent++;
            }
        }
        if ((row + 1) < getRows()) {
            if (set[row + 1][column].equals("m")) {
                adjacent++;
            }
        }
        if ((column - 1) >= 0) {
            if (set[row][column - 1].equals("m")) {
                adjacent++;
            }
        }
        if ((column + 1) < getColumns()) {
            if (set[row][column + 1].equals("m")) {
                adjacent++;
            }
        }
        return false;
    }

    int getAdjacent() {
        return adjacent;
    }

    int getRows() {
        return set.length;
    }

    int getColumns() {
        return set[0].length;
    }

    String[][] getInput() {
        return set;
    }
}
