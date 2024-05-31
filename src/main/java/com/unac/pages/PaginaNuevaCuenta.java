package com.unac.pages;

import com.unac.actions.Accion;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaNuevaCuenta extends PageObject {
    By enlaceNuevaCuenta = By.linkText("Abrir nueva cuenta");
    By tipoCuentaDropdown = By.id("tipo");
    By botonAbrirNuevaCuenta = By.cssSelector(".botón[valor='Abrir nueva cuenta']");
    By nuevoNumeroCuenta = By.id("nuevoIdCuenta");

    public void abrirNuevaCuenta() {
        Accion.clickElement(getDriver(), enlaceNuevaCuenta);
        Accion.selectFromDropdown(getDriver(), tipoCuentaDropdown, "AHORRO");
        Accion.clickElement(getDriver(), botonAbrirNuevaCuenta);
    }

    public String obtenerNuevoNumeroCuenta() {
        return Accion.getElementText(getDriver(), nuevoNumeroCuenta);
    }
}
