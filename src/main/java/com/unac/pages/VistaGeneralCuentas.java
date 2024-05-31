package com.unac.pages;

import com.unac.actions.Accion;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class VistaGeneralCuentas extends PageObject {
    By enlaceVistaGeneralCuentas = By.linkText("Vista general de cuentas");

    public boolean cuentaPresente(String númeroCuenta) {
        Accion.clickElement(getDriver(), enlaceVistaGeneralCuentas);
        By localizadorCuenta = By.xpath("//a[contains(text(), '" + númeroCuenta + "')]");
        return Accion.isElementPresent(getDriver(), localizadorCuenta);
    }
}
