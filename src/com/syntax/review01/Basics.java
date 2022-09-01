package com.syntax.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        Thread.sleep(2000);
        WebElement startPractising = driver.findElement(By.linkText("Start Practising"));
        startPractising.click();
        Thread.sleep(2000);
        WebElement proceedNext = driver.findElement(By.partialLinkText("Proceed Next"));
        proceedNext.click();
    }
}
