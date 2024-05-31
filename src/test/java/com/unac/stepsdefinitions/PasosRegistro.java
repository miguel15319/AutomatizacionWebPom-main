package com.unac.stepsdefinitions;

import com.unac.pages.PaginaRegistro;
import com.unac.pages.PaginaNuevaCuenta;
import com.unac.pages.VistaGeneralCuentas;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Cuando;
import static org.junit.Assert.assertTrue;

public class PasosRegistro {

    PaginaRegistro paginaRegistro;
    PaginaNuevaCuenta paginaNuevaCuenta;
    VistaGeneralCuentas vistaGeneralCuentas;

    @Dado("navego a la página de registro de Parabank {string}")
    public void navegarAPaginaRegistro(String url) {
        paginaRegistro.abrirEn(url);
    }

    @Cuando("registro con nombre {string}, apellido {string}, dirección {string}, ciudad {string}, estado {string}, código postal {string}, número de teléfono {string}, SSN {string}, nombre de usuario {string}, y contraseña {string}")
    public void registrar(String nombre, String apellido, String direccion, String ciudad, String estado, String codigoPostal, String numeroTelefono, String ssn, String usuario, String contraseña) {
        paginaRegistro.completarFormularioRegistro(nombre, apellido, direccion, ciudad, estado, codigoPostal, numeroTelefono, ssn, usuario, contraseña);
    }

    @Cuando("abro una nueva cuenta")
    public void abrirNuevaCuenta() {
        paginaNuevaCuenta.abrirNuevaCuenta();
    }

    @Entonces("debería ver la nueva cuenta en la vista general de cuentas")
    public void verificarNuevaCuentaEnVistaGeneral() {
        String nuevoNumeroCuenta = paginaNuevaCuenta.obtenerNuevoNumeroCuenta();
        boolean presente = vistaGeneralCuentas.cuentaPresente(nuevoNumeroCuenta);
        assertTrue("La nueva cuenta debería estar presente en la vista general de cuentas", presente);
    }
}
