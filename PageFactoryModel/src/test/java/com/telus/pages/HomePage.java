package com.telus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

public class HomePage {

	WebDriver driver;
	// Finding WebElements using locators.
	@FindBy(how = How.XPATH, using = "//span[text()='QA Automation']")
	@CacheLookup
	WebElement qaAutomation;

	@FindBy(how = How.XPATH, using = "//span[text()='Practice Automation']")
	@CacheLookup
	WebElement practiceAutomation;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Demo Site – Registration Form')]")
	@CacheLookup
	WebElement registerForm;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// Navigating to QA AUTOMATION.
	public void navigateToQaAutomation() {
		Actions action = new Actions(driver);

		action.moveToElement(qaAutomation).perform();
		Reporter.log("QA AUTOMATION is Displayed.");

	}

	// Navigating to Practice Automation.
	public void navigateToPracticeAutomation() {
		Actions action = new Actions(driver);

		action.moveToElement(practiceAutomation).perform();
		Reporter.log("Practice Automation is Displayed.");

	}

	// Launching Registration Form Page.
	public void clickToRegisterDemo() {
		registerForm.click();
		Reporter.log("Registration Form is clicked.");

	}

}