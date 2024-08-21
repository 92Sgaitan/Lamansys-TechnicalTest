package com.lamansys.steps;

import com.lamansys.pages.GmailPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class GmailStep {
    @Then("Verificara la pagina de inicio")
    public void verificaraPaginaDeInicio() {
        Assert.assertTrue(GmailPage.esVisibleIconoPerfil(), "Icono Perfil NO Visible");
    }
}
