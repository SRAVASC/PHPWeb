package com.Basefile;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base1 {
	
	
	public static WebDriver driver = null;
	 
	 @BeforeTest
	 public void initialize() throws IOException, InterruptedException{
	 
		// System.setProperty("webdriver.gecko.driver", "C:\\Selenium jars_QA2QE_LC\\Selenium_Jars\\gecko driver file\\geckodriver.exe");
			
		//	driver=new FirefoxDriver(); 
		 
	//	 System.setProperty("webdriver.ie.driver", "C:\\Selenium_SandhyaProject\\Drivers\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
		// WebDriver driver = new InternetExplorerDriver();
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Downloads\\chromedriver.exe");
	 //To maximize browser
		 driver = new ChromeDriver();
		 
	                driver.manage().window().maximize();
	                
	               
	                
	                
	         //Implicit wait
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 //To open facebook
	                driver.get("https://phptravels.com/Demo");
	 
	                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	                
	 }
	                public static void handleAlert(){
	                    if(isAlertPresent()){
	                        Alert alert = driver.switchTo().alert();
	                        System.out.println(alert.getText());
	                        alert.accept();
	                      }
	                    }
	                    public static boolean isAlertPresent(){
	                    try{
	                        driver.switchTo().alert();
	                        return true;
	                        }catch(NoAlertPresentException ex){
	                              return false;
	                        }
	                
	                
	               
	              /*  Alert alert= driver.switchTo().alert();
	                
	                System.out.println(alert.getText());
	                
	        // WebElement alert1=driver.findElement(By.id("//button[@id='onesignal-popover-allow-button']"));
	                WebElement alert1=driver.findElement(By.id("onesignal-popover-allow-button"));
	         alert1.click();*/
	             
	             
	             
	               /* alert.accept();
	        		String alertText = alert.getText();
	        		System.out.println("Alert text is " + alertText);
	        		alert.accept();*/

	 
	 }
	 
	 @AfterTest
	 //Test cleanup
	 public void TeardownTest()
	    {
	    driver.close();
	    }
	 
	}

