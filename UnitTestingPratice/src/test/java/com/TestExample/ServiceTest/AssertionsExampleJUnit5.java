package com.TestExample.ServiceTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsExampleJUnit5
{
    @Test
    public void test1()
    {
        System.out.println("This is the Assertion method test");
        int acutal=12;
        int excepted=12;
        Assertions.assertEquals(excepted,acutal);
    }

}
