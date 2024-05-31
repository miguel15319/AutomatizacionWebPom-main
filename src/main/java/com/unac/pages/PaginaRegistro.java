package com.unac.pages;

import com.unac.actions.Accion;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaRegistro extends PageObject {
    By nombre = By.id("cliente.nombre");
    By apellido = By.id("cliente.apellido");
    By dirección = By.id("cliente.dirección.calle");
    By ciudad = By.id("cliente.dirección.ciudad");
    By estado = By.id("cliente.dirección.estado");
    By códigoPostal = By.id("cliente.dirección.códigoPostal");
    By númeroTeléfono = By.id("cliente.númeroTeléfono");
    By ssn = By.id("cliente.ssn");
    By nombreUsuario = By.id("cliente.nombreUsuario");
    By contraseña = By.id("cliente.contraseña");
    By confirmarContraseña = By.id("confirmarContraseña");
    By botónRegistrar = By.cssSelector(".botón[valor='Registrar']");

    public void completarFormularioRegistro(String nombre, String apellido, String dirección, String ciudad, String estado, String códigoPostal, String númeroTeléfono, String ssn, String nombreUsuario, String contraseña) {
        Accion.sendData(getDriver(), this.nombre, nombre);
        Accion.sendData(getDriver(), this.apellido, apellido);
        Accion.sendData(getDriver(), this.dirección, dirección);
        Accion.sendData(getDriver(), this.ciudad, ciudad);
        Accion.sendData(getDriver(), this.estado, estado);
        Accion.sendData(getDriver(), this.códigoPostal, códigoPostal);
        Accion.sendData(getDriver(), this.númeroTeléfono, númeroTeléfono);
        Accion.sendData(getDriver(), this.ssn, ssn);
        Accion.sendData(getDriver(), this.nombreUsuario, nombreUsuario);
        Accion.sendData(getDriver(), this.contraseña, contraseña);
        Accion.sendData(getDriver(), this.confirmarContraseña, contraseña);
        Accion.clickElement(getDriver(), botónRegistrar);
    }
}

