package org.fis.grupo1.Parcial2;

public class Mesa {
    private int idMesa;
    private int censoVotantes;

    public Mesa() {
    }
    public int getIdMesa() {
        return idMesa;
    }
    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }
    public int getCensoVotantes() {
        return censoVotantes;
    }
    public void setCensoVotantes(int censoVotantes) {
        this.censoVotantes = censoVotantes;
    }

    public void mostrarMesa() { //la función básica
        System.out.println("Número de mesa: " + idMesa);
        System.out.println("Censo de votantes: " + censoVotantes);
    }
}
