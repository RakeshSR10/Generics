package com.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxStringTest {
    //UC3 -->TC 3.1 for First String is maximum
    @Test
    public void givenFirstString_IsMaximum_ShouldReturnTrue(){
        Assertions.assertEquals("peach",MaxOfThreeString.testMaximum("peach" ,"apple","orange"));
    }
    //UC3 -->TC 3.2 for Second String is maximum
    @Test
    public void givenSecondString_IsMaximum_ShouldReturnTrue(){
        Assertions.assertEquals("mango",MaxOfThreeString.testMaximum("grapes","mango","apple"));
    }

    //UC3 -->TC 3.3 for Third String is maximum
    @Test
    public void givenThirdInteger_IsMaximum_ShouldReturnTrue(){
        Assertions.assertEquals("strowberry",MaxOfThreeString.testMaximum("apple","banana","strowberry"));
    }
}
