package actions;

import cucumbercourse.HelperClass;
import org.openqa.selenium.support.PageFactory;
import pom.LoginPage;

public class LoginPageActions {

    LoginPage loginPage = null;

    public LoginPageActions() {
        this.loginPage = new LoginPage();
        PageFactory.initElements(HelperClass.getDriver(), loginPage);
    }

    //Click on sign up button
    public void clickSignUp() {
        loginPage.signUpButton.click();
    }

    //Get the header of Sign Up page
    public String getSignUpHeaderText() {
        return loginPage.header.getText();
    }

    //Sign Up header is displayed
    public boolean isSignUpHeaderDisplayed() {
        return loginPage.header.isDisplayed();
    }

    //Free Sign Up button is displayed
    public boolean isFreeSignUpButtonDisplayed() {
        return loginPage.freeSignUpButton.isDisplayed();
    }
}