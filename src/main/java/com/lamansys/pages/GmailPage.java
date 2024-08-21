package com.lamansys.pages;

import com.lamansys.utils.DriverManager;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import static com.lamansys.utils.DriverManager.getDriver;
public class GmailPage {

    //Elementos
    public static final By ICONO_PERFIL = By.xpath("//a[contains(@aria-label,'Google Account')]");

    //Metodos
    public static Boolean esVisibleIconoPerfil(){
            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            return DriverManager
                    .getDriver()
                    .findElement(
                            ICONO_PERFIL
                    ).isDisplayed();
    }
}
