package Module1_ProfilePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB_Date_Of_Birth 
{
 @FindBy(xpath="(//input[@id='outlined-secondary'])[4]") private WebElement date_of_birth;
 
 public PB_Date_Of_Birth(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);
 }
 
 public String get_date_of_birth()
 {
	String dob=date_of_birth.getAttribute("value"); 
	return dob;
 }
}
