package nopCommercePageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Lenovo on 20/05/2017.
 */
public class BasePage {

    public static WebDriver driver;

    public BasePage()
    {
        //this initElements method will create all web elements.
        PageFactory.initElements(driver,this);
    }
}
