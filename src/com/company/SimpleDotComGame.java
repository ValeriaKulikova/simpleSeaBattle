package com.company;

public class SimpleDotComGame {

    public static void main(String[] args) {
        int numOfGuesses = 0;

        GameHelper helper = new GameHelper();


        int randomNum = (int) ( Math.random() * 5 );
        int[] locations = { randomNum, randomNum + 1, randomNum + 2 };

        SimpleDotCom theDotCom = new SimpleDotCom();
        theDotCom.setLocationCells(locations);

        boolean isAlive = true;
        while (isAlive) {
            String guess = helper.getUserInput("Введите число");

            String result = theDotCom.checkYourself(guess);

            numOfGuesses++;

            if ("Потопил".equals(result)) {
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
            }
        }
    }



}
