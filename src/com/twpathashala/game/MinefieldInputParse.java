package com.twpathashala.game;

class MinefieldInputParse {
    private final int ROW;
    private final int COLUMN;
    private int k = 0;

    MinefieldInputParse(int ROW, int COLUMN) {
        this.ROW = ROW;
        this.COLUMN = COLUMN;
    }

    Mine categorization(String input) {
        String[][] output = new String[ROW][COLUMN];
        char[] letters = input.toCharArray();
        convertTo2DStringArray(output, letters);
        return new Mine(output);
    }

    private void convertTo2DStringArray(String[][] output, char[] letters) {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                output[i][j] = String.valueOf(letters[k]);
                k++;
            }
            k++;
        }
    }
}
