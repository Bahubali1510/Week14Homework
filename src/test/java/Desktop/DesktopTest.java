package Desktop;

import com.ninja.pages.DesktopPage;
import com.ninja.pages.HomePage;
import com.ninja.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DesktopTest extends TestBase {
    HomePage homepage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
        homepage.desktopclick();  // click on desktop
        homepage.showall();       // show all desktop
        desktopPage.selectFromZtoA();
        // desktop.select  //verify desktop text
//        String actualText = desktop.descendingOrderText();
//        System.out.println(actualText);
//        String ExpectedText = "Refine Search";
//        Assert.assertEquals(actualText, ExpectedText);

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {
        homepage.desktopclick();  // click on desktop
        homepage.showall();       // show all desktop
        desktopPage.selectFromAtoZ();
        desktopPage.selectProductHP();
        driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div[2]/div[1]/div/input")).clear();
        desktopPage.selectTheDate();
        desktopPage.selectTheQty();
        driver.findElement(By.xpath("//input[@id='input-quantity']")).clear();
        desktopPage.selectTheQty();
        desktopPage.addToCart();


    }

}
