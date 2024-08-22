package com.lamansys.pages;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import static org.testng.AssertJUnit.assertEquals;

public class GetProductosPage {

    public static int StatusCode;
    public static RequestSpecification httpRequest;
    public static Response response;
    public static int ResponseCode;
    public static ResponseBody body;

    public static void accedeUrlProducto() {
        RestAssured.baseURI = "https://fakestoreapi.com";
    }
    public static void pasarUrlRequestProducto() throws Exception {
        httpRequest = RestAssured.given();
         response = httpRequest.get("/products");
    }
    public static void statusCodeProducto() {
        ResponseCode = response.getStatusCode();
        assertEquals(ResponseCode,200);
    }
    public static void precioPrimerProducto(String precioPrimerProducto) {
        body = response.getBody();
        String responsebody = body.asString();
        JsonPath jsnpath = response.jsonPath();
        String ObtencionPrecio = jsnpath.getJsonObject("price[0]").toString();
        assertEquals(precioPrimerProducto,ObtencionPrecio);
    }
}
