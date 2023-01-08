package Module1_ProfilePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB_Verify_Mob_Num 
{

 @FindBy(xpath ="//input[@name='mobNo']")	private WebElement Mobile_Number;
 
 public PB_Verify_Mob_Num(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);
 }
 
 public String Verify_Mobile_Number()
 {
	String mobile_number_value = Mobile_Number.getAttribute("value");
	return mobile_number_value;
	 
 }
}
