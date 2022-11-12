package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.rmi.runtime.Log;

public class HomePage extends BasePage {

    private By signInBtn = By.xpath("//a[@class='login']");

    public HomePage(WebDriver driver)
    {
        super(driver);
    }
    public LoginPage clickOnSignInBtn()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(signInBtn));
        driver.findElement(signInBtn).click();
        return new LoginPage(driver);
    }
}
