import org.junit.Test;

public class InsuranceTest extends BaseClass {
    MainPage MainPage;

    @Test
    public void Test(){

        MainPage = new MainPage(driver);
        MainPage.mainPageActions();
    }
}
