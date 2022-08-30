package com.telus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

public class SuccesfullMsgValidationPage {

	String expMsg = "Registration Form is Successfully Submitted.";

	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//*[@data-id='2e9cde64']")
	@CacheLookup
	WebElement succMsg;

	public SuccesfullMsgValidationPage(WebDriver driver) {
		this.driver = driver;
	}

	public void validateSuccessfulMsg() {

		String actMsg = succMsg.getText();
		String transsction[] = actMsg.split(":");
		String tranId = transsction[1].trim();
        
		// Validating Successful Registration Message.
		if (actMsg.contains(expMsg)) {
			Reporter.log("The Actual and Expected Message of Successful Registration are Same.");
			Reporter.log("The Succesful message is validated.");
			Reporter.log("The Successful Registration Message is - " + actMsg+".");
			Reporter.log("The Transaction Id is " + tranId+".");
		} else {
			Reporter.log("The Actual and Expected Message of Successful Registration are not Same.");
			Reporter.log("The Actual Successful Registration Message is " + actMsg);
			Reporter.log("The Expected Message of Successful Registration is " + expMsg);
		}

	}

}
