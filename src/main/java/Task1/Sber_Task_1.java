package Task1;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by Andrey Lut on 16.01.2018.
 */
public class Sber_Task_1 {

    @Test
    public void main () throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/user/IdeaProjects/Selenium_Courses/driver/chromedriver_win32/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // 1. Перейти на страницу http://www.sberbank.ru/ru/person
        driver.get("http://www.sberbank.ru/ru/person");

        // 2. Нажать на – Застраховать себя и имущество
        /*после нажатия на вкладку Застраховать себя  и имущество страница обновляется по разному, например вкладка может не открыться, поэтому доблено несколько кликов по вкладке*/
        Thread.sleep(5000);
        WebElement insuranse = driver.findElement(By.xpath("//a[@aria-label='Раздел Застраховать себя  и имущество']"));
        insuranse.click();
        Thread.sleep(5000);
        insuranse.click();
        Thread.sleep(5000);
        insuranse.click();

        // 3. Выбрать – Страхование путешественников
        WebElement insuranseTravel = driver.findElement(By.xpath("//a[@href='/ru/person/bank_inshure/insuranceprogram/life/travel']"));
        insuranseTravel.click();

        // 4. Проверить наличие на странице заголовка – Страхование путешественников
        WebElement title = driver.findElement(By.xpath("//div[@class='sbrf-rich-outer']"));
        Assert.assertTrue(title.getText().contains("Страхование путешественников"));

        // 5. Нажать на – Оформить Онлайн
         WebElement onlineIssue = driver.findElement(By.xpath("//img[@src='/portalserver/content/atom/contentRepository/content/person/travel/banner-zashita-traveler.jpg?id=f6c836e1-5c5c-4367-b0d0-bbfb96be9c53']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", onlineIssue);
        onlineIssue.click();

        // Переход на новую вкладку
        Set<String> wh = driver.getWindowHandles();
        List<String> whl=new ArrayList<>(wh);
        driver.switchTo().window(whl.get(1));

        // 6. На вкладке – Выбор полиса  выбрать сумму страховой защиты – Минимальная
        WebElement minInsurance = driver.findElement(By.xpath("//div[text()='Минимальная']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", minInsurance);
        minInsurance.click();

        // 7. Нажать Оформить
        WebElement contin = driver.findElement(By.xpath("//span[@class='b-continue-btn']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", contin);
        contin.click();

        //8. На вкладке Оформить заполнить поля:
        // 9. Проверить, что все поля заполнены правильно

        // - Фамилию и Имя, Дату рождения застрахованных
        WebElement surnameEng = driver.findElement(By.xpath("//input[@ng-model='namespace.SURNAME_ENG']"));
        surnameEng.sendKeys("IVANOV");
        Assert.assertEquals("IVANOV", surnameEng.getAttribute("value"));
        WebElement nameEng = driver.findElement(By.xpath("//input[@ng-model='namespace.NAME_ENG']"));
        nameEng.sendKeys("IVAN");
        Assert.assertEquals("IVAN", nameEng.getAttribute("value"));
        WebElement birthdate = driver.findElement(By.xpath("//input[@ng-model='namespace.BIRTHDATE']"));
        birthdate.sendKeys("10101980");
        Assert.assertEquals("10.10.1980", birthdate.getAttribute("value"));

        // - Данные страхователя: Фамилия, Имя, Отчество, Дата рождения, Пол
        WebElement issuerSurname = driver.findElement(By.xpath("//input[@ng-model='formdata.insurer.LASTNAME']"));
        issuerSurname.sendKeys("Петров");
        Assert.assertEquals("Петров", issuerSurname.getAttribute("value"));
        WebElement issuerFirstname = driver.findElement(By.xpath("//input[@ng-model='formdata.insurer.FIRSTNAME']"));
        issuerFirstname.sendKeys("Петр");
        Assert.assertEquals("Петр", issuerFirstname.getAttribute("value"));
        WebElement issuerMiddlename = driver.findElement(By.xpath("//input[@ng-model='formdata.insurer.MIDDLENAME']"));
        issuerMiddlename.sendKeys("Петрович");
        Assert.assertEquals("Петрович", issuerMiddlename.getAttribute("value"));
        WebElement birthdate2 = driver.findElement(By.xpath("//input[@ng-model='formdata.insurer.BIRTHDATE']"));
        birthdate2.sendKeys("01011991");
        Assert.assertEquals("01.01.1991", birthdate2.getAttribute("value"));

        // - Паспортные данные
        WebElement serDoc = driver.findElement(By.xpath("//input[@ng-model='formdata.insurer.documentList[0].DOCSERIES']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", serDoc);
        serDoc.sendKeys("1359");
        Assert.assertEquals("1359", serDoc.getAttribute("value"));
        WebElement numDoc = driver.findElement(By.xpath("//input[@ng-model='formdata.insurer.documentList[0].DOCNUMBER']"));
        numDoc.sendKeys("123579");
        Assert.assertEquals("123579", numDoc.getAttribute("value"));
        WebElement actDocDate = driver.findElement(By.xpath("//input[@ng-model='formdata.insurer.documentList[0].ISSUEDATE']"));
        actDocDate.sendKeys("02102008");
        Assert.assertEquals("02.10.2008", actDocDate.getAttribute("value"));
        WebElement issuedDoc = driver.findElement(By.xpath("//textarea[@ng-model='formdata.insurer.documentList[0].ISSUEDBY']"));
        issuedDoc.sendKeys("ОВД г. Тамбов");
        Assert.assertEquals("ОВД г. Тамбов", issuedDoc.getAttribute("value"));

        // 10. Нажать продолжить
        WebElement contin2 = driver.findElement(By.xpath("//span[@class='b-continue-btn']"));
        contin2.click();

        // 11. Проверить, что появилось сообщение - Заполнены не все обязательные поля
        WebElement error = driver.findElement(By.xpath("//div[@ng-show='tryNext && myForm.$invalid']"));
        Assert.assertTrue(error.getText().contains("Заполнены не все обязательные поля"));


    }
}
