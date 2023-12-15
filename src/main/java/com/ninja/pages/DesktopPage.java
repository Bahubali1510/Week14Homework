package com.ninja.pages;

import com.ninja.utility.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {

    By getDesktopText = By.xpath("//div[@id='content']/h2");

    public String getDesktopText() {
        return getTextFromElement(getDesktopText);

    }

    By sortPositionZtoA = By.xpath("//select[@id='input-sort']");

    public void selectFromZtoA() {
        selectByIndexFromDropDown(sortPositionZtoA, 2);

    }

    By descendingOrderText = By.xpath("//div[@id='product-category']/div/div/h3");

    public String getDescendingText() {
        return getTextFromElement(descendingOrderText);

    }

    By sortPositionAtoZ = By.xpath("//select[@id='input-sort']");

    public void selectFromAtoZ() {
        selectByIndexFromDropDown(sortPositionAtoZ, 1);

    }


    By selectProductHP = By.xpath("//div[@id='content']/div[4]/div[3]/div/div[2]/div[1]/h4/a");

    public void selectProductHP() {
        clickOnElement(selectProductHP);
    }

    By selectDate = By.xpath("//div[@id='content']/div/div[2]/div[2]/div[1]/div/input");

    public void selectTheDate() {
        sendTextToElement(selectDate , "22-10-23");
    }

    By selectQty = By.xpath("//input[@id='input-quantity']");

    public void selectTheQty() {
        sendTextToElement(selectQty , "1");
    }
    By addCart = By.xpath("//button[@id='button-cart']");
    public void addToCart(){
        clickOnElement(addCart);
    }
By shoppingCartDisplay = By.xpath("//ul[@class='list-inline']/li[4]/a");
    public void shoppingCart(){
        clickOnElement(shoppingCartDisplay);
    }

}