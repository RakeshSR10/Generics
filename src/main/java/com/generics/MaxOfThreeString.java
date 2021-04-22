package com.generics;

public class MaxOfThreeString {
    //print only maximum of Three Strings objects
    public static String testMaximum(String x, String y, String z) {
        String max = x;//Assume initially x is maximum
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

    private static <T> void printMax(String x, String y, String z, String max) {
        System.out.printf(" Max of (%s, %s, %s) = %s\n",x,y,z,max);
    }

    public static void main(String[] args) {
        //UC3
        String xStr="peach", yStr="apple", zStr="orange";
        MaxOfThreeString.testMaximum(xStr, yStr, zStr);
    }
}
