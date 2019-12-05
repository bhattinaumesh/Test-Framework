import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SuggestiveDropdown {
    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(6000);
        WebElement fromBox=driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox searchCity inactiveWidget')]//label"));
        Thread.sleep(2000);

        fromBox.click();
        Thread.sleep(2000);

        WebElement fieldEdit=driver.findElement(By.xpath("//input[@placeholder='From']"));
        fieldEdit.sendKeys("MUM");
        Thread.sleep(3000);
        fieldEdit.sendKeys(Keys.ARROW_DOWN);
        fieldEdit.sendKeys(Keys.RETURN);
        Assert.assertFalse(driver.findElement(By.xpath("//input[@placeholder='From']")).isDisplayed());

    }

    }
