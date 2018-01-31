package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseClass;

public class SelectPolicy extends BasePageObject {
    @FindBy(xpath = "//div[text()='Минимальная']")
    WebElement minInsurance;
    @FindBy(xpath = "//span[@class='b-continue-btn']")
    WebElement contin;

    public SelectPolicy() {
        PageFactory.initElements(BaseClass.getDriver(), this);
    }

    // 6. На вкладке – Выбор полиса  выбрать сумму страховой защиты – Минимальная
    public void setMinInsurance(){
        try {
            Thread.sleep(8000);
            ((JavascriptExecutor) BaseClass.getDriver()).executeScript("arguments[0].scrollIntoView();", minInsurance);
            minInsurance.click();
        }catch (InterruptedException c){
            c.printStackTrace();
        }
    }
    // 7. Нажать Оформить
    public void setContin (){
        ((JavascriptExecutor)BaseClass.getDriver()).executeScript("arguments[0].scrollIntoView();", contin);
        contin.click();}

        public void selectPolicySteps(){
        this.setMinInsurance();
        this.setContin();
        }
}
