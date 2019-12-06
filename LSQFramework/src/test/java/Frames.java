import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/Umesh.b/IdeaProjects/LSQFramework/src/main/Resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Frames")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
        Thread.sleep(3000);
          driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
                driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
        System.out.println( driver.findElement(By.id("content")).getText());
        System.out.println("Just for test");
    }
}