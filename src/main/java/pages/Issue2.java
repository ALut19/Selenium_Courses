package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseClass;

public class Issue2 extends BasePageObject {

    @FindBy(xpath = "//input[@ng-model='namespace.SURNAME_ENG']")
    WebElement surnameEng;
    @FindBy(xpath = "//input[@ng-model='namespace.NAME_ENG']")
    WebElement nameEng;
    @FindBy(xpath = "//input[@ng-model='namespace.BIRTHDATE']")
    WebElement birthdate;
    @FindBy(xpath = "//input[@ng-model='formdata.insurer.LASTNAME']")
    WebElement issuerSurname;
    @FindBy(xpath = "//input[@ng-model='formdata.insurer.FIRSTNAME']")
    WebElement issuerFirstname;
    @FindBy (xpath = "//input[@ng-model='formdata.insurer.MIDDLENAME']")
    WebElement issuerMiddlename;
    @FindBy (xpath = "//input[@ng-model='formdata.insurer.BIRTHDATE']")
    WebElement birthdate2;
    @FindBy (xpath = "//input[@ng-model='formdata.insurer.documentList[0].DOCSERIES']")
    WebElement serDoc;
    @FindBy (xpath = "//input[@ng-model='formdata.insurer.documentList[0].DOCNUMBER']")
    WebElement numDoc;
    @FindBy (xpath = "//input[@ng-model='formdata.insurer.documentList[0].ISSUEDATE']")
    WebElement actDocDate;
    @FindBy (xpath = "//textarea[@ng-model='formdata.insurer.documentList[0].ISSUEDBY']")
    WebElement issuedDoc;
    @FindBy (xpath = "//span[@class='b-continue-btn']")
    WebElement contin2;
    @FindBy (xpath = "//div[@ng-show='tryNext && myForm.$invalid']")
    WebElement errorMassage;


    //8. На вкладке Оформить заполнить поля:
    // 9. Проверить, что все поля заполнены правильно
    public Issue2 () {
        PageFactory.initElements(BaseClass.getDriver(), this);
        //this.driver = driver;
    }


    public void fillField(String fieldName, String value){
        switch (fieldName) {
            case "Фамилия":
                fillField(surnameEng, value);
                Assert.assertEquals("IVANOV", surnameEng.getAttribute("value"));
                break;
            case "Имя":
                fillField(nameEng, value);
                Assert.assertEquals("IVAN", nameEng.getAttribute("value"));
                break;
            case "Дата рождения":
                fillField(birthdate, value);
                Assert.assertEquals("10.10.1980", birthdate.getAttribute("value"));
                break;
            case "Фамилия страхователя":
                fillField(issuerSurname, value);
                Assert.assertEquals("Петров", issuerSurname.getAttribute("value"));
                break;
            case "Имя страхователя":
                fillField(issuerFirstname, value);
                Assert.assertEquals("Петр", issuerFirstname.getAttribute("value"));
                break;
            case "Отчество страхователя":
                fillField(issuerMiddlename, value);
                Assert.assertEquals("Петрович", issuerMiddlename.getAttribute("value"));
                break;
            case "Дата рождения страхователя":
                fillField(birthdate2, value);
                Assert.assertEquals("01.01.1991", birthdate2.getAttribute("value"));
                break;
            case "Серия паспорта":
                fillField(serDoc, value);
                Assert.assertEquals("1359", serDoc.getAttribute("value"));
                break;
            case "Номер паспорта":
            fillField(numDoc, value);
                Assert.assertEquals("123579", numDoc.getAttribute("value"));
            break;
            case "Дата выдачи":
                fillField(actDocDate, value);
                Assert.assertEquals("02.10.2008", actDocDate.getAttribute("value"));
                break;
            case "Кем выдан":
                fillField(issuedDoc, value);
                Assert.assertEquals("ОВД г. Тамбов", issuedDoc.getAttribute("value"));
                break;
        }
    }

    public String getFillField(String fieldName){
        switch (fieldName){
            case  "Фамилия":
                return surnameEng.getAttribute("value");
            case  "Имя":
                return nameEng.getAttribute("value");
            case  "Дата рождения":
                return birthdate.getAttribute("value");
            case  "Фамилия страхователя":
                return issuerSurname.getAttribute("value");
            case  "Имя страхователя":
                return issuerFirstname.getAttribute("value");
            case  "Отчество страхователя":
                return issuerMiddlename.getAttribute("value");
            case  "Дата рождения страхователя":
                return birthdate2.getAttribute("value");
            case  "Серия паспорта":
                return serDoc.getAttribute("value");
            case  "Номер паспорта":
                return numDoc.getAttribute("value");
            case  "Дата выдачи":
                return actDocDate.getAttribute("value");
            case  "Кем выдан":
                return issuedDoc.getAttribute("value");
        }
        throw new AssertionError("Поле не объявлено на странице");
    }

    // 10. Нажать продолжить
    public void setContin2(){contin2.click();}
    // 11. Проверить, что появилось сообщение - Заполнены не все обязательные поля
    public void setErrorMassage(){Assert.assertTrue(errorMassage.getText().contains("Заполнены не все обязательные поля"));}


    public void issue2Steps(){
    this.setContin2();
    this.setErrorMassage();
}
}