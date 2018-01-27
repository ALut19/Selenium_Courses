package steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.SelectPolicy;
import ru.yandex.qatools.allure.annotations.Step;

public class SelectPolicySteps extends BaseClass {

    public SelectPolicySteps (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @Step("Выбрана сумма страховой защиты Минимальная")
    public void stepSetMinInsurance (){
        new SelectPolicy(driver).setMinInsurance();
    }

    @Step("Выполнено нажатие на кнопку оформить")
    public void stepSetContin (){
        new SelectPolicy(driver).setContin();
    }

}
