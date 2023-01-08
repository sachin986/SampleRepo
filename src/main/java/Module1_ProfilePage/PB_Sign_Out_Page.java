package Module1_ProfilePage;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB_Sign_Out_Page 
{
 @FindBy(xpath = "//a[@class='ico-6 centrallogout']//span[text()='Sign out']") private WebElement Sign_out;
 @FindBy(xpath = "//div[text()='My Account']") private WebElement my_account;
 WebDriver driver1;
 public  PB_Sign_Out_Page(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);
	 driver1=driver;
 }
 
 public void my_account_page()
 {
	 Set<String> allwindiws = driver1.getWindowHandles();
		ArrayList<String> al=new ArrayList(allwindiws);
		driver1.switchTo().window(al.get(0));
	 Actions act=new Actions(driver1);
	 act.moveToElement(my_account).perform();
 }
 public void sign_out_frm_page()
 {
	 Actions act=new Actions(driver1);
	 act.moveToElement(Sign_out).click().build().perform();
 }
}
