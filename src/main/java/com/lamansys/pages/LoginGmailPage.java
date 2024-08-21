package com.lamansys.pages;

import com.lamansys.utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.concurrent.TimeUnit;
import static com.lamansys.utils.DriverManager.getDriver;
import static com.lamansys.utils.DriverManager.getWait;

public class LoginGmailPage {

    //Elementos
    public static final String URL = "https://www.gmail.com/";
    public static final By TXT_CORREO_TELEFONO = By.id("identifierId");
    public static final By BTN_SIGUIENTE_CORREO_TELEFONO = By.id("identifierNext");
    public static final By TXT_CONTRASENIA = By.xpath("//input[@name='Passwd']");
    public static final By BTN_CONTRASENIA_SIGUIENTE = By.id("passwordNext");
    public static final By MSJ_ERROR_CORREO_TELEFONO = By.xpath("//span[@class='AfGCob']/parent::div[contains(normalize-space(),'')]");
    public static final By MSJ_ERROR_CONTRASENIA = By.xpath("//span[contains(normalize-space(),'')]/parent::div[@jsname='B34EJ']");

    //Metodos
    public static void navegaGmail(){
        DriverManager.ir(URL);
    }

    public static void completaCorreoTelefono(String emailTelefono){
        DriverManager
                .getDriver()
                .findElement(
                        TXT_CORREO_TELEFONO
                ).sendKeys(emailTelefono);
    }
    public static void clickButtonSigueinte(){
        getWait().until(ExpectedConditions.elementToBeClickable(BTN_SIGUIENTE_CORREO_TELEFONO));
        DriverManager
                .getDriver()
                .findElement(
                        BTN_SIGUIENTE_CORREO_TELEFONO
                ).click();
    }
    public static void completaContrasenia(String contrasenia){

        getWait().until(ExpectedConditions.elementToBeClickable(TXT_CONTRASENIA));
        DriverManager
                .getDriver()
                .findElement(
                        TXT_CONTRASENIA
                ).sendKeys(contrasenia);
    }
    public static void haceClickButtonSigueinteContra(){
        getWait().until(ExpectedConditions.elementToBeClickable(BTN_CONTRASENIA_SIGUIENTE));
        DriverManager
                .getDriver()
                .findElement(
                        BTN_CONTRASENIA_SIGUIENTE
                ).click();
    }
    public static String obtenerMensajeCorreoTelefono(){
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return  DriverManager
                .getDriver()
                .findElement(
                        MSJ_ERROR_CORREO_TELEFONO
                ).getText();
    }
    public static String obtenerMensajeContrasenia(){
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return  DriverManager
                .getDriver()
                .findElement(
                        MSJ_ERROR_CONTRASENIA
                ).getText();
    }
}
