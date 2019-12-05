import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionSec11 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/Umesh.b/IdeaProjects/LSQFramework/src/main/Resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com");
        Actions a = new Actions(driver);

        a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();

        
    }



}
