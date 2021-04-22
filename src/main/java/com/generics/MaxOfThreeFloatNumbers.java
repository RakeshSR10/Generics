package com.generics;

public class MaxOfThreeFloatNumbers {
    //print only maximum of Three Float objects
    public static Float testMaximum(Float x, Float y, Float z) {
        Float max = x;//Assume initially x is maximum
        if(y.compareTo(max) > 0) {
            max = y;
        }
        if(z.compareTo(max) > 0) {
            max = z;
        }
        printMax(x,y,z, max);
        System.out.println("----------------------------");
        return max;
    }

    private static <T> void printMax(Float x, Float y, Float z, Float max) {
        System.out.printf(" Max of (%s, %s, %s) = %s\n",x,y,z,max);
    }

    public static void main(String[] args) {
        //UC2
        Float xFlo=6.6f, yFlo=8.8f, zFlo=7.7f;
        MaxOfThreeFloatNumbers.testMaximum(xFlo, yFlo, zFlo);
    }
}
