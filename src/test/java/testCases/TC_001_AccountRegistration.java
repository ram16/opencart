package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistration extends BaseClass {


	
	@Test(groups = {"regression","master"})
		public void test_account_Registration() {
		
		try
		{
		
		
			logger.info("Stating TC_001_AccountRegistration");
			
			driver.get(rb.getString("appURL"));
			logger.info("Home Page Displayed");
			
			driver.manage().window().maximize();
			
			HomePage hp = new HomePage(driver);
			
			hp.clickRegister();
		
			AccountRegistrationPage repage = new AccountRegistrationPage(driver);
			
			repage.setFirtName("Jhon");
			logger.info("Provided firstname");
			
			repage.setLastName("Carter");
			
			repage.setEmail(randomestring()+"@gmail.com");
			
			repage.setPassword("asdfg" );
			
		

			

		
		String confmsg = repage.getConfirmatonMsg();
		if (confmsg.equals("Welcome to OpenCart, your account has been created"))
		{
			Assert.assertTrue(true);
			
		}
		else
		{
			logger.error("Account Registration failed");
				Assert.assertTrue(false);
			
			}
		}
		
		catch(Exception e)
		{
			logger.error("Account Registration failed");
			Assert.fail();
		}
		
		logger.info("Account Registration sucess");
		
		}		
				
	}



	

