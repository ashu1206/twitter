package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchAndPrintPage {
	
	public WebDriver driver;

	public SearchAndPrintPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='text']")
	WebElement search;
	
	@FindBy(xpath="//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/section/div/div/div[3]/div/div/div/div[2]/div[1]/div[1]/a/div/div[1]/div[1]/span/span")
	WebElement profile;
	
	@FindBy(xpath="//span[contains(text(),'Followers')]")
	WebElement followers;
	
	@FindBy(xpath="")
	WebElement list;
	
	public void searchTheProfile(String profile) throws AWTException {
		
		search.sendKeys(profile);
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	public void clickOnProfile() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(profile));
		
		profile.click();
	}
	
	public void clickOnFollowers() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(followers));
		
		followers.click();
	}
	
	public void listOfNames() {
		
		
	}

}
