import org.testng.annotations.Test;

public class ValidateLogin extends BaseTest
{
    @Test
    public void validSigIn()
    {
        loginPage = homePage.clickOnSignInBtn();
        loginPage.writeEmail();
    }
}
