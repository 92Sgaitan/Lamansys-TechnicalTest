package com.lamansys.steps;

import com.lamansys.pages.GetProductosPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GetProductosSteps {

    @Given("Un usuario accede a la url de obtencion de productos")
    public void un_usuario_accede_a_la_url_de_obtencion_de_productos() {
        GetProductosPage.accedeUrlProducto();
    }
    @When("paso la url de los productos en el request")
    public void paso_la_url_de_los_productos_en_el_request() throws Exception {
        GetProductosPage.pasarUrlRequestProducto();
    }
    @Then("Recibira un codigo de respuesta {int}")
    public void recibira_un_codigo_de_respuesta(Integer int1) {
        GetProductosPage.statusCodeProducto();
    }
}
