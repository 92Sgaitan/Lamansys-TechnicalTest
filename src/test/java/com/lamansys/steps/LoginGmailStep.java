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
    public void completa_el_campo_correo_electronico_o_telefono(String emailTelefono) {
        LoginGmailPage.completaCorreoTelefono(emailTelefono);
    }
    @And("Hace clic en siguiente")
    public void haceclic_en_siguiente() {
        LoginGmailPage.clickButtonSigueinte();
    }
    @And("Completa el campo contrasenia {string}")
    public void completa_el_campo_contrasenia(String contrasenia) {
        LoginGmailPage.completaContrasenia(contrasenia);
    }
    @Then("Hace clic en siguiente contrasenia")
    public void clickButtonSiguienteContra() {
        LoginGmailPage.haceClickButtonSigueinteContra();
    }
    @When("Verificara la pagina de inicio")
    public void verificara_la_pagina_de_inicio() {
        Assert.assertTrue(LoginGmailPage.esVisibleIconoPerfil(), "Icono Perfil Visible");
    }
    @When("Visualizara un {string} de validacion de correo o telefono erroneo")
    public void visualizara_un_de_validacion_de_correo_o_telefono_erroneo(String mensaje) {
        Assert.assertEquals(LoginGmailPage.obtenerMensajeCorreoTelefono(), mensaje,"El mensaje no es el correcto");
    }
    @When("Visualizara un {string} de validacion contrasenia erronea")
    public void verificaraMensajeContrasenia(String mensaje) {
        Assert.assertEquals(LoginGmailPage.obtenerMensajeContrasenia(), mensaje, "El mensaje no es el correcto");
    }

}
