package sistemausuarios.modelo;

public class Cliente extends Usuario {
    private String plan;

    public Cliente(String username, String correo, String plan) {
        super(username, correo);
        this.plan = plan;
    }

    @Override
    public String obtenerPermisos() {
        return "Permisos de cliente: consultar sus datos y crear solicitudes";
    }

    @Override
    public String mostrarInformacion() {
        return "[Cliente] " + super.mostrarInformacion() + " | Plan: " + plan;
    }
}
