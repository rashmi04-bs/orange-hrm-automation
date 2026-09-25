package com.qa.orangehrm.testcases;

import org.testng.annotations.Test;

import com.qa.orangehrm.basetest.BaseTest;
import com.qa.orangehrm.configreader.ConfigReader;

public class LoginTest extends BaseTest {
	@Test
	public void doLogin() {
		lp.enterDetails(Usern, passw);
	}
	

}
