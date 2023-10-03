package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IframeHandling extends DriverSetup{
    @Test
    public void testIframeElements() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js =  (JavascriptExecutor) driver;
        WebElement mouseHoverButton = driver.findElement(By.xpath("//button[@id='mousehover']"));
        js.executeScript("arguments[0].scrollIntoView();", mouseHoverButton );
        //driver.switchTo().frame(0);
        //driver.switchTo().frame("courses-iframe");
        //driver.switchTo().frame("iframe-name");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='courses-iframe']")));
        WebElement course_button = driver.findElement(By.linkText("Courses"));
        System.out.println(course_button.getText());

        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        WebElement iframeExampleText = driver.findElement(By.xpath("//legend[normalize-space()='iFrame Example']"));
        System.out.println(iframeExampleText.getText());
        Thread.sleep(3000);
    }





}
