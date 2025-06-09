// Mokito

package test;

import com.proyectoed.modelo.*;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioIntegrationTest {

    @Test
    void testIniciarSesionConExito() {
        AuthService mockService = mock(AuthService.class);
        when(mockService.autenticar("hector.alcaraz@iesdoctorbalmis.com", "555555")).thenReturn(true);

        Usuario u = new Usuario(mockService);
        assertTrue(u.iniciarSesion("hector.alcaraz@iesdoctorbalmis.com", "555555"));
    }
}