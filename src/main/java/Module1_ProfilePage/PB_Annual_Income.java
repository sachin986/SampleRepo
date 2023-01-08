package Module1_ProfilePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB_Annual_Income 
{
  @FindBy(xpath="(//div[@id='outlined-secondary'])[1]")    private WebElement annual_income;
  
  public PB_Annual_Income(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
  public String get_annual_income()
  {
	 String annual_income1 = annual_income.getText();
	 return annual_income1;
  }
}
