package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(partialLinkText = "Sign Up")
    public WebElement signUpButton;

    @FindBy(xpath = "//h1")
    public WebElement header;

    @FindBy(xpath = "//div/*[contains(@data-testid,'signup-button')]")
    public WebElement freeSignUpButton;
}