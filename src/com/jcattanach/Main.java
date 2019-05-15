package com.jcattanach;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println(highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println(highScore);

        int highScorePosition = calculateHighScorePostion(1500);
        displayHighScorePosition("Tim", highScorePosition);
        highScorePosition = calculateHighScorePostion(900);
        displayHighScorePosition("Bob", highScorePosition);
        highScorePosition = calculateHighScorePostion(400);
        displayHighScorePosition("Percy", highScorePosition);
        highScorePosition = calculateHighScorePostion(50);
        displayHighScorePosition("Gilbert", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into positioon " + highScorePosition + " on the high score table!");
    }

    public static int calculateHighScorePostion(int playerScore) {

        if(playerScore >= 1000){
            return 1;
        } else if (playerScore >= 500){
            return 2;
        } else if (playerScore >= 100){
            return 3;
        } else {
            return 4;
        }
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }

        return -1;

    }
}