package stepdefinitions;

import actions.LoginPageActions;
import cucumbercourse.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Messages;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SignUpSteps {
    static LoginPageActions loginPageActions = new LoginPageActions();

    @Given("I login to the website")
    public void i_login_to_the_website() {
        HelperClass.openPage("https://www.lambdatest.com/");
    }
    @When("I click on button sign up")
    public void i_click_on_button_sign_up() {
        loginPageActions.clickSignUp();
    }
    @Then("I should see free sign up button")
    public void i_should_see_free_sign_up_button() {
        assertTrue(loginPageActions.isFreeSignUpButtonDisplayed(), "Free sign up button is not displayed");
    }

    @Then("Sign up header is displayed")
    public void sign_up_header_is_displayed() {
        assertTrue(loginPageActions.isSignUpHeaderDisplayed(), "Sign Up header is not displayed");
        assertEquals(Messages.EXPECTED_SIGN_UP_HEADER, loginPageActions.getSignUpHeaderText(), "Header text is not as expected");
    }
}
