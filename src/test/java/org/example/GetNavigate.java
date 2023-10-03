package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class GetNavigate extends DriverSetup{
    @Test
    public void testNavigate() throws InterruptedException {
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.navigate().to("https://www.facebook.com/");
        //Thread.sleep(2000);
        driver.navigate().back();
        //Thread.sleep(2000);
        driver.navigate().forward();
        //Thread.sleep(2000);
        driver.navigate().refresh();
        //Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB);
        //Thread.sleep(2000);
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        Thread.sleep(2000);


        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);




    }
    @Test
    public void testWindow() throws InterruptedException {
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//button[@id='openwindow']")).click();
        driver.findElement(By.xpath("//a[@id='opentab']"));
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getWindowHandle());
        List<String> windowHandleList = new ArrayList<>(driver.getWindowHandles());
        System.out.println(windowHandleList.get(0));
        System.out.println(windowHandleList.get(1));

        //driver.switchTo().window(windowHandleList.get(2));
        //System.out.println(driver.getCurrentUrl());
        //Thread.sleep(2000);

        driver.switchTo().window(windowHandleList.get(1));
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);

        driver.switchTo().window(windowHandleList.get(0));
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);







    }


}
