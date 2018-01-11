import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by sureshpasupuleti on 1/10/18.
 */
public class MyStepdefs {

    @Given("^Open firefox and start application$")
    public void open_firefox_and_start_application() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Given");
    }

    @When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
    public void i_enter_valid_and_valid(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("When");
    }

    @Then("^user should be able to login successfully$")
    public void user_should_be_able_to_login_successfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Then");
    }


}
