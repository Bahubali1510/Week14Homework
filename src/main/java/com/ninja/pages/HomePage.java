package com.ninja.pages;

import com.ninja.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By desktoplink = By.xpath("//ul[@class='nav navbar-nav']/li/a"); //desktop xpath
    By showAllDesktop = By.xpath("//a[text()='Show AllDesktops']"); // show alldesktop


    public void desktopclick() {
        clickOnElement(desktoplink);
    }

    public void showall() {
        clickOnElement(showAllDesktop);
    }


    By laptopsNotebookslink = By.xpath("//ul[@class='nav navbar-nav']/li[2]/a");

    public void laptopclick() {
        clickOnElement(laptopsNotebookslink);
    }


    By showAllLaptop = By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/div/a"); // show alldesktop

    public void showall1() {
        clickOnElement(showAllLaptop);

    }

    By components = By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[3]");

    public void componentClick() {
        clickOnElement(components);
    }


    By showAllComponents = By.xpath("//nav[@id='menu']/div[2]/ul/li[3]/div/a"); // show all components

    public void showAll2() {
        clickOnElement(showAllComponents);

    }
   // By myAccount = By.xpath("//nav[@id='top']/div/div[2]/ul/li[2]/a/span[2]");
    By myAccount = By.xpath("//div[@id='top-links']/ul/li[2]");
    By registerAccount = By.xpath("//nav[@id='top']/div/div[2]/ul/li[2]/ul/li[1]/a");

    By loginAccount = By.xpath("//nav[@id='top']/div/div[2]/ul/li[2]/ul/li[2]/a");
    public void myAccounts() {
        clickOnElement(myAccount);
    }

    public void registrationForAccount() {
        clickOnElement(registerAccount);
    }
    public void loginForAccount() {
        clickOnElement(loginAccount);
    }
}