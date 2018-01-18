import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class BaseClass {
    public WebDriver driver;

    @org.junit.Before
    public  void webdriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Java\\Selenium_Lut\\driver\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://www.sberbank.ru/ru/person");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
}
