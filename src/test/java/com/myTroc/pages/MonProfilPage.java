package com.myTroc.pages;

import com.myTroc.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class MonProfilPage {

    public MonProfilPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[.='Mon Profil']")
    public WebElement monProfilLink;

    @FindBy(xpath = "//div[.='Mes trocs']")
    public WebElement meTrocsButton;

    @FindBy(xpath = "(//a[@class=\"waves waves-prune\"])[5]")
    public WebElement trocTitre;




}