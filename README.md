# Ejercicio guiado — Software: Usuarios del Sistema (Herencia y sobreescritura)

## Preguntas de reflexión

1. **¿Por qué `ArrayList<Usuario>` acepta objetos `Administrador`?**
   Porque `Administrador` *es un* `Usuario` (herencia). Una referencia o colección del tipo padre puede almacenar cualquier objeto de sus subclases (polimorfismo).

2. **¿Qué método se ejecuta al llamar `mostrarInformacion()`?**
   La versión sobrescrita de la clase real del objeto (`Administrador`, `Desarrollador`, `Cliente`...), no la de `Usuario`. Java lo decide en tiempo de ejecución (enlace dinámico).

3. **¿Qué diferencia hay entre el tipo de la variable y el tipo real del objeto?**
   El tipo de la variable (`Usuario u1`) determina qué métodos se pueden *invocar* al compilar; el tipo real (`new Administrador(...)`) determina qué implementación se *ejecuta*.

4. **¿Por qué `SistemaUsuarios` representa agregación?**
   Porque los usuarios se crean fuera del sistema y solo se agregan; existen independientemente. Si el sistema se destruye, los objetos `Usuario` pueden seguir existiendo (relación "tiene un" débil, rombo vacío ◇).

5. **¿Qué datos deberían permanecer en `Usuario` y cuáles en las hijas?**
   En `Usuario`: lo común (`username`, `correo`, `getUsername()`, permisos básicos). En las hijas: lo específico (`nivelAdministracion`, `lenguajePrincipal`, `plan`, `ticketsAtendidos`) y sus permisos propios.

## Desafío adicional
`Soporte extends Usuario` se agregó (ver `Soporte.java`) y se añade al sistema desde `Main` **sin modificar `SistemaUsuarios`**, porque este solo depende del tipo padre.
