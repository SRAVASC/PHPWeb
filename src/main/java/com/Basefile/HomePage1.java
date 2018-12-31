package com.Basefile;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage1 extends Base1 {

	WebDriver driver;
	 
    public HomePage1(WebDriver driver){ 
             this.driver=driver; 
    }
		
    @FindBy(xpath="//b[contains(text(),'Demo')]")
    WebElement DemoBtn;
    
    @FindBy(xpath=("//span[text()='Login']"))
		// TODO Auto-generated method stub
    
   WebElement LgnBtn;
    
    
        
    
   public void  ClickonDemoBtn() {
    	DemoBtn.click();
   }
    	
    /*	boolean presentFlag = false;

    	  try {

    	   // Check the presence of alert
    	   Alert alert = driver.switchTo().alert();
    	   // Alert present; set the flag
    	   presentFlag = true;
    	   // if present consume the alert
    	   alert.accept();

    	  } catch (NoAlertPresentException ex) {
    	   // Alert not present
    	   ex.printStackTrace();
    	  }

    //	  return presentFlag;

    	  return presentFlag; */


 
    
    
    public void ClickonLgnBtn() {
    //	DemoBtn.click();
    	
    	LgnBtn.click();
    }
		

	}

