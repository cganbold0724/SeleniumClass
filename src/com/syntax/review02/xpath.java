package com.syntax.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/insurance/v1/register.php");
        Thread.sleep(2000);
        WebElement surName = driver.findElement(By.xpath("/html/body/div[3]/form/div[2]/div[1]/input"));
        surName.sendKeys("sadiq");
        Thread.sleep(2000);

        WebElement firstName = driver.findElement(By.xpath("//input[@id ='user_firstname']"));
        firstName.sendKeys("Chinzo");
        Thread.sleep(2000);

        WebElement dateOfBirth = driver.findElement(By.xpath("//label[text()='Date of Birth']"));
        System.out.println(dateOfBirth.getText());
        Thread.sleep(2000);

        WebElement lisence = driver.findElement(By.xpath("//label[contains (text(), 'License Period')]"));
        System.out.println(lisence.getText());
    }

}
