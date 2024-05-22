import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.time.Duration;

public class TestSuccessfulRegistration extends Pages.BaseClass {
    @Test
    public void OrikanRegistrationTest() throws InterruptedException {

        Registration registerPage = new Registration(driver);
        registerPage.enterEmailAddress("sai.battu@gmail.com");
        registerPage.enterPassword("Testing@123");
        registerPage.enterConfirmPassword("Testing@123");
        registerPage.clickRegisterNext();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement emailMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//app-toast-message//div")));
        System.out.println("Alert Message: " + emailMessage.getText());
        Contact contactPage = new Contact(driver);
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(1000));
        wait1.until(ExpectedConditions.visibilityOfAllElements(contactPage.txtFirstName));
        contactPage.enterFirstName("Sai");
        contactPage.enterMiddleName("Shankar");
        contactPage.enterLastName("Battu");
        String fullName = contactPage.getPreferredFullName(driver);
        System.out.println("Full Name: "+ fullName);
        Assert.assertTrue(fullName.contains("Sai"));
        contactPage.enterAddressLine1("123 raven");
        contactPage.enterAddressLine2("Avenue");
        contactPage.enterAddressLine3("Mount Roskill");
        contactPage.enterPostcode("1234");
        contactPage.enterCity("Auckland");
        contactPage.selectState();
        contactPage.clickContactNext();


        Payment paymentPage = new Payment(driver);
        paymentPage.enterCardHolderName("Sai Battu");
        paymentPage.clickVisaCard();
        paymentPage.enterCardNumber("1234000044445555");
        paymentPage.enterCardCVV("123");
        paymentPage.selectCardExpiryMonth();
        paymentPage.enterCardExpiryYear("2035");
        paymentPage.clickPaymentNext();

        TermsConditions tcPage = new TermsConditions(driver);
        tcPage.scrollTermsConditions(driver);
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(1000));
        wait2.until(ExpectedConditions.elementToBeClickable(tcPage.chkIAgree));
        tcPage.clickIAgree();
        tcPage.clickTcSubmit();

        Complete completePage = new Complete(driver);
        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(1000));
        wait3.until(ExpectedConditions.visibilityOfAllElements(completePage.txtSuccess));
        System.out.println(completePage.txtSuccess.getText());
        Assert.assertTrue(completePage.getSuccessMsg(driver).contains("success"));

    }
}





