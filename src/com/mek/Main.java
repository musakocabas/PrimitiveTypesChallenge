package com.mek;

public class Main {

    public static void main(String[] args) {
        byte byteValue = 120;
        short shortValue = 15;
        int intValue = 250;

        long longValue = 50000L + (10 * (byteValue + shortValue + intValue));
        //System.out.println("total = "+ longValue);
        short shortTotal = (short) (byteValue + shortValue + intValue);
        byte byteTotal = (byte) (byteValue + shortValue + intValue);
        System.out.println("long value = " + longValue + " short total = " + shortTotal + " byte total = " + byteTotal);

        boolean isOr = (true || false) ? true : false; // 0 or 1 = 1
        boolean isAnd = (true && false) ? true : false; // 0 and 1 = 1
        System.out.println("isOr = " + isOr + " isAnd = " + isAnd);
    displayHighScorePosition("MUSA", calculateHighScorePosition(1500));
    displayHighScorePosition("ALİ",calculateHighScorePosition(900));
    displayHighScorePosition("EMRE",calculateHighScorePosition(400));
    displayHighScorePosition("MUSTAFA",calculateHighScorePosition(50));








    }//main
    public static void displayHighScorePosition(String name,int position){
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore>1000){
            return 1;
        }else if(playerScore>500 && playerScore<1000){
            return 2;
        }else if(playerScore>100 && playerScore<500){
            return 3;
        }else{
            return 4;
        }
    }
}//class
