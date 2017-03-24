package com.company;

public class SimpleDotComTest {
    private static SimpleDotCom dot = new SimpleDotCom();

    private static void beforeEveryTest() {
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);
        dot.setNumOfHits(0);
    }


    public static void main(String[] args) {
        test_success();
        test_fail();
        test_endGame();
    }

    private static void test_success() {
        beforeEveryTest();
        String userGuess = "2";

        String result = dot.checkYourself( userGuess );

        checkTestResult("Попал", result);
    }

    private static void test_fail() {
        beforeEveryTest();
        String userGuess = "202";

        String result = dot.checkYourself( userGuess );

        checkTestResult("Мимо", result);
    }

    private static void test_endGame() {
        beforeEveryTest();
        String result = dot.checkYourself( "2" );
        result = dot.checkYourself( "3" );
        result = dot.checkYourself( "4" );

        checkTestResult("Потопил", result);
    }



    private static void checkTestResult(String expectedResult, String realResult) {
        if (expectedResult.equals(realResult)) {
            System.out.println("Тест пройден");
        } else {
            System.out.println("Тест не пройден");
        }
    }
}
