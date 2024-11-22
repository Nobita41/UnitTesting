package com.TestExample.ServiceTest;

import com.TestExample.Services.CalculatorServicee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServiceTestJUnit5Test
{


    @Test
    public void addTwoNumbersTest(){
         int actualResult = CalculatorServicee.addTwoNumbers(12, 45);
         int expectedResult=57;
        Assertions.assertEquals(expectedResult,actualResult,"Test Fail");

    }
    @Test
    public void sumAnyNumberTest(){
    int result = CalculatorServicee.sumAnyNumber(10, 30, 70);
        int expectedResult=110;
        Assertions.assertEquals(expectedResult,result,"Test Fail");
    }
}