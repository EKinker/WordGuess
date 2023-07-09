package com.github.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class HangmanTest {

    @Test
    public void testPrintArray() {
        char[] array = {'h','a','n','g','m','a','n'};
        String actual = Hangman.printArray(array);
        String expected = "h a n g m a n ";

        Assert.assertEquals(actual, expected);
    }

    public void testAnnounceGame() {
    }

    public void testGameOver() {
    }

    public void testInitializeGameState() {
    }

    //@Test
    public void testGetNextGuess() {
       // String guess = Hangman.getNextGuess("guess");

    }

    public void testIsWordGuessed() {
    }

    public void testAskToPlayAgain() {
    }

    public void testPrintCurrentState() {
    }

    public void testProcess() {
    }

    public void testPlayerWon() {
    }

    public void testPlayerLost() {
    }
}
