package com.generics;

public class MaxOfThreeIntegers {
    //print only maximum of Three Integer objects
    public static Integer testMaximum(Integer x, Integer y, Integer z) {
        Integer max = x;//Assume initially x is maximum
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

    private static <T> void printMax(Integer x, Integer y, Integer z, Integer max) {
        System.out.printf(" Max of (%s, %s, %s) = %s\n",x,y,z,max);
    }

    public static void main(String[] args) {
        //UC1
        Integer xInt=6, yInt=4, zInt=5;
        MaxOfThreeIntegers.testMaximum(xInt, yInt, zInt);
    }
}
