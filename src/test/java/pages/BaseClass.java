package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
    public WebDriver driver;

    @BeforeTest
    public void setupApplication() {
        Reporter.log("************   Browser Open *************");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://orikan-ui-automation-test.azurewebsites.net/");
        driver.manage().window().maximize();
        Reporter.log(" ");
    }

    @AfterTest
    public  void closeApplication() {
        driver.quit();
        Reporter.log("*************   Browser close *****************");
    }
}