package org.example;

import org.testng.annotations.*;

public class TestNGExample {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("execute before the test suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("execute after the test suite");
    }

    @Test(priority = 1)
    public void testCase1(){
        System.out.println("A normal Test case 1");
    }
    @Test(priority = 0)
    public void testCase2(){
        System.out.println("A normal Test case 2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("execute before every method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("execute after every method");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Execute before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("Execute after class");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("execute before the test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("execute after the test");
    }


}
