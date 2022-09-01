package com.syntax.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collection;
import java.util.List;

public class LinksExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        List<WebElement> links = driver.findElements(By.tagName("a"));

        for(WebElement link:links){
            String text = link.getText();
            if(!text.isEmpty()){
                System.out.println(text);
            }
        }
    }
}
