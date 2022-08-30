package com.telus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class RegisterDemoPage {

	WebDriver driver;

	// Initializing the WebElements locator Values using FindBy class.
	@FindBy(how = How.XPATH, using = "//*[@id=\"item-vfb-1\"]/div/h3")
	@CacheLookup
	WebElement titleText;

	@FindBy(how = How.XPATH, using = "//*[@id='vfb-5']")
	@CacheLookup
	WebElement firstNameTextBox;

	@FindBy(how = How.XPATH, using = "//*[@id='vfb-7']")
	@CacheLookup
	WebElement lastNameTextBox;

	@FindBy(how = How.XPATH, using = "//input[@id='vfb-8-1']")
	@CacheLookup
	WebElement genderMaleRadioBtn;

	@FindBy(how = How.XPATH, using = "//input[@id='vfb-13-address']")
	@CacheLookup
	WebElement streetAddressTextBox;

	@FindBy(how = How.XPATH, using = "//input[@id='vfb-13-address-2']")
	@CacheLookup
	WebElement aptTextBox;

	@FindBy(how = How.XPATH, using = "//input[@id='vfb-13-city']")
	@CacheLookup
	WebElement cityTextBox;

	@FindBy(how = How.XPATH, using = "//input[@id='vfb-13-state']")
	@CacheLookup
	WebElement stateTextBox;

	@FindBy(how = How.XPATH, using = "//input[@id='vfb-13-zip']")
	@CacheLookup
	WebElement zipCodeTextBox;

	@FindBy(how = How.XPATH, using = "//select[@id='vfb-13-country']")
	@CacheLookup
	WebElement countryDropDown;

	@FindBy(how = How.XPATH, using = "//input[@id='vfb-14']")
	@CacheLookup
	WebElement emailIdTextBox;

	@FindBy(how = How.XPATH, using = "//input[@id='vfb-18']")
	@CacheLookup
	WebElement dateOfDemoTextBox;

	@FindBy(how = How.XPATH, using = "//select[@id='vfb-16-hour']")
	@CacheLookup
	WebElement convTimeHHPath;

	@FindBy(how = How.XPATH, using = "//select[@id='vfb-16-min']")
	@CacheLookup
	WebElement convTimeMMPath;

	@FindBy(how = How.XPATH, using = "//input[@id='vfb-19']")
	@CacheLookup
	WebElement mobileTextBox;

	@FindBy(how = How.XPATH, using = "//input[@id='vfb-20-1']")
	@CacheLookup
	WebElement uftCheckBox;

	@FindBy(how = How.XPATH, using = "//input[@id='vfb-20-2']")
	@CacheLookup
	WebElement testNgCheckBox;

	@FindBy(how = How.XPATH, using = "//textarea[@id='vfb-23']")
	@CacheLookup
	WebElement queryTextBox;

	@FindBy(how = How.XPATH, using = "//label[normalize-space()='Example: 99']")
	@CacheLookup
	WebElement verInputBoxMsg;

	@FindBy(how = How.XPATH, using = "//input[@id='vfb-3']")
	@CacheLookup
	WebElement verTextBox;

	@FindBy(how = How.XPATH, using = "//input[@id='vfb-4']")
	@CacheLookup
	WebElement submitButton;

	public RegisterDemoPage(WebDriver driver) {
		this.driver = driver;
	}

	String expTitle = "Register For Demo";

	// Title Validation.
	public void title() {
		if (titleText.isDisplayed()) {
			Reporter.log("Title is Displayed.");

		} else {
			Reporter.log("Title is not Displayed.");
		}
		String title = titleText.getText();
		if (title.equals(expTitle)) {
			Reporter.log("Actual and Expected title are same.");
			Reporter.log("The Title is " + title+".");
			Reporter.log("-------------------------------------------------------------------");

		} else {
			Reporter.log("Actual and Expected title are not same");
			Reporter.log("The Actual title is " + title);
			Reporter.log("The Expected title is " + expTitle);

		}
	}

	// First Name Text Box.
	public void setFirstName(String firstName) {
		firstNameTextBox.sendKeys(firstName);
		Reporter.log("The First Name is " + firstName + ".");
	}

	// Last Name Text Box.
	public void setLastName(String lastName) {
		lastNameTextBox.sendKeys(lastName);
		Reporter.log("The Last Name is " + lastName + ".");
	}

	// Male Radio Button.
	public void selectMaleRadioBtn() {
		genderMaleRadioBtn.click();
		Reporter.log("Gender - Male is selected.");
	}

	// Street Address Text Box.
	public void setStreetAddress(String streetAddress) {
		streetAddressTextBox.sendKeys(streetAddress);
		Reporter.log("The Street address is " + streetAddress);
	}

	// Apartment Text Box.
	public void setApt(String aptNum) {
		aptTextBox.sendKeys(aptNum);
		Reporter.log("The Apartment Number is " + aptNum + ".");
	}

	// City Text Box.
	public void setCity(String city) {
		cityTextBox.sendKeys(city);
		Reporter.log("The City is " + city + ".");
	}

	// State Text Box.
	public void setState(String state) {
		stateTextBox.sendKeys(state);
		Reporter.log("The State is " + state + ".");
	}

	// zipCode Text Box.
	public void setzipCode(String zipCode) {
		zipCodeTextBox.sendKeys(zipCode);
		Reporter.log("The Zip code is " + zipCode + ".");
	}

	// Country DropDown.
	public void selectCountry(String country) {
		Select dropDown = new Select(countryDropDown);
		dropDown.selectByVisibleText(country);
		Reporter.log("Country "+country + " is Selected.");
	}

	// Email Text Box.
	public void setEmailId(String emailId) {
		emailIdTextBox.sendKeys(emailId);
		Reporter.log("The Email ID is " + emailId);
	}

	// Date of Demo Text Box.
	public void setDateOfDemo(String dateOfDemo) {
		dateOfDemoTextBox.sendKeys(dateOfDemo);
		Reporter.log("The Date Of Demo is " + dateOfDemo + ".");
	}

	// ConvenientTimeHH DropDown.
	public void setConvenientTimeHH(String hh) {
		Select dropDown = new Select(convTimeHHPath);
		dropDown.selectByVisibleText(hh);
		Reporter.log("The Convenient Time HH \"" + hh +"\" is Selected.");
	}

	// ConvenientTimeMM DropDown.
	public void setConvenientTimeMM(String mm) {
		Select dropDown = new Select(convTimeMMPath);
		dropDown.selectByVisibleText(mm);
		Reporter.log("The Convenient Time MM \"" + mm + "\" is Selected.");
	}

	// Mobile Text Box.
	public void setMobile(String mobileNum) {
		mobileTextBox.sendKeys(mobileNum);
		Reporter.log("The Mobile Number is " + mobileNum + ".");
	}

	// UFT Check Box.
	public void selectUft() {
		uftCheckBox.click();
		Reporter.log("The UFT CheckBox is selected.");
	}

	// TestNG Check Box.
	public void selectTestNg() {
		lastNameTextBox.click();
		Reporter.log("The TestNG CheckBox is selected.");
	}

	// Query Text Box.
	public void setQuery(String query) {
		queryTextBox.sendKeys(query);
		Reporter.log("The Query is " + query + ".");
	}

	// Verification Text Box.
	public void setVerificationNum(String verNum) {
		verTextBox.sendKeys(verNum);
		Reporter.log("Verification Number is " + verNum + ".");
		Reporter.log("--------------------------------------------------------------------");

	}

	// clicking submit button.
	public void clicksubmitBtn() {
		submitButton.click();
		Reporter.log("Submit button is clicked.");
	}

}
