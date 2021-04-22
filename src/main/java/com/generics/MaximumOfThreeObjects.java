package com.generics;

public class MaximumOfThreeObjects<T extends Comparable<T>>{
    T x,y,z;

    public MaximumOfThreeObjects(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T maximum() {
        return MaximumOfThreeObjects.maximum(x, y, z);
    }

    //Determine the largest of three Comparable Objects int, float, String
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; //assume x is initially largest
        if(y.compareTo(max) > 0) {
            max = y;
        }
        if(z.compareTo(max) > 0) {
            max = z;
        }
        printMax(x, y, z,max);
        return max;
    }

    public static <T> void printMax(T x, T y, T z, T max) {
        System.out.printf("Max of (%s, %s, %s) = %s\n", x, y, z, max);
    }
    public static void main(String[] args) {
        //Refactor code 1
        Integer xInt=3, yInt=4, zInt=5;
        Float xFlo=6.6f, yFlo=8.8f, zFlo=7.7f;
        String xStr="peach", yStr="apple", zStr="orange";

        new MaximumOfThreeObjects(xInt, yInt, zInt).maximum();
        new MaximumOfThreeObjects(xFlo, yFlo, zFlo).maximum();
        new MaximumOfThreeObjects(xStr, yStr, zStr).maximum();
    }
}

