package testBase;

import java.io.File;
import java.io.IOException;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public	WebDriver driver;
	public Logger logger;
	
	public ResourceBundle rb;
	
	
	
	  @BeforeClass(groups = {"master","sanity","regression"})
	  @Parameters({"browser","url"})
	public	void setup(String br,String ur) { 
		  
		  rb = ResourceBundle.getBundle("config");
			
			
		
		  logger = LogManager.getLogger(this.getClass());  
		
				
				
				if(br.equals("chrome"))
				{
				
				WebDriverManager.chromedriver().setup();
				    driver = new ChromeDriver();
				    logger.info("Launched chrome");
				}
				    
				    else if(br.equals("edge"))
				    {
				    	
						WebDriverManager.edgedriver().setup();
						    driver = new EdgeDriver();
						    logger.info("Launched Edge");
				    }
				    else if(br.equals("firefox"))
				    {
				    	
				    	WebDriverManager.firefoxdriver().setup();
						    driver = new FirefoxDriver();
						    logger.info("Launched firefox");
						    
				    }
				
				driver.get(ur);
			}
	
	
		@AfterClass
		public void tearDown() {
			driver.close();
			
		}
		
		public int randomeNumber() {

			String generatedString2 = RandomStringUtils.randomNumeric(3);
			
			return (Integer.parseInt(generatedString2));
		}
			



		public String randomestring() {
			String generatedString = RandomStringUtils.randomAlphabetic(5);
			
			return (generatedString);
		}
		
		
		public void captureScreen(WebDriver driver,String tname) throws IOException {
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File target = new File(System.getProperty("user.dir") + "\\screenshots\\" + tname + ".png");
			FileUtils.copyFile(source,target);
		
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		

	}
