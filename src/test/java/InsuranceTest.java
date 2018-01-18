public class InsuranceTest extends BaseClass{

    MainPage mainPage;

    @org.junit.Test
    public void Test() {

        mainPage = new MainPage(driver);
        mainPage.mainPageActions();
    }
}