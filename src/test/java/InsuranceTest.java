public class InsuranceTest extends BaseClass{
    MainPage mainPage;
    SelectPolicy selectPolicy;
    Issue issue;

    @org.junit.Test
    public void Test() {

        mainPage = new MainPage(driver);
        mainPage.mainPageSteps();

        selectPolicy = new SelectPolicy(driver);
        selectPolicy.selectPolicySteps();

        issue = new Issue(driver);
        issue.issueSteps("IVANOV", "IVAN", "10101980", "Петров", "Петр", "Петрович",
                "01011991", "1359", "123579", "02102008", "ОВД г. Тамбов");
    }
}