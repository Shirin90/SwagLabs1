package swaglab.stepdef;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import Utilities.CommonUtility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import swaglab.basepage.BasePage;
import swaglabe.elementpage.LoginElementPage;

public class LoginStepDefs extends BasePage {
	LoginElementPage pf;

	@Given("^I am on the Sauce Demo Login Page$")
	public void i_am_on_the_Sauce_Demo_Login_Page() {
		pf = PageFactory.initElements(driver, LoginElementPage.class);

	}

	@When("^I fill the user name \"([^\"]*)\" into the Username field$")
	public void i_fill_the_user_name_into_the_Username_field(String userName) {
		pf.getUserName().sendKeys(userName);
	}

	@When("^I fill password \"([^\"]*)\" the Password field$")
	public void i_fill_password_the_Password_field(String pwd) {
		pf.getPwd().sendKeys(pwd);
	}

	@When("^I click the Login Button$")
	public void i_click_the_Login_Button() throws Throwable {
		CommonUtility.getExplicitWait(pf.getPwd(), driver, 30);
		pf.getPwd().submit();
	}

	@Then("^I am redirected to the Sauce Demo Main Page$")
	public void i_am_redirected_to_the_Sauce_Demo_Main_Page() throws Throwable {
		String expected = "Swag Labs";
		Assert.assertEquals(expected, driver.getTitle());
		System.out.println(expected);
		CommonUtility.getScreenshot(driver, "HomePage");
	}

	@Then("^I verify the App Logo exists$")
	public void i_verify_the_App_Logo_exists() {
		boolean logoPresent = driver.findElement(By.xpath("//*[@class='app_logo']")).isDisplayed();
		Assert.assertTrue(logoPresent);
	}

	@When("^I fill the LockedOutUser name \"([^\"]*)\" into the Username field$")
	public void i_fill_the_LockedOutUser_name_into_the_Username_field(String userName) {
		pf.getUserName().sendKeys(userName);
	}

	@Then("^I verify the Error Message contains the text$")
	public void i_verify_the_Error_Message_contains_the_text() {
		System.out.println(driver.findElement(By.xpath("//*[@class='error-message-container error']")).getText());
		String expected = "Epic sadface: Sorry, this user has been locked out.";
		Assert.assertEquals(expected,
				driver.findElement(By.xpath("//*[@class='error-message-container error']")).getText());
	}

}