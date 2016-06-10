package com.twpathashala.game;

//Understands to print
class Display {
    boolean printMine(Mine mine) {
        String[][] set = mine.getInput();
        for (int i = 0; i < mine.getRows(); i++) {
            for (int j = 0; j < mine.getColumns(); j++) {
                System.out.print(set[i][j]);
            }
            System.out.println();
        }
        return true;
    }

    boolean printReveal(Mine mine, Reveal reveal) {
        String[][] set = reveal.getInput();
        for (int i = 0; i < mine.getRows(); i++) {
            for (int j = 0; j < mine.getColumns(); j++) {
                System.out.print(set[i][j]);
            }
            System.out.println();
        }
        return true;
    }
}
