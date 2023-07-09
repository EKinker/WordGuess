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
    public static boolean playGame = true;

    //array of strings of words player could guess
    String[] wordList = {"alphabet", "breakfast", "cockatiel", "dragonfly", "enormous", "fancy", "gathering","handkerchief","iguana","jaguar","kindergarten", "loquacious", "malcontent", "narrator", "overloaded", "penguin", "quarrelsome","roadmap","shellfish","tangerine","unicorn","valentine","wombat","xylophone", "yankee", "zephyr" };
    static int guessesLeft;

    public void runGame() {   //all output and input should be in specialized methods, not in runGame()
        //int randomInd = new Random().nextInt(wordList.length);  //possibly remove
        announceGame();

        //while keep playing?  (outer loop)
        while (playGame) {
            String wordToGuess = wordList[new Random().nextInt(wordList.length)]; //game picks a random word //Use Random class
            char[] lettersInWord = new char[wordToGuess.length()];

            //System.out.println(wordToGuess);  //test.  Remove later

            initializeGameState(lettersInWord,wordToGuess);
            //start game
            //set word guessed to false
            boolean isGuessed = false;
            // while word isn't guessed (inner loop)
            while (!isGuessed && guessesLeft > 0) {
                printCurrentState(lettersInWord);  //print current game state
                System.out.print("Guess a letter: ");
                process(getPlayerInput(),lettersInWord,wordToGuess); //ask for a guess (1 letter) and check for letter in word
                isGuessed = isWordGuessed(lettersInWord);

            }
                if (isGuessed){
                    playerWon();
                }
                if (guessesLeft == 0){
                    playerLost(wordToGuess);
                }

            // play again?
            askToPlayAgain();
        }
        gameOver();//game over
    }

    public static String printArray(char[] array) { // print out characters from the array with a space between
        String spacedWord = "";
        //for loop
        for (int i = 0; i < array.length; i++) {
            spacedWord += (array[i]) + " ";
        }
        return spacedWord;
    }

    public void announceGame() { //print welcome
        System.out.println("Welcome to Hangman!  Or \"Word Guess\" or whatever.  Let's play!");
    }

    public void gameOver() { //if no longer playing
        System.out.println("Game Over. Thank you for playing!");
        playGame =false;
    }

    public void initializeGameState(char[] ch, String word) { //sets up char[] for secret word and guesses
        for (int i = 0; i < ch.length; i++){
            ch[i] = '_';
        }
        guessesLeft = word.length();

    }

    public static char getPlayerInput() { //returns a char from player input   //use Scanner class
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char letter = input.toLowerCase().charAt(0);
        if (letter == '-') {
            System.exit(0);
        } else if (!Character.isLetter(letter)){

            return ' ';
        }
        return letter;
    }



    public boolean isWordGuessed(char[] ch) {  //returns boolean
        boolean game = true;
        for (int i = 0; i < ch.length; i ++) {
            if (ch[i] == '_') {
                game = false;
            }
        }
        return game;
    }

    public void askToPlayAgain() {  //returns boolean
        System.out.print("Would you like to play again?");
        char response = getPlayerInput();
        if (response == 'n') {
            playGame = false;
        }


    }

    public void printCurrentState(char[] ch) {  //uses printArray to show player where they are at
        System.out.println(printArray(ch));
        System.out.println(remainingGuesses());
    }

    private static String remainingGuesses() {
        String playsLeft = "Guesses Remaining: ";
        for (int i = 0; i< guessesLeft; i++ ) {
            playsLeft+="X";
        }
        return playsLeft;
    }

    public void process(char input, char[] chAr, String word) {  //loops through the word array, looking for the input guess, replaces the "_" with the guessed char if found
        boolean correctGuess = false;
        for (int i = 0; i < word.length(); i ++){
            char ch = word.charAt(i);
            if (ch == input) {
                chAr[i]= ch;
                correctGuess = true;
            }
        }
        if (!correctGuess) { guessesLeft--;}
    }

    public void playerWon() { //    :)
        System.out.println("You guessed the word!");
    }

    public void playerLost(String word) { //   :(
        System.out.println("Oh no! You didn't guess the word in time. The word was \'" +word + "\'. Womp Womp :(");
    }
}
