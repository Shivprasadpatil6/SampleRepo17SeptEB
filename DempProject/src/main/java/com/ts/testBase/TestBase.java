package com.ts.testBase;

import java.time.Duration;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.ds.pageLayer.DashBoardPage;
import com.ds.pageLayer.ExchangePage;
import com.ds.pageLayer.LoginPage;
import com.ds.pageLayer.TransactionPage;
import com.ds.utilities.ReadConfig;
import com.ds.utilities.UtilClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	

	public static WebDriver driver;
	public static Logger logger;
	
	
	
	@BeforeTest
	public void start()
	{
		logger = Logger.getLogger("DalalStreet Automation Framwork");
		PropertyConfigurator.configure("Log4jfile.properties");
		logger.info("Framework Execution started");
		
		
	
		
	}
	@AfterTest
	public void end()
	{
		logger.info("Framework Execution stop");
	}
	
   
   @Parameters("browser")
    @BeforeMethod
	public void setUp(String br) throws InterruptedException 
	{
		{
			
			if(br.equals("chrome"))
			{
					WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();
			}
			else if(br.equals("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
			else if(br.equals("edge"))
			{
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}
			
			else
			{
				System.out.println("Please provide correct browser name");
			}
			ReadConfig read_config=new ReadConfig();
			driver.get(read_config.getApplicationUrl());
			// driver.get("https://apps.dalalstreet.ai/register");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			logger.info("Browser launches,url,maximize");
			///obj creation
		
			
		

			
			//--login steps--
			
			
			
		}
		
		


		
	}
	
	@AfterMethod
	public void tearDown()
	{
//	driver.quit();
	}
	
	
}











