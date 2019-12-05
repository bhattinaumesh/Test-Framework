import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args)  throws  Exception{
        System.setProperty("webdriver.chrome.driver","/Users/Umesh.b/IdeaProjects/LSQFramework/src/main/Resources/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        Thread.sleep(7000);
        WebElement dropDown= driver.findElement(By.xpath("//select[@name='country']"));
        Select s = new Select(dropDown);
        s.selectByVisibleText("BELGIUM");
        Thread.sleep(3000);

        driver.quit();
    }
}
