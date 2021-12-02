package com.PageObjectes;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.commonFunctons.commonFunctions_01;


public class PO_Login_Page_Objectes extends commonFunctions_01 {
	
	@FindBy(id="username")
	public static WebElement username;
	@FindBy(id="login")
	public static WebElement password;
	
	@FindBy(xpath="//input[@type='submit'][@class='form-button']")
	public static WebElement loginButton;
	

}
