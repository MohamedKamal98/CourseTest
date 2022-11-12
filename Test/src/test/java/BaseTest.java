import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

public class BaseTest {
    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;
    @BeforeClass
    public void start()
    {
        String path = "/resources/driver.";
        String url ="";
        System.setProperty("webdriver.chrome.driver",path);
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }
    @AfterClass
    public void close()
    {
        driver.quit();
    }
}
