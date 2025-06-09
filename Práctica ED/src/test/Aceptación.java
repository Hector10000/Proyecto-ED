// Cucumber

/*
Feature: Inicio de sesión

Scenario: Usuario inicia sesión con éxito
Given el usuario "ana@example.com" con contraseña "abc123"
When intenta iniciar sesión
Then el sistema muestra "Inicio de sesión exitoso"
*/

package test;

import com.proyectoed.modelo.*;
import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.*;

public class Login {
    private Usuario usuario;
    private boolean resultado;

    @Given("el usuario {string} con contraseña {string}")
    public void crearUsuario(String email, String contraseña) {
        AuthService authService = (e, c) -> e.equals(email) && c.equals(contraseña);
        usuario = new Usuario(authService);
    }

    @When("intenta iniciar sesión")
    public void iniciarSesion() {
        resultado = usuario.iniciarSesion("hector.alcaraz@iesdoctorbalmis.com", "555555");
    }

    @Then("el sistema muestra {string}")
    public void verificarMensaje(String mensaje) {
        assertTrue(resultado);
    }
}