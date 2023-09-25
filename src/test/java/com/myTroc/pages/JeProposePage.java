package com.myTroc.pages;

import com.myTroc.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JeProposePage {

    public JeProposePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='https://mytroc.fr/ajouter-un-troc']")
    public WebElement jeProposeLink;

    @FindBy(xpath = "//label[@for='type-bien']")
    public WebElement bienCheckBox;

    @FindBy(css = "input#title")
    public WebElement titreInputBox;

    @FindBy(css = "textarea#content")
    public WebElement descriptionInputBox;

    @FindBy(xpath = "//div[normalize-space(text())='Ajouter']")
    public WebElement ajouterButton;


    @FindBy(xpath = "(//select[@id='CategoryLvl1'])[1]")
    public WebElement categorieDropdown;

    @FindBy(css = "input#price")
    public WebElement nosietteInputBox;


}