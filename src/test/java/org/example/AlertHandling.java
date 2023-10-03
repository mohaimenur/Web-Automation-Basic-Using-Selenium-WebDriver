package org.example;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;


public class AlertHandling extends DriverSetup{

    @Test
    public void test_alert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "I am a JS Alert");
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);
        String result = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result, "You successfully clicked an alert");

        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.dismiss();
        Thread.sleep(2000);
        result = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result, "You clicked: Cancel");

        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);
        result = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result, "You clicked: Ok");
        Thread.sleep(2000);


        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.dismiss();
        Thread.sleep(2000);
        result = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result, "You entered: null");

        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.sendKeys("Hello World");
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);
        result = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result, "You entered: Hello World");
        Thread.sleep(2000);
    }




}
