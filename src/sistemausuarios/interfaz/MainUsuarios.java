package sistemausuarios.interfaz;

import sistemausuarios.modelo.*;

public class MainUsuarios {
    public static void main(String[] args) {
        // Los usuarios se crean FUERA del sistema (agregación)
        Usuario u1 = new Administrador("admin1", "admin@demo.com", 3);
        Usuario u2 = new Desarrollador("dev1", "dev@demo.com", "Java");
        Usuario u3 = new Cliente("cliente1", "cliente@demo.com", "Premium");
        Usuario u4 = new Soporte("soporte1", "soporte@demo.com", 120); // desafío

        SistemaUsuarios sistema = new SistemaUsuarios();
        sistema.agregarUsuario(u1);
        sistema.agregarUsuario(u2);
        sistema.agregarUsuario(u3);
        sistema.agregarUsuario(u4);

        System.out.println("=== 1. Listado polimórfico (mostrarInformacion sobrescrito) ===");
        System.out.println(sistema.mostrarUsuarios());

        System.out.println("=== 2. Permisos distintos por subtipo ===");
        System.out.println("admin1:    " + u1.obtenerPermisos());
        System.out.println("dev1:      " + u2.obtenerPermisos());
        System.out.println("cliente1:  " + u3.obtenerPermisos());
        System.out.println("soporte1:  " + u4.obtenerPermisos());

        System.out.println("\n=== 3. Búsqueda por username ===");
        Usuario encontrado = sistema.buscarUsuario("dev1");
        System.out.println("Buscar 'dev1': " + (encontrado != null ? encontrado.mostrarInformacion() : "no encontrado"));
        Usuario noExiste = sistema.buscarUsuario("fantasma");
        System.out.println("Buscar 'fantasma': " + (noExiste != null ? noExiste.mostrarInformacion() : "no encontrado"));

        System.out.println("\n=== 4. Eliminación ===");
        System.out.println("Eliminar 'cliente1': " + sistema.eliminarUsuario("cliente1"));
        System.out.println("Eliminar 'cliente1' otra vez: " + sistema.eliminarUsuario("cliente1"));
        System.out.println(sistema.mostrarUsuarios());
    }
}
