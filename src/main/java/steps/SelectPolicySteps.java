package steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.SelectPolicy;
import ru.yandex.qatools.allure.annotations.Step;

public class SelectPolicySteps {

    @Step("Выбрана сумма страховой защиты Минимальная")
    public void stepSetMinInsurance (){
        new SelectPolicy().setMinInsurance();
    }

    @Step("Выполнено нажатие на кнопку оформить")
    public void stepSetContin (){
        new SelectPolicy().setContin();
    }

}
