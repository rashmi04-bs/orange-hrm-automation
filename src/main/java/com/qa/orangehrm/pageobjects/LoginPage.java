package com.qa.orangehrm.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Basepage{
	final private By untf = By.name("username");
	final private By pwdtf =By.name("password");
	final private By log_btn = By.xpath("//button[@type='submit']");
  public LoginPage(WebDriver driver) {
	  super(driver);
  }
  public DashBoardPage enterDetails(String username,String password) {
	 ea.doEnterValue(username, untf); 
	 ea.doEnterValue(password, pwdtf);
	 ea.doClick(log_btn);
	 return new DashBoardPage(driver);
  }

}
