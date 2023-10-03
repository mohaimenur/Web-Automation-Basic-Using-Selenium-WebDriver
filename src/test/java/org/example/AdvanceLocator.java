package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdvanceLocator extends DriverSetup{

    @Test
    public void testNoCommerce() throws InterruptedException {
        driver.get("https://demo.nopcommerce.com/");
        //custom xpath //div/form/input[@id="small-searchterms"]
        //custom child parent css form > input
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("form > input")).sendKeys("Apple Macbook Pro 13-inch");
        Thread.sleep(2000);

        //search.clear();
        //Thread.sleep(5000);
        //driver.findElement(By.xpath("//div/form/input")).clear();
        //Thread.sleep(5000);

        //multiple atribute //button[@type="submit" and @class="button-1 search-box-button"]

        WebElement search_btn_text = driver.findElement(By.xpath("//button[@type='submit' and @class='button-1 search-box-button']"));
        //WebElement search_btn_text = driver.findElement(By.xpath("//button[@type='submit']"));
        //search_btn_text.getText();
        System.out.println(search_btn_text.getText());

        WebElement search_btn_text_2= driver.findElement(By.cssSelector("button[type='submit'][class='button-1 search-box-button']"));
        search_btn_text_2.click();
        Thread.sleep(2000);

        //WebElement product_click = driver.findElement(By.xpath("//a[starts-with(@href,'/apple-macbook-pro-13-inch')][6]"));
        ////h2/a[contains(text(),"Apple MacBook Pro 13-inch")]
        //System.out.println(product_click.getText());
        WebElement product_click = driver.findElement(By.xpath("//h2[@class='product-title']//a[contains(text(),'Apple MacBook Pro 13-inch')]"));
        System.out.println(product_click.getText());
        product_click.click();
        Thread.sleep(2000);

        WebElement add_to_Cart_btn= driver.findElement(By.xpath("//*[contains(@id,'add-to-cart-button-4')]"));
        add_to_Cart_btn.click();
        Thread.sleep(2000);

        WebElement view_cart = driver.findElement(By.xpath("//p/a[contains (text(),'shopping cart')]"));
        view_cart.click();
        Thread.sleep(2000);

        //WebElement unit_price = driver.findElement(By.xpath("//tr/td/span[@class='product-unit-price']"));
        //WebElement unit_price = driver.findElement(By.xpath("//tr/td/span[contains (text(),'$1,800.00')]"));
        //WebElement unit_price = driver.findElement(By.xpath("//tr/td[5]/preceding-sibling::td[1]"));
        //String unit_price = String.valueOf(driver.findElement(By.xpath("//span[@class='product-unit-price']")));
        //Assert.assertEquals(unit_price, "$1,800.00");
        String sku_prof = driver.findElement(By.xpath("//span[@class='sku-number']")).getText(); // .getText()
        Assert.assertEquals(sku_prof,"AP_MBP_13");

        //WebElement total_price = driver.findElement(By.xpath("//tr/td/span[@class='product-subtotal']"));
        //WebElement total_price = driver.findElement(By.xpath("//tr/td[5]/following-sibling::td[1]"));
        //Assert.assertEquals(total_price,"$3,600.00");
        Thread.sleep(4000);


        // contains method  //*[contains(@id,"add-to-cart-button-4")]




    }



}
