package com.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxFloatTest {
    //UC2 -->TC 2.1 for First Float Number is maximum
    @Test
    public void givenFirstFloatNumber_IsMaximum_ShouldReturnTrue(){
        Assertions.assertEquals(6.5f,MaxOfThreeFloatNumbers.testMaximum(6.5f ,4.1f,5.1f));
    }
    //UC2 -->TC 2.2 for Second Float Number is maximum
    @Test
    public void givenSecondFloatNumber_IsMaximum_ShouldReturnTrue(){
        Assertions.assertEquals(7.1f,MaxOfThreeFloatNumbers.testMaximum(6.5f,7.1f,5.1f));
    }

    //UC2 -->TC 2.3 for Third Float Number is maximum
    @Test
    public void givenThirdFloatNumber_IsMaximum_ShouldReturnTrue(){
        Assertions.assertEquals(10.2f,MaxOfThreeFloatNumbers.testMaximum(6.2f,7.2f,10.2f));
    }
}
