package com.twpathashala.game;

//Understands how to print
class Display {
    private String[][] input;

    boolean mineElements(Mine mine) {
       return mine.print();
    }

    boolean revealElements(Reveal reveal) {
        return reveal.print();
    }


}
