package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinition {

	@Given("^User is on NetBanking landing page$")
	public void user_is_on_NetBanking_landing_page() throws Throwable {
	    
	   System.out.println("Im from Given");
	}

	@When("^User Login to Application with \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void user_Login_to_Application_with_and_Password(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(arg1);
	    System.out.println(arg2);
	    
	}

	@When("^User Login to Application with Username and Password $")
	public void user_login_to_application_with_username_and_password() throws Throwable {

	}

	@Then("^HomePage is populated$")
	public void homepage_is_populated() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Im From Then");
	}


	  @And("^Cards are displayed are \"([^\"]*)\"$")
	    public void cards_are_displayed_are_something(String strArg1) throws Throwable {
	       System.out.println(strArg1);
	    }

}