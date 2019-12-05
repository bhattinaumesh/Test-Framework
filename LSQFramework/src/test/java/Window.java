import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class Window {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/Umesh.b/IdeaProjects/LSQFramework/src/main/Resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();


        Set<String> abc = driver.getWindowHandles();

        Iterator<String>it=abc.iterator();
        String parentID=it.next();


       driver.switchTo().window(it.next());
       System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
       driver.switchTo().window(parentID);
        System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());





        driver.quit();



    }
}
