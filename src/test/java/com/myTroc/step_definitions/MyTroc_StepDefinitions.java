package com.myTroc.step_definitions;

import com.myTroc.pages.MyTrocPage;
import com.myTroc.utilities.ConfigurationReader;
import com.myTroc.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyTroc_StepDefinitions {

    MyTrocPage mytroc = new MyTrocPage();
    private WebDriver driver;
    @Given("Utilisation visite la page d'accueil de MyTroc.fr")
    public void utilisation_visite_la_page_d_accueil_de_my_troc_fr() {
        //Driver.getDriver().get(ConfigurationReader.getProperty("website"));
       // Driver.getDriver().get("https://mytroc.fr/");
        driver = new ChromeDriver();
        driver.get("https://www.mytroc.fr/");

    }
    @And("Utilisateur clique sur le lien {string}")
    public void utilisateur_clique_sur_le_lien(String string) {
       mytroc.loginButton.click();
    }
    @And("Utilisateur se connecte et accède à son compte")
    public void utilisateur_se_connecte_et_accède_à_son_compte() {
mytroc.email.sendKeys(ConfigurationReader.getProperty("email"));
mytroc.passe.sendKeys(ConfigurationReader.getProperty("passe"));
mytroc.boutonConnexion.click();
mytroc.boutonConnexion.click();
    }
    @And("Utilisateur remplit les informations du produit :")
    public void utilisateur_remplit_les_informations_du_produit(io.cucumber.datatable.DataTable dataTable) {

    }
    @And("Utilisateur clique sur le bouton {string}")
    public void utilisateur_clique_sur_le_bouton(String string) {

    }
    @When("Utilisateur vérifie que le produit a été ajouté avec succès")
    public void utilisateur_vérifie_que_le_produit_a_été_ajouté_avec_succès() {

    }

}
