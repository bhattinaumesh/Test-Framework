import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentWaits {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/Umesh.b/IdeaProjects/LSQFramework/src/main/Resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
        driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
        assignM(driver);




    }
    public static void assignM(WebDriver driver){
        WebDriverWait w = new WebDriverWait(driver, 5);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='results']")));
        String text =driver.findElement(By.cssSelector("div[id='results']")).getText();
        System.out.println(text);




    }
}
