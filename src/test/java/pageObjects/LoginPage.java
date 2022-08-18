package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
		
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-lg hidden-xs']")
	WebElement btnLogin;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-lg hidden-xs']")
	WebElement msgHeadig;
	
	public void setEmail(String email ) {
		
		 txtEmail.sendKeys(email);
			
			
		}
	
	public void setPassword(String pwd) {
		
		 txtPassword.sendKeys(pwd);
			
			
	}
public void clickLogin() {
	
	 btnLogin.click();
}
	 
	 public boolean isMyAccountPageExists() {
		 
		 try
		 {
			 return (msgHeadig.isDisplayed());
		 }
		 
		 catch(Exception e)
		 
		 {
			 return (false);
		 }
	 }
		
	

}