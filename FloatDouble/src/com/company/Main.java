package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println(myMinFloatValue);
        System.out.println(myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println(myMinDoubleValue);
        System.out.println(myMaxDoubleValue);
        int newIntValue = 5;
        float newFloatvalue = 5f/3f;
        double newDoubleValue = 5d/3d;

        System.out.println(newIntValue);
        System.out.println(newFloatvalue);

        System.out.println(newDoubleValue);

        //Challenge
        double numberOfPounds = 200d;
        double convertedToKiloGrams  = numberOfPounds * 0.45335d;
        System.out.println(convertedToKiloGrams);


    }
}
