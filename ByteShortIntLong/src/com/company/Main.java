package com.company;

public class Main {

    public static void main(String[] args) {
        //Intetger Miin and Max value
        int maxValue  = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        System.out.println("Min : " + minValue);
        System.out.println("Max : "+ maxValue);

        //Byte Values..
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(myMinByteValue);
        System.out.println(myMaxByteValue);

        //Short Values

        short myShortValue = Short.MIN_VALUE;
        short myShorMaxValue = Short.MAX_VALUE;
        System.out.println(myShortValue);
        System.out.println(myShorMaxValue);

        //Long Values
        long value = 100l;
        long myLongMinValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;
        System.out.println(myLongMinValue);
        System.out.println(myLongMaxValue);

        //Casting...
        byte myNewByteValue = (byte) (myMaxByteValue/2);
        short myNewShortValue =  (short) (myShortValue/2);

        //Challenge
        byte rb = 1;
        short rs = 2;
        int ri = 3;
        long longTotal = 5000L + 10L * (rb + rs + ri);
        System.out.println(longTotal);


    }
}
