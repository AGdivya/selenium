package main.java.com.flipkart.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.Properties;

public class BaseClass {

    protected static WebDriver driver; //initialization of WebDriver
    static ConfigFileReader configFileReader = new ConfigFileReader(); // created ref variable for ConfigReader class
    private static final Properties properties = null;

    public  static void launchApp()
    {
        WebDriverManager.chromedriver().setup();
        String browserName = properties.getProperty("browser");
        switch (browserName)
        {
            case "Chrome":
                driver = new ChromeDriver();
                break;
            case "Firefox":
                    driver = new FirefoxDriver();
                    break;
            case "IE":
                driver = new InternetExplorerDriver();
            default: throw new RuntimeException("browser not specified in the Configuration.properties file.");
        }
        configFileReader.getImplicitlyWait();
        configFileReader.getApplicationUrl();

    }

}
