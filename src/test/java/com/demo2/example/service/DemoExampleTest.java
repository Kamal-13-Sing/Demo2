package com.demo2.example.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DemoExampleTest {


    @Test
    public void addTest(){

        int actualResult = DemoExample.add(5,5);

        int expected = 10;

        Assert.assertEquals(expected, actualResult);

    }

    @Test
    public void productTest(){

        int result = DemoExample.product(5,5);
        int expected = 25;

        Assert.assertEquals(expected,result);

    }

}
