package com.twpathashala.game;

//Understands the input
class UserInputParse {
    private final Reveal REVEAL;
    private int row;
    private int column;

    UserInputParse(Reveal REVEAL) {
        this.REVEAL = REVEAL;
    }

    Boolean categorization(String input) throws GameEnd {
        char[] letters = input.toCharArray();
        row = Integer.parseInt(String.valueOf(letters[2]));
        column = Integer.parseInt(String.valueOf(letters[4]));
        if (letters[0] == 'o' || letters[0] == 'O') {
            return REVEAL.open(row, column);
        }
        if (letters[0] == 'f' || letters[0] == 'F') {
            return REVEAL.flag(row, column);
        }
        throw new GameEnd("Input not Accepted, Game Over");
    }
}
