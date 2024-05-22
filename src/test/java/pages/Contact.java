package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Contact {
    public Contact(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(how= How.ID, using = "firstName")
    public WebElement txtFirstName;

    @FindBy(how= How.ID, using = "middleName")
    public WebElement txtMiddleName;

    @FindBy(how= How.ID, using = "lastName")
    public WebElement txtLastName;

    @FindBy(how= How.ID, using = "preferredFullName")
    public WebElement txtPreferredFullName;

    @FindBy(how= How.ID, using = "addressLine1")
    public WebElement txtAddressLine1;

    @FindBy(how= How.ID, using = "addressLine2")
    public WebElement txtAddressLine2;

    @FindBy(how= How.ID, using = "addressLine3")
    public WebElement txtAddressLine3;

    @FindBy(how= How.ID, using = "postcode")
    public WebElement txtPostcode;

    @FindBy(how= How.ID, using = "city")
    public WebElement txtCity;

    @FindBy(how= How.ID, using = "state")
    public WebElement dropdownState;

    @FindBy(how= How.XPATH, using = "//button[normalize-space()='Back']")
    public WebElement btnContactBack;

    @FindBy(how= How.XPATH, using = "//button[normalize-space()='Next']")
    public WebElement btnContactNext;

    public void enterFirstName(String FirstName) {
        txtFirstName.sendKeys(FirstName);
    }
    public void enterMiddleName(String MiddleName) {
        txtMiddleName.sendKeys(MiddleName);
    }
    public void enterLastName(String LastName) {

        txtLastName.sendKeys(LastName);
    }
    public String getPreferredFullName(WebDriver driver) {
        return txtPreferredFullName.getAttribute("value");
    }
    public void enterAddressLine1(String AddressLine1) {
        txtAddressLine1.sendKeys(AddressLine1);
    }
    public void enterAddressLine2(String AddressLine2) {
        txtAddressLine2.sendKeys(AddressLine2);
    }
    public void enterAddressLine3(String AddressLine3) {
        txtAddressLine3.sendKeys(AddressLine3);
    }
    public void enterPostcode(String Postcode) {
        txtPostcode.sendKeys(Postcode);
    }
    public void enterCity(String City) {
        txtCity.sendKeys(City);
    }
    public void selectState() {
        Select StateDropDown = new Select(dropdownState);
        StateDropDown.selectByVisibleText("Queensland");
    }
    public void clickContactBack(){
        btnContactBack.click();
    }
    public void clickContactNext(){
        btnContactNext.click();
    }

}
