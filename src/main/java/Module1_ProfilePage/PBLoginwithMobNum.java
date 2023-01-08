package Module1_ProfilePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginwithMobNum 
{
@FindBy(xpath = "(//input[@id='central-login-module-sign-mobile'])[2]") private WebElement mob_num;
@FindBy(xpath = "(//span[text()='Sign in with Password'])[2]") private WebElement Sign_in_with_password;

public PBLoginwithMobNum(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void SignInWithMobNum(String MobileNumber)
{
	mob_num.sendKeys(MobileNumber);
}
public void SignInWithPassword()
{
	Sign_in_with_password.click();
}
}
