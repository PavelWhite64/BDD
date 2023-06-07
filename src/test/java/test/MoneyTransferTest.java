package test;

import data.DataHelper;
import org.junit.jupiter.api.Test;
import page.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class MoneyTransferTest {
    @Test
    void shouldTransferMoneyBetweenOwnCards(){
        var loginPage = open("http://localhost:9999", LoginPage.class);
        var authInfo = DataHelper.getAuthInfo();
        var verificationPage = loginPage.validLogin(authInfo);
        var verificationCode = DataHelper.getValidCode(authInfo);
        verificationPage.validVerify(verificationCode);
    }
}
