package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TermsConditions {
    public TermsConditions(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    @FindBy(how= How.XPATH, using = "//input[@id='agreedToTerms']")
    public WebElement chkIAgree;

    @FindBy(how= How.XPATH, using = "//button[normalize-space()='Back']")
    public WebElement btnTcBack;

    @FindBy(how= How.XPATH, using = "//button[normalize-space()='Submit']")
    public WebElement btnTcSubmit;


    public void clickIAgree(){
        chkIAgree.click();
    }

    public void clickTcBack(){
        btnTcBack.click();
    }

    public void clickTcSubmit(){
        btnTcSubmit.click();
    }

    public void scrollTermsConditions(WebDriver driver){
        WebElement element = driver.findElement(By.xpath("//textarea[@id='termsAndConditions']"));
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        action.click(element).perform();
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

    }
}

