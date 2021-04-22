package com.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxOfFourObjectsTest <T extends Comparable<T>>{
    //UC4 passing 4 arguments and Test maximum of Integers, Float Numbers, Strings
    @Test
    public void givenThreeObject_IsMaximum_ShouldReturnTrue(){
        Assertions.assertEquals(10,new MaximumOfFourObjects(4,5,3,10).maximum());
        Assertions.assertEquals(8.8f,new MaximumOfFourObjects(6.6f, 2.2f, 8.8f,1.23f).maximum());
        Assertions.assertEquals("peach",new MaximumOfFourObjects("orange", "peach", "apple","banana").maximum());
    }
}
