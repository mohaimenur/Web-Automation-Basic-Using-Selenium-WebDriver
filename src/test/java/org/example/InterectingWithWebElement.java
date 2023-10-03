package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InterectingWithWebElement extends DriverSetup{

    @Test
    public void testWebElement() throws InterruptedException {
        //driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        // WebElement textbox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
        //String tagname = textbox.getTagName();
        //System.out.println(tagname);

        //textbox.sendKeys("Hello");
        //Thread.sleep(2000);
        //textbox.clear();
        //Thread.sleep(2000);
        //String printatt = textbox.getAttribute("placeholder");
        //System.out.println(printatt);
        //Thread.sleep(2000);
        //System.out.println(textbox.isDisplayed());
        WebElement option = driver.findElement(By.cssSelector("#checkBoxOption1"));
        System.out.println(option.isSelected());
        option.click();
        System.out.println(option.isSelected());
        Thread.sleep(2000);
        System.out.println(option.getCssValue("padding"));
        Thread.sleep(2000);


    }


}
