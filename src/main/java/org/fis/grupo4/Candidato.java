package org.fis.grupo4;

public class Candidato {
    private String id;
    private String nombre;
    private String partido;
    private int numeroTarjeton;

    public Candidato(String id, String nombre, String partido, int numeroTarjeton) {
        this.id = id;
        this.nombre = nombre;
        this.partido = partido;
        this.numeroTarjeton = numeroTarjeton;
    }

    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPartido() { return partido; }
    public int getNumeroTarjeton() { return numeroTarjeton; }

    @Override
    public String toString() {
        return "Candidato{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", partido='" + partido + '\'' +
                ", numeroTarjeton=" + numeroTarjeton +
                '}';
    }
    public void mostrarCandidato() {
        System.out.println("Candidato: " + nombre + " [" + numeroTarjeton + "] - Partido: " + partido);
    }
}