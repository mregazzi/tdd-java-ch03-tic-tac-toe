package com.packtpublishing.tddjava.ch03tictactoe;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Matteo Regazzi on 16/06/2016.
 */
public class SevenElevenTest {
    private SevenEleven sevenEleven;

    @Before
    public final void before(){
        sevenEleven = new SevenEleven();
    }

    @Test
    public void firstTurnTwo6Loose(){
        assertLoose(6,6);
    }

    @Test
    public void firstTurnTwo1Loose(){
        assertLoose(1,1);
    }

    @Test
    public void firstTurnSevenWin(){
        assertWin(4,3);
    }

    @Test
    public void firstTurnElevenWin(){
        assertWin(5,6);
    }

    @Test
    public void otherTurnSevenLoose() {
        sevenEleven.play(3,5);
        assertLoose(4,3);
    }

    @Test
    public void otherTurnElevenLoose() {
        sevenEleven.play(3,5);
        assertLoose(5,6);
    }

    @Test
    public void otherTurnLauchAgain(){
        sevenEleven.play(3,5);
        sevenEleven.play(3,8);
        sevenEleven.play(1,3);
        assertLaunchAgain(6,3);
    }

    @Test
    public void otherTurnRepeatWin(){
        sevenEleven.play(3,5);
        sevenEleven.play(3,8);
        sevenEleven.play(1,3);
        assertWin(6,2);
    }

    private void assertLoose(int die1, int die2) {
        assertEquals("Loose", (sevenEleven.play(die1, die2)));
    }

    private void assertWin(int die1, int die2){
        assertEquals("Win", (sevenEleven.play(die1, die2)));
    }

    private void assertLaunchAgain(int die1, int die2){
        assertEquals("Launch again", (sevenEleven.play(die1, die2)));
    }

}
