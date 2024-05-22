package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Complete {
    public Complete(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    @FindBy(how= How.XPATH, using = "//p[contains(text(),'Your user account')]")
    public WebElement txtSuccess;

    public String getSuccessMsg(WebDriver driver) {
        return txtSuccess.getText();
    }

}
