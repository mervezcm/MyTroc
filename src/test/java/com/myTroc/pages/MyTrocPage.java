package com.myTroc.pages;

import com.myTroc.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyTrocPage {

public MyTrocPage() {

    PageFactory.initElements(Driver.getDriver(), this);
}

    @FindBy(xpath = "//div[@id='loginbutton']")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(css = "input#password")
    public WebElement passe;

    @FindBy(xpath = "//div[@class='button valid-button']")
    public WebElement boutonConnexion;






}
