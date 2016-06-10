package com.twpathashala.game;

import com.sun.org.apache.regexp.internal.RE;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserInputParseTest {
    @Test
    public void categorizationShouldReturnCallOpenReveal() throws GameEnd {
        String[][] set = new String[][]{{"x", "x", "x"}, {"x", "m", "x"}, {"x", "x", "x"}};
        Mine mine = new Mine(set);
        Reveal reveal = new Reveal(mine);
        UserInputParse userInputParse =new UserInputParse(reveal);
        assertTrue(userInputParse.categorization("o(0,0)"));
    }
}
