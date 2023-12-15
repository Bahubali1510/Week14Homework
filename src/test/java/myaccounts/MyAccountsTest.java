package myaccounts;

import com.ninja.pages.HomePage;
import com.ninja.pages.MyAccountPage;
import com.ninja.utility.Utility;
import org.testng.annotations.Test;

public class MyAccountsTest extends Utility {
    HomePage homepage = new HomePage();
    MyAccountPage AC = new MyAccountPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        homepage.myAccounts();
        homepage.registrationForAccount();
//        AC.account();
//        AC.accountOfOptionLogin();
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {
        AC.account();
        AC.RegistrationAccount();
        AC.registerAccount();
        AC.radioButton();
        AC.policy();
        AC.button1();
        AC.button2();
        AC.AccountLink();
        AC.clickBtn3();

    }

}
