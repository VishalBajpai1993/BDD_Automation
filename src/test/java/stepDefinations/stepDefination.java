package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {

    @Given("User is on netbanking login page")
    public void user_is_on_netbanking_login_page() {
    	System.out.println("Done, given");
    }

    @When("^User log into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_log_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() {
    	System.out.println("Done, then");
    }

    @And("^Cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed(String strArg1) {
    	System.out.println(strArg1);
    }

}