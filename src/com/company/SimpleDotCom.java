package com.company;

public class SimpleDotCom {
    private int[] locationCells;
    private int numOfHits = 0;

    void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }

    String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";

        for ( int cell : locationCells ) {
            if ( guess == cell ) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }

        if ( numOfHits == locationCells.length ) {
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }



}
