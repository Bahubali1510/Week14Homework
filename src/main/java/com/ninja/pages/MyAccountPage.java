package com.ninja.pages;

import com.ninja.utility.Utility;
import org.openqa.selenium.By;

public class MyAccountPage extends Utility {
    By myAccount = By.xpath("//nav[@id='top']/div/div[2]/ul/li[2]/a");

    public void account() {
        clickOnElement(myAccount);
    }

    By accountOptionLogin = By.xpath("//nav[@id='top']/div[1]/div[2]/ul/li[2]/ul[1]/li[1]/a");

    public void accountOfOptionLogin() {
        selectByIndexFromDropDown(accountOptionLogin, 2);
    }

    By accountOptionRegistration = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li[1]/a");

    public void RegistrationAccount() {
        clickOnElement(accountOptionRegistration);

    }

    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By emailAdd = By.id("input-email");
    By telephone = By.id("input-telephone");
    By pswd = By.id("input-password");
     By Repswd = By.id("input-confirm");

     By radioBtn = By.xpath("//label[@class='radio-inline']/input");

     By privacyPolicy = By.xpath("//input[@type='checkbox']");
     By clickBtn1 = By.xpath("//input[@class='btn btn-primary']");
     By clickBtn2 = By.xpath("//div[@id='content']/div/div/a");

     public void registerAccount(){
         sendTextToElement(firstName, "Alka");
         sendTextToElement(lastName, "Jadeja");
         sendTextToElement(emailAdd, "abc@gmail.com");
         sendTextToElement(telephone, "1234567890");
         sendTextToElement(pswd, "123456");
         sendTextToElement(Repswd, "123456");

     }
     public void radioButton(){
         clickOnElement(radioBtn);
     }

     public void policy(){
         clickOnElement(privacyPolicy);
     }

     public void button1(){
         clickOnElement(clickBtn1);
     }
    public void button2(){
        clickOnElement(clickBtn2);
    }
    By accountlink = By.xpath("//div[@id='content']/h2[1]");

     public void AccountLink(){
         clickOnElement(accountlink);
     }
     By btn3 = By.xpath("//div[@id='content']/div/div/a");

     public void clickBtn3(){
         clickOnElement(btn3);
     }
}
