package com.ninja.testsuite;


import com.ninja.pages.ComponentsPage;
import com.ninja.pages.DesktopPage;
import com.ninja.pages.HomePage;
import com.ninja.pages.LaptopPage;
import com.ninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homepage = new HomePage();
    DesktopPage desktop = new DesktopPage(); //create object of desktop
    LaptopPage laptop = new LaptopPage(); // create object of laptop

    ComponentsPage component = new ComponentsPage(); // create object of component

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homepage.desktopclick();  // click on desktop
        homepage.showall();       // show all desktop
        desktop.getDesktopText();  //verify desktop text
        String actualText = desktop.getDesktopText();
        System.out.println(actualText);
        String ExpectedText = "Desktops";
        Assert.assertEquals(actualText, ExpectedText);

    }

    @Test


    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        homepage.laptopclick(); // laptop click
        homepage.showall1(); // show all laptop
        laptop.getLaptopText();  //verify desktop text
        String actualText = desktop.getDesktopText();
        System.out.println(actualText);
        String ExpectedText = "Laptops & Notebooks";
        Assert.assertEquals(actualText, ExpectedText);
    }

    @Test
   public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
        homepage.componentClick(); // component click
        homepage.showAll2(); // show all component
        component.getComponentText();  //verify component text
        String actualText = component.getComponentText();
        System.out.println(actualText);
        String ExpectedText = "Components";
        Assert.assertEquals(actualText, ExpectedText);
    }

}


