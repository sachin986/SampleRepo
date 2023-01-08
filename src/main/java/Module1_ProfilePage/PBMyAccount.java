package Module1_ProfilePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyAccount 
{
@FindBy(xpath = "//div[text()='My Account']") private WebElement my_acc;
@FindBy(xpath = "//a[@class='ico-1']//span[text()=' My profile ']") private WebElement my_profile;
WebDriver driver1;

public PBMyAccount(WebDriver driver)
{
	PageFactory.initElements(driver,this);
	driver1=driver;
}

public void  go_to_my_acc_btn()
{
	Actions act=new Actions(driver1);
	act.moveToElement(my_acc).perform();
}
public void go_to_my_profile()
{
	Actions act1=new Actions(driver1);
	act1.moveToElement(my_profile).click().build().perform();	
	//my_profile.click();
}
}
