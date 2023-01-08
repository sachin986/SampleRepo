package Module1_ProfilePage_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import LibraryFiles.UtilityClass;
import LibraryFiles.baseclass;
import Module1_ProfilePage.PBLoginPage;
import Module1_ProfilePage.PBLoginwithMobNum;
import Module1_ProfilePage.PBLoginwithPassword;
import Module1_ProfilePage.PBMyAccount;
import Module1_ProfilePage.PBProfilePage;
import Module1_ProfilePage.PB_Annual_Income;
import Module1_ProfilePage.PB_City;
import Module1_ProfilePage.PB_Date_Of_Birth;
import Module1_ProfilePage.PB_Email_Address;
import Module1_ProfilePage.PB_Marital_Status;
import Module1_ProfilePage.PB_Sign_Out_Page;
import Module1_ProfilePage.PB_Verify_Mob_Num;

public class PolicyBazarTest extends baseclass
{
	int TCID;
	PBLoginPage pl;
	PBLoginwithMobNum plmn;
	PBLoginwithPassword plmp;
	PBMyAccount pma;
	PBProfilePage ppfp;
	PB_Sign_Out_Page pbsignout;
	PB_Verify_Mob_Num pmn;
	PB_Email_Address emaila_address;
	PB_Date_Of_Birth birthdate;
	PB_Annual_Income pb_annual_income;
	PB_Marital_Status pb_marital_status;
	PB_City pb_city;
	String exp_name;
	
@Parameters("BrowserName")
@BeforeClass	
public void open_Application(String BrowserName) throws IOException
{
	initializeBrowser(BrowserName);
	pl=new PBLoginPage(driver);
	plmn=new PBLoginwithMobNum(driver);
	plmp=new PBLoginwithPassword(driver);
	pma=new PBMyAccount(driver);
	ppfp=new PBProfilePage(driver);
	pbsignout=new PB_Sign_Out_Page(driver);
	pmn=new PB_Verify_Mob_Num(driver);
	emaila_address=new PB_Email_Address(driver);
	birthdate=new PB_Date_Of_Birth(driver);
	pb_annual_income=new PB_Annual_Income(driver);
	pb_marital_status=new PB_Marital_Status(driver);
	pb_city=new PB_City(driver);
}
@BeforeMethod
public void Sign_In_to_Application() throws InterruptedException, IOException
{   
	pl.Login_to_page();
	//String mob_num = UtilityClass.readDataFromPropertyFile("MobNum");
	plmn.SignInWithMobNum(UtilityClass.readDataFromPropertyFile("MobNum"));
	plmn.SignInWithPassword();
	plmp.Enter_password(UtilityClass.readDataFromPropertyFile("pwd"));
	plmp.click_signin_btn(); 
	Thread.sleep(3000);
}
@Test
public  void TC100_Verify_Profile_Name() throws InterruptedException, EncryptedDocumentException, IOException
{   TCID=100;
    exp_name=UtilityClass.getDataFromExcelSheet(0,0,"Sheet2");
    pma.go_to_my_acc_btn();
    Thread.sleep(3000);
    pma.go_to_my_profile();
    ppfp.switch_to_child_window();
    String act_name=ppfp.verify_name();
    Assert.assertEquals(exp_name, act_name,"Failed:- Both names are different..");
}
@Test
public void TC101_Verify_Mobile_Number() throws InterruptedException, EncryptedDocumentException, IOException
{    
	TCID=101;
	//Thread.sleep(3000);
	String exp_mobile_number=UtilityClass.getDataFromExcelSheet(0,1,"Sheet2");
	pma.go_to_my_acc_btn();
    Thread.sleep(3000);
    pma.go_to_my_profile();
    ppfp.switch_to_child_window();
    String act_mobile_number=pmn.Verify_Mobile_Number();
    Assert.assertEquals(exp_mobile_number, act_mobile_number,"Failed:- Both names are different..");
}
@Test
public void TC102_Verify_Email_Address() throws EncryptedDocumentException, IOException, InterruptedException
{   TCID=102;
	String exp_email_address=UtilityClass.getDataFromExcelSheet(0,2,"Sheet2");
	pma.go_to_my_acc_btn();
    Thread.sleep(3000);
    pma.go_to_my_profile();
    ppfp.switch_to_child_window();
    String act_email_address=emaila_address.get_Email_address();
    Assert.assertEquals(exp_email_address, act_email_address,"Failed:- Both names are different..");
}
@Test
public void TC103_Verify_Date_of_Birth() throws EncryptedDocumentException, IOException, InterruptedException
{   TCID=103;
	String exp_date_of_birth=UtilityClass.getDataFromExcelSheet(0,3,"Sheet2");
	pma.go_to_my_acc_btn();
    Thread.sleep(3000);
    pma.go_to_my_profile();
    ppfp.switch_to_child_window();
    String act_date_of_birth = birthdate.get_date_of_birth();
    Assert.assertEquals(exp_date_of_birth, act_date_of_birth,"Failed:- Both names are different..");
}
@Test
public void TC104_get_Annual_Income() throws EncryptedDocumentException, IOException, InterruptedException
{   TCID=104;
	String exp_annual_income=UtilityClass.getDataFromExcelSheet(0,4,"Sheet2");
	pma.go_to_my_acc_btn();
    Thread.sleep(3000);
    pma.go_to_my_profile();
    ppfp.switch_to_child_window();
    String act_annual_income = pb_annual_income.get_annual_income();
    Assert.assertEquals(exp_annual_income, act_annual_income,"Failed:- Both names are different..");
}
@Test
public void TC105_get_Marital_Status() throws EncryptedDocumentException, IOException, InterruptedException
{   TCID=105;
	String exp_marital_status=UtilityClass.getDataFromExcelSheet(0,5,"Sheet2");
	pma.go_to_my_acc_btn();
    Thread.sleep(3000);
    pma.go_to_my_profile();
    ppfp.switch_to_child_window();
    String act_marital_status = pb_marital_status.get_Marital_Status();	
    Assert.assertEquals(exp_marital_status, act_marital_status,"Failed:- Both names are different..");

}
@Test
public void TC106_get_city() throws EncryptedDocumentException, IOException, InterruptedException
{   TCID=106;
	String exp_city=UtilityClass.getDataFromExcelSheet(0,6,"Sheet2");
	pma.go_to_my_acc_btn();
    Thread.sleep(3000);
    pma.go_to_my_profile();
    ppfp.switch_to_child_window();
    String act_city = pb_city.get_city();
    Assert.assertEquals(exp_city, act_city,"Failed:- Both names are different..");
}
@AfterMethod
public void SignOut_From_Application(ITestResult it) throws InterruptedException, IOException
{    
	 pbsignout.my_account_page();
     pbsignout.sign_out_frm_page();
     Thread.sleep(5000);
     
     if(it.getStatus()==ITestResult.FAILURE)
     {
    	 UtilityClass.TakeScreenshot(driver,TCID);
     }
     
}
 @AfterClass
 public void Close_Application()
 {
	 driver.quit();
 }


}
