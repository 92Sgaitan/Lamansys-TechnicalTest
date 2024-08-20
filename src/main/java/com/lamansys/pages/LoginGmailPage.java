package com.lamansys.pages;

import com.lamansys.utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static com.lamansys.utils.DriverManager.getWait;

public class LoginGmailPage {

    //Elementos
    public static final String URL = "https://www.gmail.com/";
    public static final By TXT_CORREO_TELEFONO = By.id("identifierId");
    public static final By BTN_SIGUIENTE_CORREO_TELEFONO = By.id("identifierNext");
    public static final By TXT_CONTRASENIA = By.xpath("//input[@name='Passwd']");
    public static final By BTN_CONTRASENIA_SIGUIENTE = By.id("passwordNext");
    public static final By MSJ_ERROR_CORREO_TELEFONO = By.xpath("//div[@class='Ekjuhf Jj6Lae']");
    public static final By MSJ_ERROR_CONTRASENIA = By.xpath("//div[@jsname='B34EJ']");
    public static final By ICONO_PERFIL = By.xpath("//a[contains(@aria-label,'Cuenta de Google')]");

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
        getWait().until(ExpectedConditions.invisibilityOfElementLocated(MSJ_ERROR_CORREO_TELEFONO));
        return  DriverManager
                .getDriver()
                .findElement(
                        MSJ_ERROR_CORREO_TELEFONO
                ).getText();

    }
    public static String obtenerMensajeContrasenia(){
        getWait().until(ExpectedConditions.invisibilityOfElementLocated(MSJ_ERROR_CONTRASENIA));
        return  DriverManager
                .getDriver()
                .findElement(
                        MSJ_ERROR_CONTRASENIA
                ).getText();
    }
    public static Boolean esVisibleIconoPerfil(){
        try{
            getWait().until(ExpectedConditions.invisibilityOfElementLocated(ICONO_PERFIL));
            return DriverManager
                    .getDriver()
                    .findElement(
                            ICONO_PERFIL
                    ).isDisplayed();
        }
        catch (NoSuchElementException nsee){
            System.out.println("Icono de perfil no Visible");
            return false;
        }
    }

}
