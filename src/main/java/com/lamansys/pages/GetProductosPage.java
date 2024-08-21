package com.lamansys.pages;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.testng.AssertJUnit.assertEquals;

public class GetProductosPage {

    public static int StatusCode;
    public static RequestSpecification httpRequest;
    public static Response response;
    public static int ResponseCode;

    public static void accedeUrlProducto() {
        RestAssured.baseURI = "https://fakestoreapi.com";
    }
    public static void pasarUrlRequestProducto() throws Exception {
        RestAssured.given();
        httpRequest.get("/products");
    }
    public static void statusCodeProducto() {
        response.getStatusCode();
        assertEquals(ResponseCode,"200");
    }
}
