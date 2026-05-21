package org.fis;

public class Candidato {

    private String nombre;
    private String partidoPolitico;
    private String cargo;

    public Candidato(String nombre, String partidoPolitico, String cargo) {
        this.nombre = nombre;
        this.partidoPolitico = partidoPolitico;
        this.cargo = cargo;
    }

    public void mostrarCandidato() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Partido: " + partidoPolitico);
        System.out.println("Cargo: " + cargo);
    }

    public static void main(String[] args) {
        Candidato candidato = new Candidato("Laura Gómez", "Partido Verde", "Presidencia");
        candidato.mostrarCandidato();
    }
}
