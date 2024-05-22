package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Payment {
    public Payment(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    @FindBy(how= How.ID, using = "cardHolderName")
    public WebElement txtCardHolderName;

    @FindBy(how= How.XPATH, using = "//input[@id='cardTypeVISA']")
    public WebElement btnCardVisa;

    @FindBy(how= How.XPATH, using = "//input[@id='cardTypeMastercard']")
    public WebElement btnCardMaster;

    @FindBy(how= How.ID, using = "cardNumber")
    public WebElement txtCardNumber;

    @FindBy(how= How.ID, using = "cardCVV")
    public WebElement txtCardCVV;

    @FindBy(how= How.ID, using = "cardExpiryMonth")
    public WebElement dropdownCardExpiryMonth;

    @FindBy(how= How.ID, using = "cardExpiryYear")
    public WebElement txtCardExpiryYear;

    @FindBy(how= How.XPATH, using = "//button[normalize-space()='Back']" )
    public WebElement btnPaymentBack;

    @FindBy(how= How.XPATH, using = "//button[normalize-space()='Next']" )
    public WebElement btnPaymentNext;

    public void enterCardHolderName(String CardHolderName) {
        txtCardHolderName.sendKeys(CardHolderName);
    }
    public void clickVisaCard(){
        btnCardVisa.click();
    }
    public void clickMasterCard(){
        btnCardMaster.click();
    }
    public void enterCardNumber(String CardNumber) {
        txtCardNumber.sendKeys(CardNumber);
    }
    public void enterCardCVV(String CardCVV) {
        txtCardCVV.sendKeys(CardCVV);
    }
    public void selectCardExpiryMonth(){
        Select MonthDropDown = new Select(dropdownCardExpiryMonth);
        MonthDropDown.selectByVisibleText("November");
    }
    public void enterCardExpiryYear(String ExpiryYear) {
        txtCardExpiryYear.sendKeys(ExpiryYear);
    }

    public void clickPaymentBack(){
        btnPaymentBack.click();
    }
    public void clickPaymentNext(){
        btnPaymentNext.click();
    }
}


