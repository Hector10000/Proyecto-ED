import java.util.Date;
import java.util.List;

/**
 * Clase base para todos los usuarios del sistema.
 */
public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private String contraseña;

    public Usuario() {
    }

    /**
     * Registra un nuevo usuario en el sistema.
     */
    public void registrarse() {

    }

    /**
     * Inicia sesión del usuario.
     */
    public void iniciarSesion() {

    }

    /**
     * Cierra sesión del usuario.
     */
    public void cerrarSesion() {

    }
}

/**
 * Representa un cliente que puede comprar y descargar juegos.
 */
public class Cliente extends Usuario {

    public Cliente() {
        super();
    }

    /**
     * Permite al cliente comprar un juego.
     */
    public void comprarJuego() {

    }
}

/**
 * Representa un administrador que puede gestionar usuarios y juegos.
 */
public class Administrador extends Usuario {

    public Administrador() {
        super();
    }

    /**
     * Visualiza información de un usuario.
     */
    public void verUsuario() {

    }

    /**
     * Banea a un usuario del sistema.
     */
    public void banearUsuario() {

    }

    /**
     * Banea un juego de la plataforma.
     */
    public void banearJuego() {

    }

    /**
     * Gestiona y controla el soporte técnico.
     */
    public void controlarSoporte() {

    }
}

/**
 * Representa un desarrollador que puede subir y gestionar juegos propios.
 */
public class Desarrollador extends Usuario {

    public Desarrollador() {
        super();
    }

    /**
     * Publica un nuevo juego en la plataforma.
     */
    public void publicarJuego() {

    }

    /**
     * Elimina un juego publicado anteriormente.
     */
    public void eliminarJuego() {

    }
}

/**
 * Representa un juego disponible en la plataforma.
 */
public class Juego {
    private int id;
    private String titulo;
    private double precio;
    private String descripcion;

    public Juego() {
    }

    /**
     * Muestra la información del juego.
     */
    public void mostrarInfo() {

    }
}

/**
 * Representa un pedido realizado por un usuario.
 */
public class Pedido {
    private int id;
    private Usuario usuario;
    private Date fecha;
    private float total;
    private List<DetallePedido> detalles;

    public Pedido() {
    }

    /**
     * Calcula el total del pedido.
     */
    public void calcularTotal() {

    }
}

/**
 * Detalle de un pedido que incluye un juego y su precio.
 */
public class DetallePedido {
    private int id;
    private Pedido pedido;
    private Juego juego;
    private double precioUnitario;

    public DetallePedido() {
    }
}

/**
 * Representa una descarga realizada por un usuario.
 */
public class Descarga {
    private int id;
    private Usuario usuario;
    private Juego juego;
    private float tiempoDescarga;
    private float cantidadDescarga;

    public Descarga() {
    }
}

/**
 * Representa la biblioteca de juegos de un usuario.
 */
public class Biblioteca {
    private int id;
    private int usuarioId;
    private int juegoId;
    public float horasJugadas;
    public String logrosObtenidos;

    public Biblioteca() {
    }

    /**
     * Inicia la descarga de un juego.
     */
    public void descargarJuego() {

    }

    /**
     * Desinstala un juego de la biblioteca.
     */
    public void desinstalarJuego() {

    }
}
