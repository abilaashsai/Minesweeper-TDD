package com.twpathashala.game;

import org.junit.Test;
import org.junit.internal.ArrayComparisonFailure;

import java.util.Arrays;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
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

    @Test
    public void getAdjacentShouldReturn1WhenMineIn1_1() {
        String[][] set = new String[][]{{"x", "x", "x"}, {"x", "m", "x"}, {"x", "x", "x"}};
        Mine mine = new Mine(set);
        mine.exist(0, 1);
        assertEquals(1, mine.getAdjacent());
    }

    @Test
    public void getRowsShouldReturn3For3RowsInput() {
        String[][] set = new String[][]{{"x", "x", "x"}, {"x", "m", "x"}, {"x", "x", "x"}};
        Mine mine = new Mine(set);
        assertEquals(3, mine.getRows());
    }

    @Test
    public void getColumnShouldReturn3For3ColumnInput() {
        String[][] set = new String[][]{{"x", "x", "x"}, {"x", "m", "x"}, {"x", "x", "x"}};
        Mine mine = new Mine(set);
        assertEquals(3, mine.getColumns());
    }

    @Test
    public void getInputShouldBeSameAsInput() {
        String[][] set = new String[][]{{"x", "x", "x"}, {"x", "m", "x"}, {"x", "x", "x"}};
        Mine mine = new Mine(set);
        assertTrue(Arrays.deepEquals(set, mine.getInput()));
    }
}
