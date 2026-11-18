package sistemausuarios.modelo;

// Desafío adicional: se agrega sin modificar SistemaUsuarios
public class Soporte extends Usuario {
    private int ticketsAtendidos;

    public Soporte(String username, String correo, int ticketsAtendidos) {
        super(username, correo);
        this.ticketsAtendidos = ticketsAtendidos;
    }

    @Override
    public String obtenerPermisos() {
        return "Permisos de soporte: ver y responder tickets, restablecer contraseñas";
    }

    @Override
    public String mostrarInformacion() {
        return "[Soporte] " + super.mostrarInformacion()
                + " | Tickets atendidos: " + ticketsAtendidos;
    }
}
