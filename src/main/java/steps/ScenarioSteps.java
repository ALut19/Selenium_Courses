package steps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();
    SelectPolicySteps selectPolicySteps = new SelectPolicySteps();
    Issue2Steps issue2Steps = new Issue2Steps();

    @When("^выбран пункт меню \"(.*)\"$")
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

}
