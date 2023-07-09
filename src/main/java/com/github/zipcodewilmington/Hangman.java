package com.github.zipcodewilmington;


/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {

    public static void main(String[] args) {
        Hangman hangman = new Hangman();
        hangman.runGame();
    }

    //instance variables
    String[] wordList = {"arrogant", "beautiful", "claustrophobic", "dragonfly", "exorcist"};
    int guessesRemaining= 0;

    public void runGame(){
        welcome();


    }


    private static void welcome() {
        System.out.println("Welcome to Word Guess.  Let's play!");
        System.out.println("Try to guess my word:");
    }
}
