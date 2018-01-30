package steps;

import cucumber.api.java.en.When;

public class ScenarioSteps {

    MainPageSteps mainPageSteps;
    SelectPolicySteps selectPolicySteps;
    Issue2Steps issue2Steps;

    @When("^выбран пункт меню \"(.*)\"$")
    public void stepSetInsurenceMenu(){
        mainPageSteps.stepSetInsurenceMenu();
    }

    @When("выбран вид страхования - \"(.*)\"")
    public void stepSetInsuranseTravel(){
        mainPageSteps.stepSetInsuranseTravel();
    }

    @When("нажата кнопка")
    public void stepSetOnlineIssue(){
        mainPageSteps.stepSetOnlineIssue();
    }
}
