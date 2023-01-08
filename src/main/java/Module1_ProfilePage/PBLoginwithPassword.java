package Module1_ProfilePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginwithPassword
{
@FindBy(xpath = "//input[@name='password']")  private WebElement sign_in_with_pwd;
@FindBy(xpath = "//a[@id='login-in-with-password']")  private WebElement sign_in_to_my_acc;

public PBLoginwithPassword(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void Enter_password(String password)
{
	sign_in_with_pwd.sendKeys(password);
}
public void click_signin_btn()
{
	sign_in_to_my_acc.click();
}

}
