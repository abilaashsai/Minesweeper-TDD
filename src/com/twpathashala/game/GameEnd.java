package com.twpathashala.game;

//Understands when game is over
class GameEnd extends Exception {
    GameEnd(String message) {
        super(message);
    }
}
