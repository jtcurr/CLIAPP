package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelComplete = 5;
        int bonus =100;

        scoreCalculator(score, bonus, levelComplete, gameOver);

    }

    public static void scoreCalculator(int gameScore, int levelBonus, int level, boolean gameStatus) {
        if (gameScore < 5000 && gameScore > 1000 ) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (gameScore < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }

        if (gameStatus) {
            int finalScore = gameScore + (level * levelBonus);
        }
    }

    public static void scoreCalculator(int gameScore) {
        return -1;
    }

    public static void scoreCalculator(int levelBonus) {
        return levelBonus;
    }

    public static int levelCalculator(int changeState, int changeLevel) {
        if (changeState) {
            System.out.println("State changed");
        } else if (changeLevel) {
            System.out.println("Level changed");
        } else {
            System.out.println("Got here");
        }
    }
    public static void levelObselete() {
        if (!changeState) {
            System.out.println("Level does not exist");
        }
    }
    public static String levelRemove(String levelToRemove) {
        if(levelToRemove) {
            return null;
        }
    }
}

