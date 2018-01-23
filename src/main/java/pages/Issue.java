package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseClass;

public class Issue extends BaseClass {

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
    public Issue(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void setSurnameEng(String surnameEng1){
        surnameEng.sendKeys(surnameEng1);
        Assert.assertEquals("IVANOV", surnameEng.getAttribute("value"));
    }
    public void setNameEng (String nameEng1) {
        nameEng.sendKeys(nameEng1);
        Assert.assertEquals("IVAN", nameEng.getAttribute("value"));
    }
    public void setBirthdate (String birthdate1){
        birthdate.sendKeys(birthdate1);
        Assert.assertEquals("10.10.1980", birthdate.getAttribute("value"));
    }
    public void setIssuerSurname (String issuerSurname1){
        issuerSurname.sendKeys(issuerSurname1);
        Assert.assertEquals("Петров", issuerSurname.getAttribute("value"));
    }
    public void setIssuerFirstname (String issuerFirstname1){
        issuerFirstname.sendKeys(issuerFirstname1);
        Assert.assertEquals("Петр", issuerFirstname.getAttribute("value"));
    }
    public void setIssuerMiddlename (String issuerMiddlename1){
        issuerMiddlename.sendKeys(issuerMiddlename1);
        Assert.assertEquals("Петрович", issuerMiddlename.getAttribute("value"));
    }
    public void setBirthdate2 (String birthdate21){
        birthdate2.sendKeys(birthdate21);
        Assert.assertEquals("01.01.1991", birthdate2.getAttribute("value"));
    }
    public void setSerDoc (String serDoc1){
        serDoc.sendKeys(serDoc1);
        Assert.assertEquals("1359", serDoc.getAttribute("value"));
    }
    public void setNumDoc (String numDoc1){
        numDoc.sendKeys(numDoc1);
        Assert.assertEquals("123579", numDoc.getAttribute("value"));
    }
    public void setActDocDate (String actDocDate1){
        actDocDate.sendKeys(actDocDate1);
        Assert.assertEquals("02.10.2008", actDocDate.getAttribute("value"));
    }
    public void setIssuedDoc (String issuedDoc1){
        issuedDoc.sendKeys(issuedDoc1);
        Assert.assertEquals("ОВД г. Тамбов", issuedDoc.getAttribute("value"));
    }


    // 10. Нажать продолжить
    public void setContin2(){contin2.click();}
    // 11. Проверить, что появилось сообщение - Заполнены не все обязательные поля
    public void setErrorMassage(){Assert.assertTrue(errorMassage.getText().contains("Заполнены не все обязательные поля"));}


    public void issueSteps
            (String surnameEng1, String nameEng1, String birthdate1, String issuerSurname1, String issuerFirstname1,
             String issuerMiddlename1, String birthdate21, String serDoc1, String numDoc1, String actDocDate1, String issuedDoc1){
        this.setSurnameEng(surnameEng1);
        this.setNameEng(nameEng1);
        this.setBirthdate(birthdate1);
        this.setIssuerSurname(issuerSurname1);
        this.setIssuerFirstname(issuerFirstname1);
        this.setIssuerMiddlename(issuerMiddlename1);
        this.setBirthdate2(birthdate21);
        this.setSerDoc(serDoc1);
        this.setNumDoc(numDoc1);
        this.setActDocDate(actDocDate1);
        this.setIssuedDoc(issuedDoc1);
        this.setContin2();
        this.setErrorMassage();
    }
}