package Module1_ProfilePage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PB_TestNG 
{
	@Test(invocationCount=5,timeOut=2000,priority=1)
public void TC1()
{
	Reporter.log("Running TC 1...",true);
}
	@Test(priority=0)
public void TC2()
{
	Reporter.log("Running TC 2....",true);
}
	@Test(priority=3)
public void TC3()
{
	Reporter.log("Running TC 3....",true);
}
	@Test(priority=2)
public void TC4()
{
	Reporter.log("Running TC 4....",true);
}
	@Test(priority=-1)
public void TC5()
{
	Reporter.log("Running TC 5....",true);
}
	@Test(priority=-2)
public void TC6()
{
	Reporter.log("Running TC 6....",true);
}
}
