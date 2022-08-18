package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRegistrationPage {
	
	
		WebDriver driver;
		
		
		public AccountRegistrationPage(WebDriver driver) {
			
			
			this.driver = driver;
			PageFactory.initElements(driver, this);
			
		}
		
		
		@FindBy(xpath="//input[@id='input-firstname']")
		WebElement txtUsername;
		
		
		@FindBy(xpath="//input[@id='input-firstname']")
		WebElement txtFirstName;
		

		@FindBy(xpath="//input[@id='input-lastname']")
		WebElement txtLastName;
		

		@FindBy(xpath="//input[@id='input-email']")
		WebElement txtEmail;

		@FindBy(xpath="//input[@id='input-firstname']")
		WebElement txtCountry;
		
		@FindBy(xpath="//input[@id='input-password']")
		WebElement txtPassword;
		
		@FindBy(xpath="//button[@class='btn btn-primary btn-lg hidden-xs']")
		WebElement btnRegister;
		
	public void setFirtName(String fname) {
		
	 txtFirstName.sendKeys(fname);
		
		
	}
	
	public void setLastName(String lname) {
		
		 txtLastName.sendKeys(lname);
			
			
		}
	
	public void setEmail(String emial ) {
		
		 txtEmail.sendKeys(emial);
			
			
		}
	
	public void setPassword(String pwd) {
		
		 txtPassword.sendKeys(pwd);
			
			
		}
	
	public void selectCountry(String country) {
		
		 txtCountry.sendKeys(country);
	
	
	}
	
	public void clickRegister() {
		
		 btnRegister.click();
	
	
	
	
	
	
	
	
	

}

	public String getConfirmatonMsg() {
		// TODO Auto-generated method stub
		return null;
	}
}
