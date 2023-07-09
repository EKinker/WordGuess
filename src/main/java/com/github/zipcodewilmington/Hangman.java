package com.github.zipcodewilmington;

import java.util.Random;
import java.util.Scanner;


/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {

    public static void main(String[] args) {
        Hangman game = new Hangman();
        game.runGame();
    }

    //instance variables    //use to sync all the game state

    public static void println(String output, Object... args) {print(output + "\n", args);}
    public static void print(String output, Object... args) {System.out.printf(output, args);}   //this is from Sci Calc

    public static boolean playGame = true;
    //array of strings of words player could guess
    String[] wordList = {"alphabet", "breakfast", "cockatiel", "dragonfly", "enormous", "figurehead", "gathering"};
    static int guessesLeft = 5;

    public void runGame() {   //all output and input should be in specialized methods, not in runGame()
        //int randomInd = new Random().nextInt(wordList.length);
        String wordToGuess = wordList[new Random().nextInt(wordList.length)]; //game picks a random word //Use Random class

        //while keep playing?  (outer loop)
        while (playGame) {
            System.out.println(wordToGuess);  //test.  Remove later
            //start game
            //set word guessed to false
            boolean isGuessed = false;
            // while word isn't guessed (inner loop)
            while (!isGuessed) {


                //print current game state
                //ask for a guess (1 letter)

                //check the letter against th word
                //increment number of guesses

                //if word is guessed
                //player won
                // if too many guesses
                //player loses
            }
            // play again?
        }
        //game over
    }

    public static String printArray(char[] array) { // print out characters from the array with a space between
        String spacedWord = "";
        //for loop
        for (int i = 0; i < array.length; i++) {
            spacedWord += (array[i]) + " ";
        }
        return spacedWord.toString();
    }

    public void announceGame() { //print welcome
        System.out.println("Welcome to Hangman!  Or \"Word Guess\" or whatever.  Let's play!");
    }

    public void gameOver() { //if no longer playing
        System.out.println("Game Over. Thank you for playing!");
        playGame =false;
    }

    public void initializeGameState() { //sets up char[] for secret word and guesses
        //for (char element:)
    }

    public static String getPlayerInput(String prompt) { //returns a char from player input   //use Scanner class
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        return scanner.nextLine();
    }



    public void isWordGuessed() {  //returns boolean

    }

    public void askToPlayAgain() {  //returns boolean

    }

    public void printCurrentState() {  //uses printArray to show player where they are at
        String playsLeft = "Guesses Remaining: ";
        for (int i = 0; i< guessesLeft; i++ ) {
            playsLeft+="X";
        }
    }

    public void process() {  //loops through the word array, looking for the input guess, replaces the "_" with the guessed char if found

    }

    public void playerWon() { //    :)

    }

    public void playerLost() { //   :(

    }
}
