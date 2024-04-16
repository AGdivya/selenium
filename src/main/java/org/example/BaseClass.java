package main.java.org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

    public static void main(String[] args)
    {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/");


//        WebDriver driver = new FirefoxDriver();
        WebDriver driver = new ChromeDriver();
        driver.get("https://coderbyte.com/challenges");
        driver.manage().window().maximize();
        driver.findElement(By.id("searchBox")).sendKeys("front-end");
        driver.findElement(By.id("searchButton")).click();
        JavascriptExecutor js = (JavascriptExecutor ) driver;
        js.executeScript("window.scrollBy(0,1200)","");
        driver.quit();
}
}
