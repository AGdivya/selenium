package main.java.org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFunctions {

    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();                  // open Chrome browser
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromeDriver\\chromedriver.exe");
        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("My current url is:      "+driver.getCurrentUrl());
        System.out.println("My current url page title is:       " +driver.getTitle());
        System.out.println("My url source code is:      "+driver.getPageSource());

        //Browser management
        driver.manage().window().maximize();        //Maximize the browser window
        driver.manage().window().minimize();        //Minimize the browser window
        driver.manage().window().fullscreen();      //Set full-screen mode

        //Navigation
        driver.navigate().to("https://www.amazon.in/");     //Navigate to a new URL
        driver.navigate().back();                               //Go back to previous page
        driver.navigate().forward();                            //Go forward to next page
        driver.navigate().refresh();                            //Refresh the current page

        //Browser management
        driver.manage().window().maximize();        //Maximize the browser window
        driver.manage().window().minimize();        //Minimize the browser window
        driver.manage().window().fullscreen();      //Set full-screen mode

        driver.get("https://only-testing-blog.blogspot.com/");         // Navigate to URL
        //Element Interaction
        driver.findElement(By.id("gparent_1")).sendKeys("Dashrath");                            //Enter Text
        driver.findElement(By.xpath("//*[@id=\"parent_1\"]")).sendKeys("Ram");
        System.out.println(driver.findElement(By.cssSelector("#child_1")).getText());                       //Get text
        driver.findElement(By.cssSelector("#child_1")).sendKeys("Luv");

        driver.quit();          // Close all browser window
        driver.close();         // Close the current browser window
    }
}

