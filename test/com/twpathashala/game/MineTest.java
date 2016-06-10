package com.twpathashala.game;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class MineTest {
    @Test
    public void existShouldReturnFalseWhenNoMineInLocation0_0() {
        String[][] set = new String[][]{{"x", "x", "x"}, {"x", "m", "x"}, {"x", "x", "x"}};
        Mine mine = new Mine(set);
        assertFalse(mine.exist(0, 0));
    }

    @Test
    public void existShouldReturnTrueWhenMineInLocation1_1() {
        String[][] set = new String[][]{{"x", "x", "x"}, {"x", "m", "x"}, {"x", "x", "x"}};
        Mine mine = new Mine(set);
        assertTrue(mine.exist(1, 1));
    }
}
