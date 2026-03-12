package org.fis.grupo4;

public class Usuario {
    private String id;
    private String nombre;
    private String documento;
    private String correo;

    public Usuario(String id, String nombre, String documento, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
        this.correo = correo;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public String getDocumento() { return documento; }

    public void mostrarUsuario() {
        System.out.println("Usuario: " + nombre + " | Documento: " + documento);
    }
}
