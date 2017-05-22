package nopCommercePageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Lenovo on 20/05/2017.
 */
public class RegistrationPage extends Utils {

    @FindBy(id= "gender-female")
    private WebElement _female;

    @FindBy(name="FirstName")
    private WebElement _firstName;

    @FindBy(name = "LastName")
    private WebElement _lastName;

    @FindBy(id="Email")
    private WebElement _email;

    @FindBy(name = "Company")
    private WebElement _companyName;

    @FindBy(id="Password")
    private WebElement _password;

    @FindBy(id="ConfirmPassword")
    private WebElement _confirmPassword;

    @FindBy(id="register-button")
    private WebElement _clickOnRegister;

    public void fillingRegistrationDetail()
    {
        //filling all registration detail on registration form and click on register to continue
        clickOnElement(_female);
        typeText(_firstName,"narul");
        typeText(_lastName,"pvnnar");
        typeText(_email,"abc"+randomDate()+"@yahoo.com");
        typeText(_companyName,"abc ltd");
        typeText(_password,"abc1234");
        typeText(_confirmPassword,"abc1234");
        clickOnElement(_clickOnRegister);
    }

}
