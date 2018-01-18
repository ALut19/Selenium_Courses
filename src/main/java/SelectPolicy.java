import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPolicy extends BaseClass {
    @FindBy(xpath = "//div[text()='Минимальная']")
    WebElement minInsurance;
    @FindBy(xpath = "//span[@class='b-continue-btn']")
    WebElement contin;

    public SelectPolicy(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // 6. На вкладке – Выбор полиса  выбрать сумму страховой защиты – Минимальная
    public void setMinInsurance(){
        try {
            Thread.sleep(8000);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", minInsurance);
            minInsurance.click();
        }catch (InterruptedException c){
            c.printStackTrace();
        }
    }
    // 7. Нажать Оформить
    public void setContin(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", contin);
        contin.click();}

        public void selectPolicySteps(){
        this.setMinInsurance();
        this.setContin();
        }
}
