package com.twpathashala.game;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RevealTest {
    @Test
    public void openShouldReturn0When0_0IsPassed() throws GameEnd {
        String[][] set = new String[][]{{"x", "x", "x"}, {"x", "m", "x"}, {"x", "x", "x"}};
        Mine mine = new Mine(set);
        Reveal reveal = new Reveal(mine);
        assertTrue(reveal.open(0, 0));
    }

    @Test
    public void openShouldReturn2When0_1IsPassed() throws GameEnd {
        String[][] set = new String[][]{{"x", "x", "m"}, {"x", "m", "x"}, {"x", "x", "x"}};
        Mine mine = new Mine(set);
        Reveal reveal = new Reveal(mine);
        assertTrue(reveal.open(0, 1));
    }

    @Test
    public void openShouldReturnFWhen1_1IsPassed() throws GameEnd {
        String[][] set = new String[][]{{"x", "x", "x"}, {"x", "m", "x"}, {"x", "x", "x"}};
        Mine mine = new Mine(set);
        Reveal reveal = new Reveal(mine);
        assertTrue(reveal.flag(1, 1));
    }

    @Test
    public void openShouldReturn1When1_0IsPassed() throws GameEnd {
        String[][] set = new String[][]{{"x", "x", "x"}, {"x", "m", "x"}, {"x", "x", "x"}};
        Mine mine = new Mine(set);
        Reveal reveal = new Reveal(mine);
        reveal.open(1, 0);
        assertFalse(reveal.flag(1, 0));
    }

    @Test(expected = GameEnd.class)
    public void openShouldReturn1When1_0IsPassed1() throws GameEnd {
        String[][] set = new String[][]{{"x", "x", "x"}, {"x", "m", "x"}, {"x", "x", "x"}};
        Mine mine = new Mine(set);
        Reveal reveal = new Reveal(mine);
        reveal.open(0, 0);
        reveal.open(0, 1);
        reveal.open(0, 2);
        reveal.open(1, 0);
        reveal.flag(1, 1);
        reveal.open(1, 2);
        reveal.open(2, 0);
        reveal.open(2, 1);
        reveal.open(2, 2);
    }

    @Test(expected = GameEnd.class)
    public void openShouldReturn1When1_0IsPassed11() throws GameEnd {
        String[][] set = new String[][]{{"x", "x", "x"}, {"x", "m", "x"}, {"x", "x", "x"}};
        Mine mine = new Mine(set);
        Reveal reveal = new Reveal(mine);
        reveal.open(0, 0);
        reveal.open(0, 1);
        reveal.open(0, 2);
        reveal.open(1, 0);
        reveal.open(1, 2);
        reveal.flag(2, 0);
        reveal.flag(1, 1);
        reveal.open(2, 1);
        reveal.open(2, 2);
        reveal.open(2, 0);
    }

    @Test(expected = GameEnd.class)
    public void openShouldReturn1When1_0IsPassed111() throws GameEnd {
        String[][] set = new String[][]{{"x", "x", "x"}, {"x", "m", "x"}, {"x", "x", "x"}};
        Mine mine = new Mine(set);
        Reveal reveal = new Reveal(mine);
        reveal.open(0, 0);
        reveal.open(0, 1);
        reveal.open(0, 2);
        reveal.open(1, 0);
        reveal.flag(1, 1);
        reveal.flag(1, 1);
        reveal.open(1, 2);
        reveal.open(2, 0);
        reveal.open(2, 1);
        reveal.flag(2, 1);
        reveal.open(2, 2);
    }
}
