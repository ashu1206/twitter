package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//span[contains(text(),'Log in')]")
	WebElement login;

	@FindBy(xpath="//input[@name='session[username_or_email]' and @type='text']")
	WebElement userName;

	@FindBy(xpath="//input[@name='session[password]' and @type='password']")
	WebElement pass;

	@FindBy(xpath="//span[contains(text(),'Log in')]/../../..//div[@role='button']")
	WebElement clicklogin;

	public void loginClick() {

		login.click();
	}

	public void enterUserName(String username) {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(userName));
		userName.sendKeys(username);
	}

	public void enterPassword(String password) {

		pass.sendKeys(password);
	}

	public void clickLogin() {

		clicklogin.click();
	}

}

