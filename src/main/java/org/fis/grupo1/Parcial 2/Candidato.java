package org.fis.grupo1.Parcial2;

  public class Candidato {
//
    private String nombre;
    private String partidoPolitico;
    private String cargo;

    public Candidato() {
    }
    public string getnombre() {
        return   nombre;
    }
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    public String getpartidoPolitico() {
        return partidoPolitico;
    }
    public void setpartidoPolitico (string partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }
    public String getcargo() {
        return cargo;
    }
    public void setcargo(string cargo) {
        this.cargo = cargo);
    }

    ublic void mostrarCandidato() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Partido: " + partidoPolitico);
        System.out.println("Cargo: " + cargo);
    }
}
