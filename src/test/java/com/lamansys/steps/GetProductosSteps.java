package com.lamansys.steps;

import com.lamansys.pages.GetProductosPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GetProductosSteps {

    @Given("Un usuario accede a la url de obtencion de productos")
    public void accedeUrlObtencionProductos() {
        GetProductosPage.accedeUrlProducto();
    }
    @When("paso la url de los productos en el request")
    public void urlProductosEnRequest() throws Exception {
        GetProductosPage.pasarUrlRequestProducto();
    }
    @Then("Recibira un codigo de respuesta {int}")
    public void codigoDeRespuesta(Integer int1) {
        GetProductosPage.statusCodeProducto();
    }
    @Then("Verificar que el precio del primer producto sea {string}")
    public void verificar_que_el_precio_del_primer_producto_sea(String precioPrimerProducto) {
        GetProductosPage.precioPrimerProducto(precioPrimerProducto);
    }
}
