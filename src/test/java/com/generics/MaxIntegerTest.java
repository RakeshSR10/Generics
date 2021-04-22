package com.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxIntegerTest {
    //UC1 -->TC 1.1 for First Integer is maximum
    @Test
    public void givenFirstInteger_IsMaximum_ShouldReturnTrue(){
        Assertions.assertEquals(6,MaxOfThreeIntegers.testMaximum(6,4,5));
    }
    //UC1 -->TC 1.2 for Second Integer is maximum
    @Test
    public void givenSecondInteger_IsMaximum_ShouldReturnTrue(){
        Assertions.assertEquals(7,MaxOfThreeIntegers.testMaximum(6,7,5));
    }

    //UC1 -->TC 1.3 for Third Integer is maximum
    @Test
    public void givenThirdInteger_IsMaximum_ShouldReturnTrue(){
        Assertions.assertEquals(10,MaxOfThreeIntegers.testMaximum(6,7,10));
    }
}
