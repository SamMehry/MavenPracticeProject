package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.AddToCartPageObject;

public class AddToCartStepDefinition extends Base{
	
	
	// create Obj of LoginPageObj
	AddToCartPageObject RegPageObj = new AddToCartPageObject();

	@Given("^User is on TEST Environment page$")
	public void user_is_on_TEST_Environment_page() throws Throwable {
		Base.initializerDriver();

	}

	@When("^User click on MyAccount$")
	public void user_click_on_MyAccount() throws Throwable {
		RegPageObj.clickOnMyAccount();

	}

	@When("^User click on Login$")
	public void user_click_on_Login() throws Throwable {
		RegPageObj.clickOnLogin();
	}

	// (.+) - using this special characters we can parameterize the method so we can
	// use same method with different values

	@When("^User enters username '(.+)' and Password '(.+)'$")
	public void user_enters_username_sdet_tekschool_us_and_Password_sdet(String userName, String passWord)
			throws Throwable {
		RegPageObj.enterEmail(userName);
		RegPageObj.enterPassword(passWord);

	}

	@When("^User click on Login button$")
	public void user_click_on_Login_button() throws Throwable {
		RegPageObj.clickOnLoginButton();

	}

	@Then("^User Should be logged in to user Dashboard$")
	public void user_Should_be_logged_in_to_user_Dashboard() throws Throwable {

		String expectedPageTitle = "My Account";
		String actualPageTitle = RegPageObj.getPageTitle();
		Assert.assertEquals(actualPageTitle, expectedPageTitle);

	}

	@When("^User click on Logout$")
	public void user_click_on_logout() {
		
		RegPageObj.clickOnLogOutButton();

	}

	@Then("^User should be logged out$")
	public void user_should_be_logged_out() {
		
		String expectedPageTitle = "Account Logout";
		String actualPageTitle = RegPageObj.getPageTitle();
		Assert.assertEquals(actualPageTitle, expectedPageTitle);
		

	}

}

