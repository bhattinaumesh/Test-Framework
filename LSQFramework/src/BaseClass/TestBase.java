import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {


  static WebDriver driver=null;



    public static WebDriver chromeBrowser(String url) throws Exception {

        System.setProperty("webdriver.chrome.driver", "/Users/Umesh.b/IdeaProjects/LSQFramework/src/main/Resources/chromedriver");

        driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();
        return driver;

    }

    public void implicitWait(long time,WebDriver driver){
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    public  void fluentWait(long time, WebDriver driver){
        WebDriverWait wait=new WebDriverWait(driver,time);


    }
    public void alertAccept(WebDriver driver){
        driver.switchTo().alert().accept();
    }
    public void alertDismiss(WebDriver driver){
        driver.switchTo().alert().dismiss();
    }






    public void closeSession(){
        driver.quit();

    }









    }







