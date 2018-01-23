import net.thucydides.core.annotations.Title;
import org.junit.Test;
import pages.MainPage;
import steps.BaseClass;
import steps.MainPageSteps;

public class InsuranseAllureTest extends BaseClass {
    @Test
    @Title("Страхование путешествинников")
    public void testInsurance(){
MainPageSteps mainPageSteps;

    //    MainPageSteps mainPageSteps = new MainPageSteps();
        mainPageSteps = new MainPageSteps(driver);

        mainPageSteps.stepSetInsurenceMenu();
        mainPageSteps.stepSetInsuranseTravel();
        mainPageSteps.stepSetTitle();
        mainPageSteps.stepSetOnlineIssue();


    }
}
