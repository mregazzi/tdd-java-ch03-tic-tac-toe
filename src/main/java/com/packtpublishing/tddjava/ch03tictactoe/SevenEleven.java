package com.packtpublishing.tddjava.ch03tictactoe;

public class SevenEleven {
    private int die1;
    private int die2;
    private int turn = 0;
    private int firstScore = 0;

    public String play(int die1, int die2) {
        turn++;
        if (turn == 1) {
            firstScore = (die1 + die2);
        }
        this.die1 = die1;
        this.die2 = die2;
        return this.score();
    }

    private String score(){
        if (turn == 1 && (12 == (die1 + die2) || 2 == (die1 + die2))) {
            return "Loose";
        } else if (turn > 1 && (7 == (die1 + die2) || 11 == (die1 + die2))) {
            return "Loose";
        } else if (turn == 1 && (7 == (die1 + die2) || 11 == (die1 + die2))) {
            return "Win";
        } else if (turn > 1 && ((die1 + die2) == firstScore)){
            return "Win";
        }
        return "Launch again";
    }
}
