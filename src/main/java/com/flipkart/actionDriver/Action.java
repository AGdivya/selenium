package main.java.com.flipkart.actionDriver;

import main.java.com.flipkart.base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action extends BaseClass {

    static Actions actions = new Actions(driver);

    /*
    Build is used to create an instance of the Actions class and associate it with a specific WebDriver instance
    build() is used to create a series of actions , perform() is used to execute those actions
     release() method is used to release the mouse button on the web element
     */
    public static void mouseAction(String action,WebElement locatorName)
    {
       switch (action)
       {
           case "moveToElement":
               actions.moveToElement(locatorName).click().build().perform();
               break;
           case "click":
               actions.click(locatorName).build().perform();
               break;
           case "doubleClick":
               actions.doubleClick(locatorName).build().perform();
               break;
           case "contextClick":
               actions.contextClick(locatorName).build().perform();
               break;
           case "clickAndHold":
               actions.clickAndHold(locatorName).build().perform();
               break;
           case "scrollToElement":
               actions.scrollToElement(locatorName).build().perform();
               break;
           case "sendKeys":
               actions.sendKeys(locatorName,"iPhone").build().perform();
           case "release":
               actions.clickAndHold(locatorName).release().perform();
           default: throw new RuntimeException("action not found");
       }
    }

    public static void mouseAndKeyboardAction(String action,WebElement sourceLocatorName, WebElement targetLocatorName)
    {
        switch (action)
        {
            case "dragAndDrop":
                actions.dragAndDrop(sourceLocatorName,targetLocatorName).build().perform();
                break;
            case "keyDown":
                actions.keyDown(targetLocatorName, Keys.SHIFT).build().perform();
                break;
            case "keyUp":
                actions.keyUp(targetLocatorName, Keys.SHIFT).build().perform();
            default: throw new RuntimeException("action not found");
        }
    }

    public static void scroll(String action,WebElement element)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        switch(action)
        {
            case "JsClick":
                js.executeScript("arguments[0].click();",element);
                break;
            case "scrollDown":
                js.executeScript("window.scrollBy(0,350)","");
                break;
            case "scrollUp":
                js.executeScript("window.scrollBy(0,-350)","");
                break;
            case "scrollLeft":
                js.executeScript("window.scrollBy(-350,0)","");
                break;
            case "scrollRight":
                js.executeScript("window.scrollBy(350,0)","");
                break;
            case "scrollIntoView":
                js.executeScript("arguments[0].scrollIntoView();",element);
                break;
            case "scrollUpToTop":
                js.executeScript("window.scrollBy(document.body.scrollHeight,0)");
            default:
                js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); //scroll upTo bottom of Page
                //scroll infinite need to implement
        }
    }

    public static boolean findElement(WebElement element)
    {
        boolean flag = false;
        try
        {
            element.isDisplayed();
            flag = true;
        }
        catch (Exception e)
        {
            flag = false;
        }
        finally {
            if(flag)
            {
                System.out.println("Successfully found element");
            }
            else
            {
                System.out.println("Unable to locate element");
            }
        }
return flag;
    }

  /*
  need to implement logic for isDisplayed , isSelected , isEnabled , type ,selectByIndex, selectBySendKeys ,SelectByValue
  SelectByvisbleText, mouseHover , switchToFrameByIndex , switchToDefaultFrame, switchToFrameByIndex
   */


}
