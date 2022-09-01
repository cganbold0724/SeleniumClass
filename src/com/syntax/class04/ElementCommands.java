package com.syntax.class04;

import javafx.scene.control.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        Thread.sleep(3000);
        WebElement ageRadioButton = driver.findElement(By.cssSelector("//input[value = '5 - 15']"));
        Thread.sleep(3000);

        boolean isAgeRadioButtonEnabled= ageRadioButton.isEnabled();
        System.out.println(isAgeRadioButtonEnabled);
        Thread.sleep(3000);

        boolean isAgeRadioButtonDisplayed = ageRadioButton.isDisplayed();
        System.out.println(isAgeRadioButtonDisplayed);
        Thread.sleep(3000);

        boolean isAgeRadioButtonSelected = ageRadioButton.isSelected();
        System.out.println("Before clicking " + isAgeRadioButtonSelected);
        Thread.sleep(3000);

        ageRadioButton.click();
        isAgeRadioButtonSelected = ageRadioButton.isSelected();
        System.out.println("After clicking " + isAgeRadioButtonSelected);
        Thread.sleep(3000);
    }
}
