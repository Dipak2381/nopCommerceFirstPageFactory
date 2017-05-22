package nopCommercePageFactory;

import org.openqa.selenium.WebElement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Lenovo on 20/05/2017.
 */
public class Utils extends BasePage{

    public static void clickOnElement(WebElement element)
    {
        element.click();
    }

    public static void typeText(WebElement element, String text)
    {
        element.sendKeys(text);
    }

    public static String randomDate()
    {
        DateFormat format = new SimpleDateFormat("ddmmyyHHmmss");
        return format.format(new Date());
    }
}
