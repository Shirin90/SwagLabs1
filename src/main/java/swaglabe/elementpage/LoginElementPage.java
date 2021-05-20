package swaglabe.elementpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swaglab.basepage.BasePage;

public class LoginElementPage extends BasePage {

	public LoginElementPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "user-name")
	@CacheLookup
	private WebElement userName;

	public WebElement getUserName() {
		return userName;
	}

	@FindBy(id = "password")
	@CacheLookup
	private WebElement pwd;

	public WebElement getPwd() {
		return pwd;
	}

	public void getTitles() {
		driver.getTitle();
	}
	@FindBy(xpath= "//*[@class='app_logo']")
	@CacheLookup
	private WebElement appLogo;

	public WebElement getAppLogo() {
		return appLogo;
	
	}
	@FindBy(xpath= "//*[@class='error-message-container error']") 
	@CacheLookup
	private WebElement errorMessage;

	public WebElement getErrorMessage() {
		return errorMessage;

	}}
