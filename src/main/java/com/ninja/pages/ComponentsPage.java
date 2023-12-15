package com.ninja.pages;

import com.ninja.utility.Utility;
import org.openqa.selenium.By;

public class ComponentsPage extends Utility {
    By component1 = By.xpath("//div[@id='content']/h2");
    public String getComponentText(){
        return getTextFromElement(component1);
    }
}
