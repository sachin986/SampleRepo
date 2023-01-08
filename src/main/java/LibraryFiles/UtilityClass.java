package LibraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class UtilityClass
{
	WebDriver driver;
public static String getStringDataFromExcelSheet(int rowindex,int cellindex) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\PB_Maven_Project_Sample\\TestData\\Sample1Project.xlsx");
	org.apache.poi.ss.usermodel.Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
	String value = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
	return value;
	
}
public static double getNumericDataFromExcelSheet(int rowindex,int cellindex) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\PB_Maven_Project_Sample\\TestData\\Sample1Project.xlsx");
	org.apache.poi.ss.usermodel.Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
	double value = sh.getRow(rowindex).getCell(cellindex).getNumericCellValue();
	return value;
	
}
public static Boolean getBooleanDataFromExcelSheet(int rowindex,int cellindex) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\PB_Maven_Project_Sample\\TestData\\Sample1Project.xlsx");
	org.apache.poi.ss.usermodel.Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
	Boolean value = sh.getRow(rowindex).getCell(cellindex).getBooleanCellValue();
	return value;
	
}

public static String getDataFromExcelSheet(int rowindex,int cellindex,String sheetname) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\PB_Maven_Project_Sample\\TestData\\Sample1Project.xlsx");
	org.apache.poi.ss.usermodel.Sheet sh = WorkbookFactory.create(fis).getSheet(sheetname);
	String value = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
	return value;
	
}


public static void TakeScreenshot(WebDriver driver,int TCID) throws IOException
{
	
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Lenovo\\eclipse-workspace\\PB_Maven_Project_Sample\\ScreenShots\\TestCase"+TCID+".jpg");
	    org.openqa.selenium.io.FileHandler.copy(src, dest);
}

public static String readDataFromPropertyFile(String key) throws IOException
{
	FileInputStream fis=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\PB_Maven_Project_Sample\\Property.properties");
	Properties p=new Properties();
	p.load(fis);
	String value = p.getProperty(key);
	return value;
}
}
