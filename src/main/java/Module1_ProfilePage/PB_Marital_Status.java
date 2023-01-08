package Module1_ProfilePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB_Marital_Status 
{
 @FindBy(xpath="(//div[@id='outlined-secondary'])[2]") private WebElement marital_status;
  
 public PB_Marital_Status(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);
 }
 
 public String get_Marital_Status()
 {
	String m_status = marital_status.getText();
	return m_status;
 }
}
