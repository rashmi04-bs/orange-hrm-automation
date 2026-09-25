package com.qa.orangehrm.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecruitmentPage extends Basepage {

    final private By vaccanciestab =
            By.xpath("//a[.='Vacancies']");

    final private By candidatetab =
            By.xpath("//a[.='Candidates']");

    // Corrected Add button locator
    final private By Add_button =
            By.xpath("//button[normalize-space()='Add']");

    final private By fntf =
            By.name("firstName");

    final private By mntf =
            By.name("middleName");

    final private By lntf =
            By.name("lastName");

    final private By emailtf =
            By.xpath("(//input[@placeholder='Type here'])[1]");

    // Corrected upload locator
    final private By resumeupload =
            By.cssSelector("input[type='file']");

    final private By consent_btn =
            By.xpath("//span[contains(@class,'oxd-checkbox-input')]");

    final private By save_btn =
            By.xpath("//button[@type='submit']");

    public RecruitmentPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnvaccancies() {
        ea.doClick(vaccanciestab);
    }

    public void clickOnCandidates() {
        ea.doClick(candidatetab);
    }

    public void clickOnAddButton() {

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        ea.doClick(Add_button);
    }

    public void addDetails(String fn,
                           String mn,
                           String ln,
                           String email,
                           String filepath) {

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        ea.doEnterValue(fn, fntf);

        ea.doEnterValue(mn, mntf);

        ea.doEnterValue(ln, lntf);

        ea.doEnterValue(email, emailtf);

        // Direct file upload
        driver.findElement(resumeupload).sendKeys(filepath);

        ea.doClick(consent_btn);

        ea.doClick(save_btn);
    }
}