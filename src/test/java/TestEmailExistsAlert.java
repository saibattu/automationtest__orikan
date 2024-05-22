import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pages.*;
import java.time.Duration;

import java.time.Duration;

public class TestEmailExistsAlert extends Pages.BaseClass {
    @Test
    public void OrikanEmailTest() throws InterruptedException {

        Registration registerPage = new Registration(driver);
        registerPage.enterEmailAddress("adam@orikan.com");
        registerPage.enterPassword("Testing@123");
        registerPage.enterConfirmPassword("Testing@123");
        registerPage.clickRegisterNext();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement alertElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("toast-message")));

        String alertMessage = alertElement.getText();
        System.out.println("Alert Message: " + alertMessage);

        if(alertMessage.contains("Email address is already registered")) {
            System.out.println("Alert is handled is successfully");
        }

    }
}