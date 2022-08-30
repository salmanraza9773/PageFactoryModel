package com.telus.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.telus.pages.HomePage;
import com.telus.pages.RegisterDemoPage;
import com.telus.pages.SuccesfullMsgValidationPage;

public class RegisterDemoEndToEnd {
	
	// Parameterization of input values.
	String firstName = "Salman";
	String lastName = "Raza";
	String streetAddress = "A/12";
	String apartmentNum = "13";
	String city = "Siwan";
	String state = "Bihar";
	String zipCode = "841226";
	String country = "India";
	String emailId = "salmanraza1306@gmail.com";
	String dateOfDemo = "07/07/2022";
	String hour = "12";
	String minute = "05";
	String mobile = "9773782033";
	String query = "How to opt for UFT Course";
	String verificationValue = "99";
    String url = "https://nxtgenaiacademy.com/";
	
    public WebDriver driver;

	@Test(priority = 1)
	public void launchApplication() {
		
		// Set the system property for the ChromeDriver.
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		// Creating instance of ChromeDriver.
		driver = new ChromeDriver();
		
		// Launch the application.
		driver.get(url);
		
		// Maximize the window.
		driver.manage().window().maximize();
		Reporter.log("Application is launched.");
	}

	@Test(priority = 2)
	public void navigateToRegistrationForm() {

		// Creating Instance of HomePage.
		HomePage nav = PageFactory.initElements(driver, HomePage.class);
		
		// Calling methods().
		nav.navigateToQaAutomation();
		nav.navigateToPracticeAutomation();
		nav.clickToRegisterDemo();

	}

	//Registering New user to Para Bank.
	@Test(priority = 3)
	public void registerNewUser() {

		// Creating Instance of RegisterDemoPage.
		RegisterDemoPage registerUser = PageFactory.initElements(driver, RegisterDemoPage.class);

		// Calling methods().
		registerUser.title();
		registerUser.setFirstName(firstName);
		registerUser.setLastName(lastName);
		registerUser.selectMaleRadioBtn();
		registerUser.setStreetAddress(streetAddress);
		registerUser.setApt(apartmentNum);
		registerUser.setCity(city);
		registerUser.setState(state);
		registerUser.setzipCode(zipCode);
		registerUser.selectCountry(country);
		registerUser.setEmailId(emailId);
		registerUser.setDateOfDemo(dateOfDemo);
		registerUser.setConvenientTimeHH(hour);
		registerUser.setConvenientTimeMM(minute);
		registerUser.setMobile(mobile);
		registerUser.selectUft();
		registerUser.selectTestNg();
		registerUser.setQuery(query);
		registerUser.setVerificationNum(verificationValue);
		registerUser.clicksubmitBtn();

	}

	@Test(priority = 4)
	public void succMsgValidation() {

		// Creating Instance of SuccesfullMsgValidationPage.
		SuccesfullMsgValidationPage msgVal = PageFactory.initElements(driver, SuccesfullMsgValidationPage.class);
		
		// Calling methods().
		msgVal.validateSuccessfulMsg();
	}

	@Test(priority = 5)
	public void closeApplication() {
		// Closing the Application.
		driver.close();
		Reporter.log("Application is closed.");

	}

}
