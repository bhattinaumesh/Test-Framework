import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class LoginTest extends TestBase {

 WebDriver driver;


    @Test
    public void  loginTest() throws Exception{
        driver=chromeBrowser("https://login.leadsquared.com/");

        LoginPage p=new LoginPage(driver);
        p.uName("umesh.test@leadsquared.com");
        p.clickSubmit();
        p.pWord("justdoit");
        implicitWait(5,driver);
        p.clickSubmit();
        //Thread.sleep(3000);
        closeSession();



    }













      }










