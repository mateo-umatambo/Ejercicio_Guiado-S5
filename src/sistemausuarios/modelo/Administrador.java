package sistemausuarios.modelo;

public class Administrador extends Usuario {
    private int nivelAdministracion;

    public Administrador(String username, String correo, int nivelAdministracion) {
        super(username, correo);
        this.nivelAdministracion = nivelAdministracion;
    }

    @Override
    public String obtenerPermisos() {
        return "Permisos de administrador: gestionar usuarios, configurar el sistema y ver auditoría";
    }

    @Override
    public String mostrarInformacion() {
        return "[Administrador] " + super.mostrarInformacion()
                + " | Nivel de administración: " + nivelAdministracion;
    }
}
