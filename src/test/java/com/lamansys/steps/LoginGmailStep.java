package com.lamansys.steps;

import com.lamansys.pages.LoginGmailPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginGmailStep {
    @Given("Un usuario navega por la web de Gmail")
    public void navegaPorWebGmail() {
        LoginGmailPage.navegaGmail();
    }
    @And("Completa el campo correo electronico o telefono {string}")
    public void completaCorreoElectronicoTelefono(String emailTelefono) {
        LoginGmailPage.completaCorreoTelefono(emailTelefono);
    }
    @And("Hace clic en siguiente")
    public void haceClicButtonSiguiente() {
        LoginGmailPage.clickButtonSigueinte();
    }
    @And("Completa el campo contrasenia {string}")
    public void completaContrasenia(String contrasenia) {
        LoginGmailPage.completaContrasenia(contrasenia);
    }
    @When("Hace clic en siguiente contrasenia")
    public void clicButtonSiguienteContra() {
        LoginGmailPage.haceClickButtonSigueinteContra();
    }
    @Then("Visualizara un {string} de validacion de correo o telefono erroneo")
    public void verificaraMensajeErrorCorreoTelefono(String mensaje) {
        Assert.assertEquals(LoginGmailPage.obtenerMensajeCorreoTelefono(), mensaje,"El mensaje no es el correcto");
    }
    @Then("Visualizara un {string} de validacion contrasenia erronea")
    public void verificaraMensajeErrorContrasenia(String mensaje) {
        Assert.assertTrue(LoginGmailPage.obtenerMensajeContrasenia().contains(mensaje), mensaje);
    }
}
