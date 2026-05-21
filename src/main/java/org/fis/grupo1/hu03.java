package org.fis;

public class MesaVotacion {

    private int numeroMesa;
    private int censoVotantes;

    // Constructor
    public MesaVotacion(int numeroMesa, int censoVotantes) {
        this.numeroMesa = numeroMesa;
        this.censoVotantes = censoVotantes;
    }

    // Método básico
    public void mostrarMesa() {
        System.out.println("Mesa número: " + numeroMesa);
        System.out.println("Censo aproximado: " + censoVotantes);
    }

    public static void main(String[] args) {

        MesaVotacion mesa =
                new MesaVotacion(
                        12,
                        350
                );

        mesa.mostrarMesa();
    }
}
