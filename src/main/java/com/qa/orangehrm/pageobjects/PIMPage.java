package com.qa.orangehrm.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMPage extends Basepage {
	final private By addemp = By.linkText("Add Employee");
	final private By fnTf = By.name("firstName");
	final private By mnTf = By.name("middleName");
	final private By lnTf = By.name("lastName");
	final private By saveBtn = By.xpath("//button[.=' Save ']");

	public PIMPage(WebDriver driver) {
		super(driver);
	}

	public void clickonAddEmp() {
		ea.doClick(addemp);
	}

	public void createEmp(String fn, String mn, String ln) {
		ea.doEnterValue(fn, fnTf);
		ea.doEnterValue(mn, mnTf);
		ea.doEnterValue(ln, lnTf);
		ea.doClick(saveBtn);
	}

}
