package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import steps.BaseClass;

public class BasePageObject {

    public BasePageObject() {
        PageFactory.initElements(BaseClass.getDriver(), this);
    }

    public void fillField(WebElement field, String value){
        field.clear();
        field.sendKeys(value);
    }

}

