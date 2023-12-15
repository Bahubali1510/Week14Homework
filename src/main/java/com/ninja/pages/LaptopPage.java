package com.ninja.pages;

import com.ninja.utility.Utility;
import org.openqa.selenium.By;

public class LaptopPage extends Utility {

    By LaptopNotebook = By.xpath("//div[@id='content']/h2");

    public String getLaptopText() {
        return getTextFromElement(LaptopNotebook);
    }

    By laptopsNotebookslink = By.xpath("//ul[@class='nav navbar-nav']/li[2]/a");

    public void laptopclick() {
        clickOnElement(laptopsNotebookslink);
    }


    By showAllLaptop = By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/div/a"); // show alldesktop

    public void showall1() {
        clickOnElement(showAllLaptop);

    }

    By highToLow = By.xpath("//div[@class='form-group input-group input-group-sm']/select");

    public void fromHighToLow() {
        selectByIndexFromDropDown(highToLow, 5);
    }

    By macBook = By.xpath("//div[@id='content']/div[4]/div[2]/div/div[2]/div[1]/h4/a");

    public void getMacBookText() {
        clickOnElement(macBook);
    }

    By addToCart = By.xpath("//button[@id='button-cart']");

    public void addToThecart() {
        clickOnElement(addToCart);
    }

    By shoppingCart = By.xpath("//ul[@class='list-inline']/li[4]/a");

    public void AddToShoppingCart() {
        clickOnElement(shoppingCart);
    }

    By changeQty = By.xpath("//div[@id='content']/form/div/table/tbody/tr/td[4]/div/input");

    public void changeTheQty() {
        sendTextToElement(changeQty, "2");
    }

    By update = By.xpath("//i[@class='fa fa-refresh']");

    public void updateCart() {
        clickOnElement(update);
    }
    By checkout = By.xpath("//div[@id='top-links']/ul/li[5]/a/span");

    public void checkoutBtn() {
        clickOnElement(checkout);
    }
    By guest = By.xpath("//div[@id='collapse-checkout-option']/div/div/div[1]/div[2]/label");

    public void guestRadio(){
        clickOnElement(guest);
    }
    By continuebtn = By.xpath("//input[@id='button-account']");

    public void continueButton(){
        clickOnElement(continuebtn);
    }

    By firstName = By.xpath("//input[@id='input-payment-firstname']");
    By lastName= By.id("input-payment-lastname");
    By emailAdd = By.id("input-payment-email");
    By telephone = By.id("input-payment-telephone");
    By company = By.id("input-payment-company");
    By address = By.id("input-payment-address-1");
    By city = By.id("input-payment-city");
    By postcode = By.id("input-payment-postcode");
   By countryName = By.id("input-payment-country");
   By zoneName = By.id("input-payment-zone");

    public void personalDetails() {
        sendTextToElement(firstName, "AlkaJ");
        sendTextToElement(lastName, "Jadejaa");
        sendTextToElement(emailAdd, "ab@gmail.com");
        sendTextToElement(telephone, "1234567890");
        sendTextToElement(company, "test");
        sendTextToElement(address, "xyz");
        sendTextToElement(city, "london");
        sendTextToElement(postcode, "123456");
        selectByIndexFromDropDown(countryName, 15);
        selectByIndexFromDropDown(zoneName, 7);

    }
    By continue1 = By.id("button-guest");
    public void continueBtn1(){
        clickOnElement(continue1);

    }

   // By comments=By.xpath("//div[@id='content']/div[1]/div[3]/div[2]/div[1]/p[2]/textarea");
    By comments=By.xpath("//div[@id='collapse-shipping-method']/div/p[4]/textarea");

    public void addComments() {
        sendTextToElement(comments, "Hello");
    }

    By termsAndConditions=By.xpath("//div[@id='content']/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/input[1]");
    public void setTermsAndConditions(){
        clickOnElement(termsAndConditions);}

    By continueLast=By.xpath("//div[@id='content']/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/input[2]");
    public void clickContinueLast(){
        clickOnElement(continueLast);
    }



}