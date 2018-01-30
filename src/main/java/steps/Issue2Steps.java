package steps;
import pages.BasePageObject;
import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;
import pages.Issue2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

public class Issue2Steps {


    @Step("поле {0} заполняется значением {1}")
    public void stepFillField(String field, String value){
        new Issue2().fillField(field, value);
    }

    @Step("поля заполнены")
    public void stepFillFields(HashMap<String, String> fields){
        fields.forEach(this::stepFillField);
    }

    @Step("выполнено нажатие на кнопку продолжить")
    public void stepSetContin2 (){
        new Issue2().setContin2();
    }

    @Step("появилось сообщение - Заполнены не все обязательные поля")
    public void steSetErrorMassage (){
        new Issue2().setErrorMassage();
    }
}

