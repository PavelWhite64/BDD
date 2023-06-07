package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import data.DataHelper;

import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {
    private SelenideElement heding = $("[data-test-id=dashboard]");

    public DashboardPage(){
        heding.shouldBe(Condition.visible);
    }
}
