import org.junit.Ignore;
import steps.BaseClass;
import pages.Issue2;
import pages.MainPage;
import pages.SelectPolicy;

public class InsuranceTest2 extends BaseClass {
    MainPage mainPage;
    SelectPolicy selectPolicy;
    Issue2 issue2;

    @org.junit.Test
    @Ignore
    public void Test() {

        mainPage = new MainPage(driver);
        mainPage.mainPageSteps();

        selectPolicy = new SelectPolicy(driver);
        selectPolicy.selectPolicySteps();

        issue2 = new Issue2(driver);
        issue2.fillField("Фамилия", "IVANOV");
        issue2.fillField("Имя", "IVAN");
        issue2.fillField("Дата рождения", "10101980");
        issue2.fillField("Фамилия страхователя", "Петров");
        issue2.fillField("Имя страхователя", "Петр");
        issue2.fillField("Отчество страхователя", "Петрович");
        issue2.fillField("Дата рождения страхователя", "01011991");
        issue2.fillField("Серия паспорта", "1359");
        issue2.fillField("Номер паспорта", "123579");
        issue2.fillField("Дата выдачи", "02102008");
        issue2.fillField("Кем выдан", "ОВД г. Тамбов");

        issue2.issue2Steps();
    }
}