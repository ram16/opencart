package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;
public class TC_002_LoginPage extends BaseClass {


@Test(groups = {"sanity","master"})
public void TC_002_LoginPage(){
	
	try
	{
	logger.info("Starting TC_002_Login");
	
	
	//driver.get(rb.getString("appURL"));
	logger.info("Home Page Displayed");
	
	driver.manage().window().maximize();
	
	HomePage hp = new HomePage(driver);
	
	

	LoginPage lp = new LoginPage(driver);
	
	lp.setEmail(rb.getString("email"));
	logger.info("Email Provided");
	
	lp.setPassword(rb.getString("password"));
	logger.info("Password Provided");
	
	lp.clickLogin();
	lp.setEmail(rb.getString("email"));
	logger.info("clicked on Login");


	


boolean  targetpage = lp.isMyAccountPageExists();

if (targetpage)
{
	Assert.assertTrue(true);
	
}
else
{
	logger.error("Login  failed");
	captureScreen(driver,"test_Login");

		Assert.assertTrue(false);
	
	}
}

catch(Exception e)
{
	logger.fatal("Login failed");
	Assert.fail();
}

logger.info("Account Login sucess Tc002 scuesss");

}		
		
	

}
