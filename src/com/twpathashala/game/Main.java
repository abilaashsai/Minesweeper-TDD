package com.twpathashala.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Understands the game progress until game is over
public class Main {
    private final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String Args[]) throws IOException, GameEnd {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string;
        System.out.println("Enter the minefield layout : ");
        System.out.println("Enter number of rows : ");
        int rows = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter number of columns: ");
        int columns = Integer.parseInt(bufferedReader.readLine());
        MinefieldInputParse minefieldInputParse = new MinefieldInputParse(rows, columns);
        System.out.println("Enter the minefield layout values: ");
        string = bufferedReader.readLine();
        Mine mine = minefieldInputParse.categorization(string);
        Reveal reveal = new Reveal(mine);
        Display display = new Display();
        display.revealElements(reveal);
        Main main = new Main();
        main.readInputUntilGameOver(reveal, display);
    }

    private void readInputUntilGameOver(Reveal reveal, Display display) throws IOException, GameEnd {
        String string;
        while (true) {
            System.out.println("Enter option :");
            string = bufferedReader.readLine();
            UserInputParse userInputParse = new UserInputParse(reveal);
            if (userInputParse.categorization(string)) {
                display.revealElements(reveal);
            }
        }
    }
}
