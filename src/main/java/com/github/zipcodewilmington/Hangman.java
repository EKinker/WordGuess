package com.github.zipcodewilmington;

import java.util.Scanner;
import java.util.Random;

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
        String wordToGuess = wordList[new Random().nextInt(wordList.length)]; //game picks a random word
        welcome();

        char[] lettersInWord = new char[wordToGuess.length()];

        for (int i = 0; i < lettersInWord.length; i ++) {
            lettersInWord[i] = "_";
        }
        guessesRemaining = wordToGuess.length();
        System.out.print("Guesses Remaining: ");
        for(int i = 0; i < guessesRemaining; i++){
            System.out.print("X");
        }

        System.out.println(wordToGuess);
        System.out.println(guessesRemaining);


        playerInput();

    }

    private static char playerInput() {
        Scanner scanner = new Scanner(System.in);
        String playerInput = scanner.nextLine(); //take player input
        char letter = playerInput.charAt(0); //only take the first character of whatever is written
        return letter;
    }


    private static void welcome() {
        System.out.println("Welcome to Word Guess.  Let's play!");
        System.out.println("Try to guess my word:");
    }
}
