package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertDemo {
    public static void  main(String[] args){
        WebDriver driver = new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String text = alert.getText();
        System.out.println(text);
        alert.accept();

        //Confirm Box
        driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert2 = driver.switchTo().alert();
        String text2 = alert.getText();
        System.out.println(text2);
        alert.accept();

        //PromptBox
        driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert3 = driver.switchTo().alert();
        alert.sendKeys("Hello");
        alert.accept();
        System.out.println(driver.findElement(By.id("result")).getText());

        driver.quit();

    }
}
