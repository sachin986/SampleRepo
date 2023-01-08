package Module1_ProfilePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginPage 
{
@FindBy(xpath = "//a[text()='Sign in']") private WebElement Sign_In;


public PBLoginPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void Login_to_page()
{
	Sign_In.click();
}

}
