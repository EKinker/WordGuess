package com.github.zipcodewilmington;


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

    //array of strings of words player could guess
    public void runGame(){   //all output and input should be in specialized methods, not in runGame()
        //game picks a random word      //Use Random class

        //while keep playing?  (outer loop)
            //start game
            //set word guessed to false
                // while word isn't guessed (inner loop)
                    //print current game state
                    //ask for a guess (1 letter)

                    //check the letter against th word
                    //increment number of guesses

                    //if word is guessed
                        //player won
                    // if too many guesses
                        //player loses
             // play again?
        //game over
    }

    public void printArray(char[] arrayName) { // print out characters from the array with a space between
        //for loop
    }
    public void announceGame() { //print welcome

    }

    public void gameOver() { //if no longer playing

    }

    public void initializeGameState() { //setsup char[] for secret word and guesses

    }

    public void getNextGuess() { //returns a char from player input   //use Scanner class

    }

    public void isWordGuessed() {  //returns boolean

    }

    public void askToPlayAgain() {  //returns boolean

    }

    public void printCurrentState() {  //uses printArray to show player where they are at

    }

    public void process() {  //loops through the word array, looking for the input guess, replaces the "_" with the guessed char if found

    }

    public void playerWon() { //    :)

    }

    public void playerLost() { //   :(

    }
}
