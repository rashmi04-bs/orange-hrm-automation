package com.qa.orangehrm.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.orangehrm.basetest.BaseTest;
import com.qa.orangehrm.pageobjects.PIMPage;
import com.qa.orangehrm.utilities.FakeData;

public class PIMTest extends BaseTest{
	@BeforeMethod
public void precondition() {
  dbg=lp.enterDetails(Usern, passw);
  pp=(PIMPage) dbg.selectModule("PIM");
  pp.clickonAddEmp();
  
}
	@Test
	public void addEmp() {
		String firstname = FakeData.getFn();
		String Middlename = FakeData.getMn();
		String lastName = FakeData.getLn();
		pp.createEmp(firstname, Middlename, lastName);
	}
}
