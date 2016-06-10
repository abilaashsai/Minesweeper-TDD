package com.twpathashala.game;

//Understands how to print
class Display {
    private String[][] input;

    boolean mineElements(Mine mine) {
        input = mine.getInput();
        printInFormat(mine);
        return true;
    }

    boolean revealElements(Mine mine, Reveal reveal) {
        input = reveal.getInput();
        printInFormat(mine);
        return true;
    }

    private void printInFormat(Mine mine) {
        for (int i = 0; i < mine.getRows(); i++) {
            for (int j = 0; j < mine.getColumns(); j++) {
                System.out.print(input[i][j]);
            }
            System.out.println();
        }
    }
}
