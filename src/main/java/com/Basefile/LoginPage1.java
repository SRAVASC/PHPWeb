package com.Basefile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


	
	public class LoginPage1 extends Base1 {
		
		WebDriver driver;
		 
	    public LoginPage1(WebDriver driver){ 
	             this.driver=driver; 
	    }

	//Using FindBy for locating elements
	    
	 //   @FindBy(xpath="//input[@name='username']")
	    @FindBy(id="inputEmail")
	    WebElement emailaddress;
	    
	    @FindBy(id="inputPassword")
	    WebElement Password;
	    
	    @FindBy(id="login")
	    WebElement signinBtn;
	    
	    
	    public void setEmail(String strEmail) {
	    	emailaddress.sendKeys(strEmail);
	    	
	    }
	    
	    public void setPassword(String StrPassword) {
	    	
	    	Password.sendKeys(StrPassword);
	    }
	    public void clickonLoginButton() {
	    	
	    	signinBtn.click();
	    }
	}


	




