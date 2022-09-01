package com.syntax.class11;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JSExecutorDemo {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].style.backgroundColor='yellow'",username);
        js.executeScript("arguments[0].style.backgroundColor='BRowN'",password);

        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        //loginButton.click();
        js.executeScript("arguments[0].click()",loginButton);
    }
}