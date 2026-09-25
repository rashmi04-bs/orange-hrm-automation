package com.qa.orangehrm.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.orangehrm.basetest.BaseTest;
import com.qa.orangehrm.pageobjects.RecruitmentPage;
import com.qa.orangehrm.utilities.FakeData;

public class AddCandidateTest extends BaseTest{
	@BeforeMethod
	public void precondition() {
		dbg=lp.enterDetails(Usern, passw);
	}
	@Test
	public void ClickModuleandEnterDetails() {
	 rp=(RecruitmentPage) dbg.selectModule("Recruitment");
	rp.clickOnCandidates();
     rp.clickOnAddButton();
         

		
		String firstname =FakeData.getFn();
		String middleName =FakeData.getMn();
		String lastName =FakeData.getLn();
		String email=FakeData.getEmail();
		String resume =FakeData.getResumePath();
		rp.addDetails(firstname, middleName, lastName, email, resume);
		
	}
	
}
