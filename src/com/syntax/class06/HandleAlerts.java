package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement simpleAlertButton = driver.findElement(By.id("alert"));
        simpleAlertButton.click();
        Thread.sleep(2000);
        Alert simpleAlert = driver.switchTo().alert(); // switch focus to alert
        simpleAlert.accept();

        WebElement confirmAlertButton = driver.findElement(By.id("confirm"));
        confirmAlertButton.click();
        Thread.sleep(2000);
        Alert confirmAlert = driver.switchTo().alert();
        String confirmAlertText = confirmAlert.getText();
        System.out.println(confirmAlertText);
        Thread.sleep(2000);
        confirmAlert.dismiss();

        WebElement promtAlertBytton = driver.findElement(By.id("prompt"));
        promtAlertBytton.click();
        Thread.sleep(2000);
        Alert promptAlert = driver.switchTo().alert();
        Thread.sleep(2000);
        promptAlert.sendKeys("Hello World");
        promptAlert.accept();
    }
}
