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
    static int guessesLeft;
    String wordToGuess = wordList[new Random().nextInt(wordList.length)]; //game picks a random word //Use Random class
    char[] lettersInWord = new char[wordToGuess.length()];
    public void runGame() {   //all output and input should be in specialized methods, not in runGame()
        //int randomInd = new Random().nextInt(wordList.length);  //possibly remove


        //while keep playing?  (outer loop)
        //while (playGame) {
            System.out.println(wordToGuess);  //test.  Remove later
            initializeGameState();
            //start game
            //set word guessed to false
            boolean isGuessed = false;
            // while word isn't guessed (inner loop)
            while (!isGuessed) {
                printCurrentState();  //print current game state
                process(getPlayerInput()); //ask for a guess (1 letter) and check for letter in word

                //increment number of guesses

                //if word is guessed
                //player won
                // if too many guesses
                //player loses
            }
            // play again?
       // }
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
        for (int i = 0; i < lettersInWord.length; i++){
            lettersInWord[i] = '_';
        }
        guessesLeft = wordToGuess.length();

    }

    public static char getPlayerInput() { //returns a char from player input   //use Scanner class
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char letter = input.charAt(0);

        return letter;
    }



    public void isWordGuessed() {  //returns boolean

    }

    public void askToPlayAgain() {  //returns boolean

    }

    public void printCurrentState() {  //uses printArray to show player where they are at
        System.out.println(printArray(lettersInWord));
        System.out.println(remainingGuesses());
    }

    private static String remainingGuesses() {
        String playsLeft = "Guesses Remaining: ";
        for (int i = 0; i< guessesLeft; i++ ) {
            playsLeft+="X";
        }
        return playsLeft;
    }

    public void process(char input) {  //loops through the word array, looking for the input guess, replaces the "_" with the guessed char if found

        for (int i = 0; i < wordToGuess.length(); i ++){
            char ch = wordToGuess.charAt(i);
            if (ch == input) {
                lettersInWord[i]= ch;
            }
        }
    }

    public void playerWon() { //    :)

    }

    public void playerLost() { //   :(

    }
}
