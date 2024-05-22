package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Errors {
    public Errors(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(how= How.XPATH, using = "//span[normalize-space()='Email Address is required']")
    public WebElement errEmailReq;

    @FindBy(how= How.XPATH, using = "//span[normalize-space()='Invalid email address.']")
    public WebElement errInvalidEmail;

    @FindBy(how= How.XPATH, using = "//span[normalize-space()='Password is required.']")
    public WebElement errPasswordReq;

    @FindBy(how= How.XPATH, using = "//span[normalize-space()='Confirm Password is required']")
    public WebElement errConfirmPasswordReq;

    @FindBy(how = How.XPATH, using = "//div[@class='wizard-content']//div[1]//div[1]//div[1]")
    public WebElement errPasswordMismatch;

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='First Name is required']")
    public WebElement errFirstNameReq;

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Last Name is required']")
    public WebElement errLastNameReq;

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Address Line 1 is required']")
    public WebElement errAddressLine1Req;

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Postcode is required']")
    public WebElement errPostcodeReq;

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='City is required']")
    public WebElement errCityReq;

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='State is required']")
    public WebElement errStateReq;

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Cardholder Name is required']")
    public WebElement errCardNameReq;

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Card Type is required']")
    public WebElement errCardTypeReq;

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Card Number is required']")
    public WebElement errCardNumberReq;

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Card CVV is required']")
    public WebElement errCardCVVReq;

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Card Expiry Month is required']")
    public WebElement errCardExpiryMonthReq;

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Card Expiry Year is required']")
    public WebElement errCardExpiryYearReq;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'You must first read all the terms and conditions b')]")
    public WebElement errReadTC;

    public String getEmailReqMsg(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(errEmailReq));
        return errEmailReq.getText();
    }
    public String getInvalidEmailMsg(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(errInvalidEmail));
        return errInvalidEmail.getText();
    }
    public String getPasswordReqMsg(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(errPasswordReq));
        return errPasswordReq.getText();
    }
    public String getConfirmPasswordReqMsg(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(errConfirmPasswordReq));
        return errConfirmPasswordReq.getText();
    }
    public String getPasswordMismatchMsg(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(errPasswordMismatch));
        return errPasswordMismatch.getText();
    }

}
