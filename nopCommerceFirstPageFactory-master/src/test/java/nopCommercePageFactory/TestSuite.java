package nopCommercePageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Lenovo on 20/05/2017.
 */
public class TestSuite extends BaseTest {

    RegistrationPage registrationPage;
    HomePage homePage;

    @BeforeClass
    public void beforeClass()
    {
       registrationPage = new RegistrationPage();
       homePage = new HomePage();
    }

    @Test
    public void userShouldRegisterSuccessfully()
    {
        homePage.clickOnRegister();
        registrationPage.fillingRegistrationDetail();
        Assert.assertEquals(driver.findElement(By.className("result")).getText(),"Your registration completed");

    }

    @Test
    public void userShouldLogInSuccessfully()
    {
        homePage.clikOnLogInButton();
    }


}
