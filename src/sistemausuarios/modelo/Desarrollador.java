package sistemausuarios.modelo;

public class Desarrollador extends Usuario {
    private String lenguajePrincipal;

    public Desarrollador(String username, String correo, String lenguajePrincipal) {
        super(username, correo);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    @Override
    public String obtenerPermisos() {
        return "Permisos de desarrollador: leer y escribir código, desplegar en pruebas";
    }

    @Override
    public String mostrarInformacion() {
        return "[Desarrollador] " + super.mostrarInformacion()
                + " | Lenguaje principal: " + lenguajePrincipal;
    }
}
