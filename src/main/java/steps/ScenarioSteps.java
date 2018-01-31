package steps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import javax.xml.crypto.Data;

public class ScenarioSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();
    SelectPolicySteps selectPolicySteps = new SelectPolicySteps();
    Issue2Steps issue2Steps = new Issue2Steps();

    @When("^выбран пункт меню глвной страницы \"(.*)\"$")
    public void stepSetInsurenceMenu(String name){mainPageSteps.stepSetInsurenceMenu();}

    @When("выбран вид страхования - \"(.*)\"")
    public void stepSetInsuranseTravel(String name){
        mainPageSteps.stepSetInsuranseTravel();
    }

    @Then("^заголовок страницы равен \"(.+)\"$")
    public void stepSetTitle(String name) {mainPageSteps.stepSetTitle();}

    @When("выполнено нажатие на кнопку Оформить онлайн")
    public void stepSetOnlineIssue(){
        mainPageSteps.stepSetOnlineIssue();
    }

    @When("^выбран пункт меню страницы формы страховки \"(.*)\"$")
    public void stepSetMinInsurance(String name) {selectPolicySteps.stepSetMinInsurance();}

    @Then("выполнено жмакание на кнопку Оформить")
    public void stepSetContin(){
        selectPolicySteps.stepSetContin();
    }

    @When("заполняются поля:")
    public void stepFillField(DataTable fields) {
        fields.asMap(String.class, String.class).forEach(
                (fieldName, value) -> issue2Steps.stepFillField(fieldName, value));}

    @When("выполнено тыкание на кнопку Продолжить")
    public void stepSetContin2 () { issue2Steps.stepSetContin2();}

    @Then("появился текст ошибки")
    public void steSetErrorMassage () { issue2Steps.steSetErrorMassage(); }
}

