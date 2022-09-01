package com.syntax.review04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frames {
    public static String url = "https://chercher.tech/practice/frames";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.switchTo().frame(0);
        WebElement topic = driver.findElement(By.xpath("//b[@id='topic']"));
        System.out.println(topic.getText());

        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
//select dropDown
        WebElement dropDown = driver.findElement(By.xpath("//select[@id ='animals']"));
        Select select = new Select(dropDown);
        select.selectByIndex(2);

        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id ='frame1']")));

        driver.switchTo().frame("frame3");
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();

    }
}
