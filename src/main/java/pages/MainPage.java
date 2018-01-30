package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MainPage extends BasePageObject {

    @FindBy(xpath = "//a[@aria-label='Раздел Застраховать себя  и имущество']")
    WebElement insurenceMenu;
    @FindBy(xpath = "//a[@href='/ru/person/bank_inshure/insuranceprogram/life/travel']")
    WebElement insuranseTravel;
    @FindBy(xpath = "//div[@class='sbrf-rich-outer']")
    WebElement title;
    @FindBy(xpath = "//img[@src='/portalserver/content/atom/contentRepository/content/person/travel/banner-zashita-traveler.jpg?id=f6c836e1-5c5c-4367-b0d0-bbfb96be9c53']")
    WebElement onlineIssue;


    // 1. Перейти на страницу http://www.sberbank.ru/ru/person
    public MainPage() {
        PageFactory.initElements(BaseClass.getDriver(), this);

    }
    // 2. Нажать на – Застраховать себя и имущество
    public void setInsurenceMenu(){
        insurenceMenu.click();
        insurenceMenu.click();
    }
    // 3. Выбрать – Страхование путешественников
    public void setInsuranseTravel(){insuranseTravel.click();}

    // 4. Проверить наличие на странице заголовка – Страхование путешественников
    public void setTitle(){
        Assert.assertTrue(title.getText().contains("Страхование путешественников"));
    }
    // 5. Нажать на – Оформить Онлайн
    public void setOnlineIssue(){
        onlineIssue.click();
        Set<String> wh = BaseClass.getDriver().getWindowHandles();
        List<String> whl=new ArrayList<>(wh);
        BaseClass.getDriver().switchTo().window(whl.get(1));
    }



    public void mainPageSteps(){
        this.setInsurenceMenu();
        this.setInsuranseTravel();
        this.setTitle();
        this.setOnlineIssue();
    }
}