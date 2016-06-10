package com.twpathashala.game;

class MinefieldInputParse {
    private int row;
    private int column;
    private int k = 0;
    private Mine mine;

    MinefieldInputParse(int row, int column) {
        this.row = row;
        this.column = column;
    }

    Mine categorization(String input) {
        String[][] output = new String[row][column];
        char[] letters = input.toCharArray();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                output[i][j] = String.valueOf(letters[k]);
                k++;
            }
            k++;
        }
        mine=new Mine(output);
        return mine;
    }
}
