
package test;

import com.proyectoed.modelo.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    void testNombre() {
        Usuario u = new Usuario();
        u.setNombre("Héctor");
        assertEquals("Héctor", u.getNombre());
    }
}