import net.thucydides.core.annotations.Title;
import org.junit.Test;
import steps.BaseClass;
import steps.Issue2Steps;
import steps.MainPageSteps;
import steps.SelectPolicySteps;
import steps.Issue2Steps;

import java.util.HashMap;

public class InsuranseAllureTest extends BaseClass {
    @Test
    @Title("Страхование путешествинников")
    public void testInsurance(){
MainPageSteps mainPageSteps;
SelectPolicySteps selectPolicySteps;
Issue2Steps issue2Steps;

    //    MainPageSteps mainPageSteps = new MainPageSteps();
        mainPageSteps = new MainPageSteps(driver);
        selectPolicySteps = new SelectPolicySteps(driver);
        issue2Steps = new Issue2Steps(driver);

        mainPageSteps.stepSetInsurenceMenu();
        mainPageSteps.stepSetInsuranseTravel();
        mainPageSteps.stepSetTitle();
        mainPageSteps.stepSetOnlineIssue();

        selectPolicySteps.stepSetMinInsurance();
        selectPolicySteps.stepSetContin();

        HashMap<String, String> testData = new HashMap<>();
        testData.put("Фамилия", "IVANOV");
        testData.put("Имя", "IVAN");
        testData.put("Дата рождения", "10101980");
        testData.put("Фамилия страхователя", "Петров");
        testData.put("Имя страхователя", "Петр");
        testData.put("Отчество страхователя", "Петрович");
        testData.put("Дата рождения страхователя", "01011991");
        testData.put("Серия паспорта", "1359");
        testData.put("Номер паспорта", "123579");
        testData.put("Дата выдачи", "02102008");
        testData.put("Кем выдан", "ОВД г. Тамбов");

        issue2Steps.stepFillFields(testData);
        issue2Steps.stepSetContin2();
        issue2Steps.steSetErrorMassage();


    }
}
