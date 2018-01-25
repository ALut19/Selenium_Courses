package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public class BaseClass {
    public WebDriver driver;

    @org.junit.Before
    public void webDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Java\\Selenium_Lut\\driver\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("start-maximized");
        driver = new ChromeDriver(co);
        driver.get("http://www.sberbank.ru/ru/person");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
    }


    public void fillField(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }


}
