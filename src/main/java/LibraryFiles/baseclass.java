package LibraryFiles;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class baseclass 
{
	public WebDriver driver;
	String BrowserName;
public void initializeBrowser(String BName) throws IOException
{
	if(BName.equals("chrome"))
	{
		driver=new ChromeDriver();	
	}
	else if(BName.equals("edge"))
	{
		driver=new EdgeDriver();
	}
	
	driver.get(UtilityClass.readDataFromPropertyFile("url"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
}
