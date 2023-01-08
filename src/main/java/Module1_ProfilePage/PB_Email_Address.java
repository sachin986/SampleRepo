package Module1_ProfilePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB_Email_Address 
{
@FindBy(xpath="//input[@name='email']") private WebElement email_id;

public PB_Email_Address(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public String get_Email_address()
{
String emailid=	email_id.getAttribute("value");
return emailid;
}
}
