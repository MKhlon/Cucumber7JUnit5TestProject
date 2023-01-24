package pom;

import cucumbercourse.HelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(HelperClass.getDriver(), this);
    }

    @FindBy(partialLinkText = "Sign Up")
    WebElement signUpButton;

    @FindBy(xpath = "//h1")
    WebElement header;

    @FindBy(xpath = "//div/*[contains(@data-testid,'signup-button')]")
    WebElement freeSignUpButton;

    public void clickSignUp() {
        signUpButton.click();
    }

    public String getSignUpHeaderText() {
        return header.getText();
    }

    public boolean isSignUpHeaderDisplayed() {
        return header.isDisplayed();
    }

    public boolean isFreeSignUpButtonDisplayed() {
        return freeSignUpButton.isDisplayed();
    }
}