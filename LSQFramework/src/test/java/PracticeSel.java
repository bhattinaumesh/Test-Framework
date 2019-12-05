import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class PracticeSel {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/Umesh.b/IdeaProjects/LSQFramework/src/main/Resources/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        Thread.sleep(6000);

        WebElement checkBox= driver.findElement(By.cssSelector("#checkBoxOption1"));

        checkBox.click();
        Thread.sleep(2000);
       // boolean checked=checkBox.isSelected();
        Assert.assertEquals(checkBox.isSelected(),true);
        checkBox.click();



        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());



    }
}
