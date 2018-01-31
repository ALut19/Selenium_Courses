package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;



public class MainPageSteps {


    @Step("Выбран пункт меню Застраховать себя и имущество")
    public void stepSetInsurenceMenu (){
        new MainPage ().setInsurenceMenu();
    }

    @Step("Выбран пункт Cтрахование путешествинников")
    public void stepSetInsuranseTravel (){
        new MainPage ().setInsuranseTravel();
    }

    @Step("На странице присутсвует заголовок Cтрахование путешествинников")
    public void stepSetTitle (){
        new MainPage ().setTitle();
    }

    @Step("Нажата кнопка Оформить Онлайн")
    public void stepSetOnlineIssue (){
        new MainPage ().setOnlineIssue();
    }
}