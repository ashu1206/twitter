package stepDefinition;

import java.awt.AWTException;

import baseClass.BrowserSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import pages.SearchAndPrintPage;

public class Steps extends BrowserSetUp {
	
	LoginPage loginPage;
	SearchAndPrintPage searchPrint;
	
	@Given("that user launch the {string} and is on login page")
	public void that_user_launch_the_and_is_on_login_page(String url) {
		
		initializeBrowser(url);
		
	}

	@Then("click on login")
	public void click_on_login() {
		
		loginPage = new LoginPage(driver);
		loginPage.loginClick();
	}

	@Then("user login with valid {string} & {string}")
	public void user_login_with_valid(String username, String password) {
	
		loginPage = new LoginPage(driver);
		loginPage.enterUserName(username);
		loginPage.enterPassword(password);
	}

	@Then("click on second login")
	public void click_on_second_login() {
		
		loginPage = new LoginPage(driver);
		loginPage.clickLogin();
	}

	@Then("serach for favorite twitter {string}")
	public void serach_for_favorite_twitter(String profile) throws AWTException {
		
		searchPrint = new SearchAndPrintPage(driver);
		searchPrint.searchTheProfile(profile);
	}

	@Then("click on the valid profile from the suggestions")
	public void click_on_the_valid_profile_from_the_suggestions() {
		
		searchPrint = new SearchAndPrintPage(driver);
		searchPrint.clickOnProfile();
	}

	@Then("click on followers of the profile")
	public void click_on_followers_of_the_profile() {
		
		searchPrint = new SearchAndPrintPage(driver);
		searchPrint.clickOnFollowers();
	}

	@Then("print all the followers")
	public void print_all_the_followers() {
		
		searchPrint = new SearchAndPrintPage(driver);
		searchPrint.listOfNames();
	}


}
