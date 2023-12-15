package laptopsandnotebooks;

import com.ninja.pages.HomePage;
import com.ninja.pages.LaptopPage;
import com.ninja.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LaptopsAndNotebooksTest extends TestBase {
    HomePage homepage = new HomePage();
    LaptopPage L1 = new LaptopPage();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {
        L1.laptopclick();
        L1.showall1();
        L1.fromHighToLow();
    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() throws Exception{
        L1.laptopclick();
        L1.showall1();
        L1.fromHighToLow();
        L1.getMacBookText();
        L1.addToThecart();
        L1.AddToShoppingCart();
        L1.changeTheQty();
        driver.findElement(By.xpath("//div[@id='content']/form/div/table/tbody/tr/td[4]/div/input")).clear();
        L1.changeTheQty();
        L1.updateCart();
        L1.checkoutBtn();
        L1.guestRadio();
        L1.continueButton();
        L1.personalDetails();
        L1.continueBtn1();
        L1.addComments();
        L1.setTermsAndConditions();
        L1.clickContinueLast();




    }
}
