package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue = 10000;
        int myMaxValue = Integer.MAX_VALUE;
        int myMinValue = Integer.MIN_VALUE;
//        System.out.println(myMaxValue);
//        System.out.println(myMinValue);

        //Byte

        byte byteMinValue = Byte.MIN_VALUE;
        byte byteMaxValue = Byte.MAX_VALUE;
//        System.out.println(byteMinValue);
//        System.out.println(byteMaxValue);



        short shortMinValue = Short.MIN_VALUE;
        short shortMaxValue = Short.MAX_VALUE;
        System.out.println(shortMinValue);
        System.out.println(shortMaxValue);

        long myLongValue = Long.MAX_VALUE;

        //Challenge

        byte numByte = 1;
        short shortnum =2;
        int intnum = 3;
        long longNum = 50000L +10L * (numByte + intnum + shortnum);
        System.out.println(longNum);

    }
}
