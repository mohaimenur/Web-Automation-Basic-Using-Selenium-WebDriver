package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BasicLocator extends DriverSetup{


    @Test
    public void testGoogleSearch() throws InterruptedException {
        driver.get("https://www.google.com/");
        //WebElement searchbox = driver.findElement(By.id("APjFqb"));
        //searchbox.sendKeys("Test Automation");
        //locate using different attributes
        //WebElement searchbox = driver.findElement(By.name("q"));
        //WebElement searchbox = driver.findElement(By.className("gLFyf"));
        WebElement searchbox = driver.findElement(By.tagName("textarea"));

        searchbox.sendKeys("Test Automation");
        searchbox.clear();

        //locate using linktext
        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));

        //gmailLink.click();
        System.out.println(gmailLink.getText());

        //locate using partial link text
        WebElement imageSearchLink = driver.findElement(By.partialLinkText("mages"));
        //imageSearchLink.click();
        System.out.println(imageSearchLink.getText());

        //locate using css selector
        //WebElement countryName = driver.findElement(By.cssSelector("div[class='uU7dJb']"));
        //System.out.println(countryName.getText());

        //locator using relative x path //div[@class="uU7dJb"]

        WebElement countryName = driver.findElement(By.xpath("//div[@class='uU7dJb']"));
        System.out.println(countryName.getText());




        Thread.sleep(5000);

    }


}
