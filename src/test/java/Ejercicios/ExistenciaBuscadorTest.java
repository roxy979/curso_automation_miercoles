package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExistenciaBuscadorTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");

        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "/drivers/chromedriver.exe");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void buscadorTest() {
        driver.get("https://opencart.abstracta.us/");

        By searchInput = By.xpath("//*[@id='search']/input");

        // Esperar hasta que el buscador sea visible
        WebElement searchElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(searchInput)
        );

        Assert.assertTrue(searchElement.isDisplayed(), "El elemento no está visible");
    }
}
