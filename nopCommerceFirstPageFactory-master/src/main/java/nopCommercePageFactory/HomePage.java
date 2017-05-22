package nopCommercePageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Lenovo on 20/05/2017.
 */
public class HomePage extends Utils{

   @FindBy(className = "ico-register")
    WebElement _registerButton;

   @FindBy(how = How.CLASS_NAME, using = "ico-login")
    WebElement _logInButton;


   public void clickOnRegister()
   {
       clickOnElement(_registerButton);
   }

   public void clikOnLogInButton()
   {
      clickOnElement(_logInButton);
   }
}
