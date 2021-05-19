package fr.adincuff.acceptance;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookingSteps {
    @When("je tente de réserver le VTC {string} de {string} à {string}")
    public void jeTenteDeRéserverLeVTCDeÀ(String arg0, String arg1, String arg2) {
        
    }

    @Then("la réservation est effective")
    public void laRéservationEstEffective() {
        
    }

    @Then("la réservation n'est pas effective")
    public void laRéservationNEstPasEffective() {
        
    }

    @And("et une alerte pour insuffisance de solde se lève")
    public void etUneAlertePourInsuffisanceDeSoldeSeLève() {
        
    }

    @And("et une alerte pour identification du client impossible se lève")
    public void etUneAlertePourIdentificationDuClientImpossibleSeLève() {
    }
}
