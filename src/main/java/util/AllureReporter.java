package util;

import gherkin.formatter.model.Result;
import org.junit.runner.notification.Failure;

public class AllureReporter extends ru.yandex.qatools.allure.cucumberjvm.AllureReporter {
    @Override
    public void result (Result result) {
    //    super.testFailure(failure);
    }
}