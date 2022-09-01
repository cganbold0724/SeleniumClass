package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    /*
    Navigate to http://syntaxprojects.com
Click on start practicing
click on simple form demo
enter any text on first text box
click on show message
quit the browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement startPractising = driver.findElement(By.xpath("//a[text()=' Start Practising ']"));
        startPractising.click();
        Thread.sleep(3000);
        WebElement simpleFormDemo = driver.findElement(By.xpath("//a[text()='Simple Form Demo' and @class='list-group-item']"));
        simpleFormDemo.click();
        Thread.sleep(3000);
        WebElement enterMessage = driver.findElement(By.xpath("//input[@placeholder='Please enter your Message']"));
        enterMessage.sendKeys("Nothing impossible after Java");
        Thread.sleep(3000);
        WebElement showMessage = driver.findElement(By.xpath("//button[@type= 'button']"));
        showMessage.click();
        Thread.sleep(3000);
        driver.quit();




    }
}
