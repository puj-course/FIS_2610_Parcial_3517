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

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDocumento() { return documento; }
    public String getCorreo() { return correo; }

    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", documento='" + documento + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
    public void mostrarUsuario() {
        String docInfo = (documento == null || documento.isEmpty()) ? "SIN DOCUMENTO" : documento;
        System.out.println("Usuario: " + nombre + " | Documento: " + docInfo);
    }
}