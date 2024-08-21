package com.lamansys.steps;

import com.lamansys.pages.EbayPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.lamansys.pages.EbayPage.productoPrecio;

public class EbayStep {
    @Given("Un usuario navega por la web de eBay")
    public void un_usuario_navega_por_la_web_de_e_bay() {
        EbayPage.navegaEbay();}
    @And("Completa el campo Buscar Articulos {string}")
    public void completaCampoBuscarArticulos(String producto) {
       EbayPage.completaBusqueda(producto);
    }
    @And("Hace clic en Buscar")
    public void clicBotonBuscar() {
        EbayPage.clickButtonBuscar();
    }
    @When("Hace clic en primer articulo")
    public void clicEnPrimerArticulo() {
        EbayPage.obtenerPrecio();
        EbayPage.clickPrimerResultado();
    }
    @Then("Visualizara el resultado del producto buscado")
    public void visualizaraElResultadoProductoBuscado() {
        System.out.println("Precio producto seleccionado:"+" "+productoPrecio);
    }
}
