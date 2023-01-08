package Module1_ProfilePage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PB_with_DDT 
{   private WebDriver driver1;
WebDriver driver=driver1;
	
	/*@BeforeClass
	public  void Launch_application() throws InterruptedException 
	{
	
	}*/
@BeforeMethod	
public void sign_in_to_application()
{WebDriver driver=new ChromeDriver();
driver.get("https://www.policybazaar.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	PBLoginPage pl=new PBLoginPage(driver);
	pl.Login_to_page();
	PBLoginwithMobNum plmn=new PBLoginwithMobNum(driver);
	//plmn.SignInWithMobNum();
	plmn.SignInWithPassword();
	PBLoginwithPassword plmp=new PBLoginwithPassword(driver);
	//plmp.Enter_password();
	plmp.click_signin_btn();
}
@Test
public void TC_verify_profile_name(WebDriver driver) throws InterruptedException
{
	 
	//Thread.sleep(3000);
	PBMyAccount pma=new PBMyAccount(driver);
	pma.go_to_my_acc_btn();
	Thread.sleep(3000);
	pma.go_to_my_profile();
	PBProfilePage ppfp=new PBProfilePage(driver);
	ppfp.switch_to_child_window();
	//ppfp.verify_name();
	}
@AfterMethod
public void sign_out_from_application(WebDriver driver){
	{
	PB_Sign_Out_Page pbsignout=new PB_Sign_Out_Page(driver);
	pbsignout.sign_out_frm_page();
	driver.quit();
	}
	}
/*@AfterClass
public void close_application(WebDriver driver)
{
	
}*/
	
	}


