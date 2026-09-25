package com.qa.orangehrm.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.orangehrm.frameworkException.FramException;



public class DashBoardPage extends Basepage {
final private By profilemenu =By.xpath("//img[@alt='profile picture']");
final private By logoutbtn = By.xpath("//a[.='Logout']");
	 public By moduleLocator(String moduleName) {
		 return By.xpath("//span[normalize-space()='" + moduleName +"']");
	 }
	public DashBoardPage(WebDriver driver) {
		super(driver);
	}
	public String validateDashBoardUrl() { 
		return act.printurl();
	}
	public  Basepage selectModule(String moduleName) {
		ea.doClick(moduleLocator(moduleName));
		switch (moduleName) {
		case "Recruitment":
			return new RecruitmentPage(driver);
    	case "PIM":
 		return new PIMPage(driver);	
//		case "Leave":
//			return new LeavePage(driver);
		default:
			throw new FramException("invalid module seleced");

		}
	}
	public void doLogout() {
		ea.doClick(profilemenu);
		ea.doClick(logoutbtn);
	}
}
