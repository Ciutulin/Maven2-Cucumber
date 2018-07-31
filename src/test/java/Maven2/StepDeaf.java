package Maven2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDeaf {

    HomePage homePage = new HomePage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("^user in on log in page$")
    public void user_in_on_log_in_page(){
    }

    @When("^he enter username and password$")
    public void he_enter_username_and_password() {
        homePage.enterLogInCredentials();
    }

    @When("^he clicks on submit button$")
    public void he_clicks_on_submit_button() {
        homePage.clickOnSubmitButton();
    }

    @Then("^he should be loged in successfully$")
    public void he_should_be_loged_in_successfully() {
        dashboardPage.dashboardPage();
    }

    @Given("^user is on login page$")
    public void user_is_on_login_page() {
    }

    @When("^he enter invalid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void he_enter_invalid_and(String username, String password) {
        homePage.enterInvalidCredential(username, password);
    }

    @Then("^he should not be able to log in with \"([^\"]*)\"$")
    public void he_should_not_be_able_to_log_in(String errormessage) {
        homePage.verifyUserIsNotAbleToLogin(errormessage);
    }

}
