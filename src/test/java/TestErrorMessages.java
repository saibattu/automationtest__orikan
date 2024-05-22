//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import pages.*;
//
//import java.time.Duration;
//
//public class TestErrorMessages extends Pages.BaseClass {
//    @Test
//    public void OrikanErrorsTest() {
//        try{
//        Errors errorPage = new Errors(driver);
//        Registration registerPage = new Registration(driver);
//
//        registerPage.enterEmailAddress("test.23-");
//        registerPage.enterEmailAddress("test.23-");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement invalidEmailMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Invalid email address.']")));
//            String actualMessage = invalidEmailMessage.getText();
//            String expectedMessage = "Invalid email address";
//            Assert.assertEquals(actualMessage, expectedMessage, "Invalid email Validation message did not match!");
//            System.out.println("Validation message is correct: " + actualMessage);
//
//        registerPage.txtEmailAddress.clear();
//            WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//            WebElement EmailReqMessage = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Email Address is required']")));
//            String actualMessage1 = invalidEmailMessage.getText();
//            String expectedMessage1 = "Email Address is required";
//            Assert.assertEquals(actualMessage, expectedMessage, "Email required Validation message did not match!");
//            System.out.println("Validation message is correct: " + actualMessage);
//
//    }
//        catch(Exception e) {
//        String exception = e.getMessage();
//        System.out.println("Error occured: " + exception);
//        }
//    }
//}

