package com.company;

public class Main {

    public static void main(String[] args) {
        // A Mile to Kilometer
//        double Kilnmeters = (100 * 1.609344);
//        int highScore = 50;
//        if(highScore == 50){
//            System.out.println("This is an expression");

        //Statements...
//        int myVariable = 50;
//        myVariable++;
//        myVariable--;
//        System.out.println("This is a  test" + myVariable);
        //
//        boolean gameOver = true;
//        int score = 10000;
//        int levelCompleted =5;
//        if(score == 5000){
//            System.out.println("High Score");
//        }else if (score==9000){
//            System.out.println("Need More Score to pass the test!");
//        }else{
//            System.out.println("No condition met!");


        //Methods in Java
        calculateScore(true,800,5,100);

    }

    public static void calculateScore(boolean gameOver, int score ,int levelCompleted,int bonus){
        if(gameOver){
            int finalScore  = score + (levelCompleted * bonus);
            System.out.println(finalScore);
        }
    }


}



