import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticDropDown {
    public static void main(String[] args)  throws Exception{
        System.setProperty("webdriver.chrome.driver","/Users/Umesh.b/IdeaProjects/LSQFramework/src/main/Resources/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://spicejet.com");
        Thread.sleep(5000);
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(1000);


        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
