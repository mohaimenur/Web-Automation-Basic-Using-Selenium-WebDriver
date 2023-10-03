package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class MyFirstWebAutomation extends DriverSetup{
    @Test
    public void testLoadGoogleHomePage() throws InterruptedException {
        //open a browser
        //WebDriver driver = new ChromeDriver();

        //browse google home page "https://www.google.com/"
        driver.get("https://www.google.com/");

        //observe google home page
        Assert.assertEquals(driver.getTitle(),"Google");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");



        //close browser
        //driver.close();

    }

    @Test
    public void testLoadFacebookHomePage() throws InterruptedException {
        //open a browser
        //WebDriver driver = new ChromeDriver();

        //browse google home page "https://www.facebook.com/"
        driver.get("https://www.facebook.com/");

        //observe google home page
        Assert.assertEquals(driver.getTitle(),"Facebook – log in or sign up");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");



        //close browser
        //driver.close();

    }


}
