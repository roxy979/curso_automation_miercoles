package Ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class BusquedasTest {
    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maxized");
        options.addArguments("incognito");

        options.setPageLoadTimeout(Duration.ofSeconds(60));
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/drivers/chromedriver.exe");

        this.driver = new ChromeDriver(options);
    }
    @AfterMethod
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }

    @Test
    public void busquedaProductoTest(){
        driver.get("https://opencart.abstracta.us/");
        By searchInputEl=By.xpath("//*[@id=\"search\"]/input");

        By searchButton=By.xpath("//*[@id=\"search\"]/span/button");

        WebElement searchElement = driver.findElement(searchInputEl);
        WebElement searchBtnEl = driver.findElement(searchButton);

        searchElement.sendKeys("iphone");

        searchBtnEl.click();

        By titleSearch = By.xpath("//*[@id=\"content\"]/h1");
        WebElement titleSearchEl = driver.findElement(titleSearch);

        Assert.assertEquals("Search - iphone", titleSearchEl.getText(),"Los titulos no conciden");






    }
}
