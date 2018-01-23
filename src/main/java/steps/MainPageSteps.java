package steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.MainPage;

import net.thucydides.core.annotations.Step;

public class MainPageSteps extends BaseClass {

    public MainPageSteps(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @Step("Выбран пункт меню {0}")
    public void stepSetInsurenceMenu (){
        new MainPage (driver).setInsurenceMenu();
    }

    @Step("Выбран пункт Cтрахование путешествинников {0}")
    public void stepSetInsuranseTravel (){
        new MainPage (driver).setInsuranseTravel();
    }

    @Step("На странице присутсвует заголовок Cтрахование путешествинников {0}")
    public void stepSetTitle (){
        new MainPage (driver).setTitle();
    }

    @Step("Нажата кнопка Оформить Онлайн {0}")
    public void stepSetOnlineIssue (){
        new MainPage (driver).setOnlineIssue();
    }
}