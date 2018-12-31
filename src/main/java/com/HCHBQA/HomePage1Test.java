package com.HCHBQA;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Basefile.Base1;
import com.Basefile.HomePage1;
import com.Basefile.LoginPage1;

public class HomePage1Test extends Base1{
	
	
	
	@Test(priority=1)
	
	public void DemoBtnTest() {
	
	HomePage1 homepage=PageFactory.initElements(driver, HomePage1.class);
	
	homepage.ClickonDemoBtn();
	}
	
	@Test(priority=2)
		//HomePage1 homepage=PageFactory.initElements(driver, HomePage1.class);
	
	public void LgnBtnTest() {
		HomePage1 homepage=PageFactory.initElements(driver, HomePage1.class);
		homepage.ClickonLgnBtn();
	}
	
	

}
