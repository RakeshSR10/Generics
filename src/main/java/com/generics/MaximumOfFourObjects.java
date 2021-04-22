package com.generics;

public class MaximumOfFourObjects <T extends Comparable<T>>{
    T w,x,y,z;

    public MaximumOfFourObjects(T w, T x, T y, T z) {
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T maximum() {
        return MaximumOfFourObjects.maximum(w, x, y, z);
    }

    //Determine the largest of three Comparable Objects int, float, String
    public static <T extends Comparable<T>> T maximum(T w, T x, T y, T z) {
        T max = w; //assume w is initially largest
        if(x.compareTo(max) > 0){
            max = x;
        }
        if(y.compareTo(max) > 0) {
            max = y;
        }
        if(z.compareTo(max) > 0) {
            max = z;
        }
        printMax(w,x, y, z,max);
        return max;
    }

    public static <T> void printMax(T w, T x, T y, T z, T max) {
        System.out.printf("Max of (%s, %s, %s, %s) = %s\n", w,x, y, z, max);
    }
    public static void main(String[] args) {
        //UC4 passing 4 arguments
        Integer wInt= 10, xInt=3, yInt=4, zInt=5;
        Float wFlo=5.5f, xFlo=10.10f, yFlo=8.8f, zFlo=7.7f;
        String wStr="bananas", xStr="peach", yStr="apple", zStr="orange";

        new MaximumOfFourObjects(wInt, xInt, yInt, zInt).maximum();
        new MaximumOfFourObjects(wFlo, xFlo, yFlo, zFlo).maximum();
        new MaximumOfFourObjects(wStr, xStr, yStr, zStr).maximum();
    }
}

