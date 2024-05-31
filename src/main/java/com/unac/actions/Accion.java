package com.unac.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Accion {
    public static void navegarUrl(WebDriver miNavegador, String url) {
        miNavegador.navigate().to(url);
    }

    public static void enviarDatos(WebDriver miNavegador, By objetivo, String strDatos) {
        miNavegador.findElement(objetivo).sendKeys(strDatos);
    }

    public static void hacerClic(WebDriver miNavegador, By objetivo) {
        miNavegador.findElement(objetivo).click();
    }

    public static String obtenerTextoElemento(WebDriver miNavegador, By objetivo) {
        return miNavegador.findElement(objetivo).getText();
    }

    public static void seleccionarDeDropdown(WebDriver miNavegador, By objetivo, String valor) {
        Select dropdown = new Select(miNavegador.findElement(objetivo));
        dropdown.selectByVisibleText(valor);
    }

    public static boolean elementoPresente(WebDriver miNavegador, By objetivo) {
        return miNavegador.findElements(objetivo).size() > 0;
    }
}

