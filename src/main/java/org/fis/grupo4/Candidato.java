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
    public String getNombre() { return nombre; }
    public String getPartido() { return partido; }

    public void mostrarCandidato() {
        System.out.println("Candidato: " + nombre + " [" + numeroTarjeton + "] - Partido: " + partido);
    }
}