package stepDefinitionsFramework;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.testng.Assert;

import com.qa_academy.PageObjects.LandingPage;
import com.qa_academy.PageObjects.Login_Page;
import com.qa_academy.PageObjects.PortalHomePage;
import com.qa_academy.TestBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinition extends TestBase {

	public LandingPage lp;
	public Login_Page login_Page;
	public PortalHomePage ph;

	public StepDefinition() throws IOException {
		super();
	}

	@Given("^Initialize The Browser$")
	public void initialize_The_Browser() throws Throwable {
		driver = Initialization();
	}

	@And("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@And("^Click on Login in the HomePage$")
	public void click_on_Login_in_the_HomePage() throws Throwable {
		lp = new LandingPage(driver);
		lp.Click_Login();

	}

	@When("^User Enter UserName \"([^\"]*)\" Password \"([^\"]*)\" and click login$")
	public void user_Enter_UserName_Password_and_click_login(String arg1, String arg2) throws Throwable {

		login_Page = new Login_Page(driver);
		login_Page.enter_Email().sendKeys(arg1);
		login_Page.enter_Pass().sendKeys(arg2);
		login_Page.Login().click();
	}

	@When("^User Enter UserName (.+) Password (.+) and click login$")
	public void user_enter_username_password_and_click_login(String username, String password) throws Throwable {
		login_Page = new Login_Page(driver);
		login_Page.enter_Email().sendKeys(username);
		login_Page.enter_Pass().sendKeys(password);
		login_Page.Login().click();
	}

	@Then("^Verify User Is Successfully Logged in or not$")
	public void verify_User_Is_Successfully_Logged_in_or_not() throws Throwable {

		ph = new PortalHomePage(driver);

		Assert.assertTrue(ph.verify_Uname().isDisplayed());
	}

}