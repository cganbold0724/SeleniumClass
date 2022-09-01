package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DeltaCalendarHandling {
    public static String url = "https://www.delta.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement calendar = driver.findElement(By.id("input_departureDate_1"));
        calendar.click();
        WebElement nextButton = driver.findElement(By.xpath("//span[text() = 'Next']"));
        WebElement departureMonth = driver.findElement(By.className("dl-datepicker-month-0"));
        String departureMonthText = departureMonth.getText();

        //click on next until month is October
        while (!departureMonthText.equals("October")){
            nextButton.click();
            departureMonthText=departureMonth.getText();



        }
        List<WebElement> departureDates = driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-0']/tr/td"));
        for (WebElement departureDate : departureDates) {
            if(departureDate.getText().equals("30")){
                departureDate.click();
                break;
            }

        }
        WebElement rMonth = driver.findElement(By.className("dl-datepicker-month-1"));
        String rMonthtext = rMonth.getText();

        while(!rMonthtext.equals("December")) {
            nextButton.click();
            rMonthtext = rMonth.getText();
        }

        List<WebElement> returnDates = driver.findElements(By.xpath("//tbody[@class = 'dl-datepicker-tbody-1']/tr/td"));
        for(WebElement returnDate: returnDates) {
            if(returnDate.getText().equals("20")) {
                returnDate.click();
                break;
            }
        }
        WebElement doneButton = driver.findElement(By.className("doneButton"));
        doneButton.click();
    }

}
