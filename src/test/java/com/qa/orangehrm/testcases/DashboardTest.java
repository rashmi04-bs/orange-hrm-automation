package com.qa.orangehrm.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.orangehrm.basetest.BaseTest;
import com.qa.orangehrm.pageobjects.RecruitmentPage;



public class DashboardTest extends BaseTest {
	@BeforeMethod
	public void precondition() {
		dbg=lp.enterDetails(Usern, passw);
	}
	@Test
public void ClickModule() {
 rp=(RecruitmentPage) dbg.selectModule("Recruitment");
rp.clickOnCandidates();

}
	
}
