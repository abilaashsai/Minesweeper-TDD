package com.twpathashala.game;

//Understands the Mine field
class MinefieldInputParse {
    private final int ROW;
    private final int COLUMN;
    private int k = 0;

    MinefieldInputParse(int ROW, int COLUMN) {
        this.ROW = ROW;
        this.COLUMN = COLUMN;
    }

    Mine categorization(String input) throws GameEnd {
        String[][] output = new String[ROW][COLUMN];
        if (input == null || input.length() != ((ROW + 1) * COLUMN) - 1) {
            endGame();
        }
        char[] letters = input.toCharArray();
        convertTo2DStringArray(output, letters);
        return new Mine(output);
    }

    private void convertTo2DStringArray(String[][] output, char[] letters) throws GameEnd {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                isValidInput(letters[k]);
                output[i][j] = String.valueOf(letters[k]);
                k++;
            }
            k++;
        }
    }

    private void isValidInput(char letter) throws GameEnd {
        if (String.valueOf(letter).isEmpty()) {
            endGame();
        }
        if (!(String.valueOf(letter).equals("x")) && !(String.valueOf(letter).equals("m"))) {
            endGame();
        }
    }

    private void endGame() throws GameEnd {
        throw new GameEnd("Enter Valid MineField Input");
    }
}
