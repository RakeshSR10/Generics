package com.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxOfThreeObjectsTest <T extends Comparable<T>>{
    //Refactor code 1 fot Test maximum of Integers, Float Numbers, Strings
    @Test
    public void givenThreeObject_IsMaximum_ShouldReturnTrue(){
        Assertions.assertEquals(5,new MaximumOfThreeObjects(4,5,3).maximum());
        Assertions.assertEquals(8.8f,new MaximumOfThreeObjects(6.6f, 2.2f, 8.8f).maximum());
        Assertions.assertEquals("peach",new MaximumOfThreeObjects("orange", "peach", "apple").maximum());
    }
}