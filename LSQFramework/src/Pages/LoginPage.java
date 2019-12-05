import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    static WebElement element=null;

    static WebDriver driver;
    By user=By.name("EmailID");
    By nextButton=By.className("lsq-signin-button");
    By passWord=By.name("Password");


    public LoginPage(WebDriver driver){
        this.driver=driver;
    }


    public  WebElement userName(){
        return driver.findElement(user);

    }

    public void uName(String userN){
        driver.findElement(user).sendKeys(userN);

    }
    public void pWord(String password ){
        driver.findElement(passWord).sendKeys(password);
    }
    public void clickSubmit(){
        driver.findElement(nextButton).click();
    }
}
