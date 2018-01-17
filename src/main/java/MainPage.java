import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseClass {

    @FindBy(xpath = "//a[@aria-label='Раздел Застраховать себя  и имущество']")
    WebElement insurance;


    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void setInsurance() {
        try {
            insurance.click();
            System.out.println("ok");
            Thread.sleep(5000);
            System.out.println("ok");
        } catch (InterruptedException c) {
            c.printStackTrace();
        }
    }

    public void setInsurance1() {
        try {
            insurance.click();
            System.out.println("ok1");
            Thread.sleep(5000);
            System.out.println("ok1");
        } catch (InterruptedException c) {
            c.printStackTrace();
        }
    }

    public void setInsurance2() {
        try {
            insurance.click();
            Thread.sleep(5000);
        } catch (InterruptedException c) {
            c.printStackTrace();
        }
    }

    public void mainPageActions() {
        this.setInsurance();
        this.setInsurance1();
        this.setInsurance2();
    }
}
