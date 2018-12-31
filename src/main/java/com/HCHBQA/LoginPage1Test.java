package com.HCHBQA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Basefile.Base1;
import com.Basefile.HomePage1;
import com.Basefile.LoginPage1;

public class LoginPage1Test extends Base1 {
	
	 @Test
	  public void init() {
		 
		 HomePage1 homepage=PageFactory.initElements(driver,HomePage1.class);
			
			homepage.ClickonDemoBtn();
			homepage.ClickonLgnBtn();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		LoginPage1 loginpage=PageFactory.initElements(driver, LoginPage1.class);
		loginpage.setEmail("sandhya.chamata@gmail.com");
		loginpage.setPassword("WELCOME#1");
		loginpage.clickonLoginButton();
				
		   

}
}
