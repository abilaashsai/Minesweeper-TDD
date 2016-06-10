package com.twpathashala.game;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class DisplayTest {
    @Test
    public void printShouldDisplayMineMatrix() throws GameEnd {
        String[][] set = new String[][]{{"x", "x", "x"}, {"x", "m", "x"}, {"x", "x", "x"}};
        Mine mine = new Mine(set);
        Reveal reveal = new Reveal(mine);
        reveal.open(0, 0);
        Display display = new Display();
        assertTrue(display.revealElements(mine, reveal));
    }

    @Test
    public void printShouldDisplayRevealMatrix() throws GameEnd {
        String[][] set = new String[][]{{"x", "x", "x"}, {"x", "m", "x"}, {"x", "x", "x"}};
        Mine mine = new Mine(set);
        Display display = new Display();
        assertTrue(display.mineElements(mine));
    }
}
