import com.gargoylesoftware.htmlunit.javascript.host.svg.SVGEllipseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmwnt2 {
    public static void main(String[] args)  throws  Exception{
        System.setProperty("webdriver.chrome.driver","/Users/Umesh.b/IdeaProjects/LSQFramework/src/main/Resources/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://cleartrip.com");
        Thread.sleep(8000);

        driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight ui-state-active')]")).click();
        Thread.sleep(2000);
        WebElement adult=driver.findElement(By.cssSelector("#Adults"));
        WebElement child=driver.findElement(By.cssSelector("#Childrens"));
        Select select=new Select(adult);
        select.selectByValue("2");
        select=new Select(child);
        select.selectByValue("2");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='AirlineAutocomplete']")).sendKeys("Indigo");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.xpath("//div[@id='homeErrorMessage']")).getText());
    }
}
