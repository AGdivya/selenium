package main.java.org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumGuruDemo {
    public static void main(String args[])
    {
        // used to set webdriver.chrome.driver to the chromedriver.exe location (path where chromedriver.exe file is stored)
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromeDriver\\chromedriver.exe");
        // WebDriver is an interface, and driver is a reference variable instantiated using the ChromeDriver class.
        WebDriver driver = new ChromeDriver();
        driver.get("https://shorturl.at/bfkKO"); //launch the url
        System.out.println("Browser launched");
        driver.manage().window().maximize();

//        Alert alert = driver.switchTo().alert();
//
//        String alertMessage = driver.switchTo().alert().getText();
//
//        System.out.println(alertMessage);
    }

}
