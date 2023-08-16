package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWinDows {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.findElement(By.cssSelector("#content > div > a")).click();
        String currentWindow = driver.getWindowHandle();
    }
}
