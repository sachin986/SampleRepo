package Module1_ProfilePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB_City 
{
 @FindBy(xpath="(//input[@id='outlined-secondary'])[5]") private WebElement city;
  
 public PB_City(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);
 }
 
 public String get_city()
 {
	String pb_city = city.getAttribute("value");
	return pb_city;
 }
}
