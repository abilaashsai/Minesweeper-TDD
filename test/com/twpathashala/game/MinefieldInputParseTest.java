package com.twpathashala.game;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class MinefieldInputParseTest {

    @Test(expected = GameEnd.class)
    public void categorizationShouldThrowExceptionWhenInputInvalid() throws GameEnd {
        String input = "xxx,mmx,xx";
        MinefieldInputParse minefieldInputParse = new MinefieldInputParse(3, 3);
        minefieldInputParse.categorization(input);
    }

    @Test(expected = GameEnd.class)
    public void categorizationShouldThrowExceptionWhenInputIsNull() throws GameEnd {
        String input = null;
        MinefieldInputParse minefieldInputParse = new MinefieldInputParse(3, 3);
        minefieldInputParse.categorization(input);
    }
}
