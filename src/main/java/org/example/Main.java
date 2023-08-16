package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.html.HTMLImageElement;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args){
        implicitWait();
        //WebDriver driver = new FirefoxDriver();
        //driver.get("https://sniffs.serfor.gob.pe/mcsqa3/login");

        /*driver.findElement(By.xpath("/html/body/app-root/app-layout/app-login/div/div/div/div[2]/div/div/div/form/div/div[1]/div[1]/input"))
                .sendKeys("");
        driver.findElement(By.xpath("/html/body/app-root/app-layout/app-login/div/div/div/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/div/input"))
                        .click();
        driver.findElement(By.xpath("//*[@id=\"p\"]"));
        driver.findElement(By.xpath("/html/body/app-root/app-layout/app-login/div/div/div/div[2]/div/div/div/form/div/div[1]/div[2]/div[3]/div/input"))
                        .click();
         */
        //driver.wait(20000);
    }
    private static void implicitWait(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com");
        System.out.println(driver.getPageSource());
    }
    private static void explicitWait(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("scrolltest" + Keys.ENTER);

        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
        System.out.println(firstResult.getText());
    }
}