package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Registration {
    public Registration(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    @FindBy(how= How.ID, using = "emailAddress")
    public WebElement txtEmailAddress;

    @FindBy(how= How.ID, using = "password")
    public WebElement txtPassword;

    @FindBy(how= How.ID, using = "confirmPassword")
    public WebElement txtConfirmPassword;

    @FindBy(how= How.XPATH, using = "//app-register-wizard//button[contains(text(), 'Next')]")
    public WebElement btnRegisterNext;

    public void enterEmailAddress(String emailAddress) {
        txtEmailAddress.sendKeys(emailAddress);
    }

    public void enterPassword(String password) {
        txtPassword.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        txtConfirmPassword.sendKeys(confirmPassword);
    }

    public void clickRegisterNext() {
        btnRegisterNext.click();
    }

}
