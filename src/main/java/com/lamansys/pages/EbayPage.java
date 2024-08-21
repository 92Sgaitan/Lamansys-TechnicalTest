package com.lamansys.pages;

import com.lamansys.utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.concurrent.TimeUnit;
import static com.lamansys.utils.DriverManager.getDriver;
import static com.lamansys.utils.DriverManager.getWait;
public class EbayPage {
    public static String productoPrecio = "";

    //Elementos
    public static final String URL = "https://www.ebay.com/";
    public static final By TXT_BUSCAR = By.id("gh-ac");
    public static final By BTN_BUSCAR =By.id("gh-btn");
    public static final By PRIMER_RESULTADO = By.xpath("//div[@id='srp-river-results']/ul/li[2]//a[@class='s-item__link']");
    public static final By PRECIO = By.xpath("//div[@id='srp-river-results']/ul/li[2]//div[@class='s-item__details clearfix']//div[1]/div[1]//span[contains(normalize-space(),'')]");

    //Metodos
    public static void navegaEbay(){
        DriverManager.ir(URL);
    }

    public static void completaBusqueda(String producto){
        DriverManager
                .getDriver()
                .findElement(
                        TXT_BUSCAR
                ).sendKeys(producto);
    }
    public static void clickButtonBuscar(){
        getWait().until(ExpectedConditions.elementToBeClickable(BTN_BUSCAR));
        DriverManager
                .getDriver()
                .findElement(
                        BTN_BUSCAR
                ).click();
    }
    public static void obtenerPrecio() {
        productoPrecio = DriverManager
                .getDriver()
                .findElement(
                        PRECIO
                ).getText();
    }
    public static void clickPrimerResultado(){
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        DriverManager
                .getDriver()
                .findElement(
                        PRIMER_RESULTADO
                ).click();
    }
}
