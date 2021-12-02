package com.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



import com.PageObjectes.PO_Login_Page_Objectes;
import com.commonFunctons.commonFunctions_01;

public class TC_Login_Page_Objectes extends commonFunctions_01  {
	
	
	
	public void Logintestcase()  {

		PageFactory.initElements(driver, PO_Login_Page_Objectes.class);
	    PO_Login_Page_Objectes.username.sendKeys(properties.getProperty("username"));
	    PO_Login_Page_Objectes.password.sendKeys(properties.getProperty("password"));
	    PO_Login_Page_Objectes.loginButton.click();
	
	}
	
	public void loginErrorMessage() {
		String actualMessage = driver.findElement(By.xpath("//*[@id='messages']/ul/li/ul/li/span")).getText();
		String ExpectedMessage="You did not sign in correctly or your account is temporarily disabled.";
		
		if (actualMessage.equals(ExpectedMessage)) {
			System.out.println("The Test Case Passed");
		} else {
             System.out.println("The Test Case Failed");
		}
		
	}
	@Test
	public void Loginpage() {
		Logintestcase();
		loginErrorMessage();
		
	}
	

}
