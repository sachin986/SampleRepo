package Module1_ProfilePage;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilePage
{
@FindBy(xpath="(//input[@id='outlined-secondary'])[1]") private WebElement number;
WebDriver driver1;

public PBProfilePage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
	driver1=driver;
}
public void switch_to_child_window() throws InterruptedException
{
	Set<String> allwindiws = driver1.getWindowHandles();
	ArrayList<String> al=new ArrayList(allwindiws);
	driver1.switchTo().window(al.get(1));
	Thread.sleep(5000);
	
	
	
}

public String verify_name() throws InterruptedException
{   Thread.sleep(5000);
	String act_name=number.getAttribute("value");
	return act_name;
	}
}













