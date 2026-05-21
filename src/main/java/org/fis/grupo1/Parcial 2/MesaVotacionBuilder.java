package org.fis.grupo1.Parcial2;
import org.fis.grupo1.Parcial2.Mesa;


public class MesaVotacionBuilder {

    private int numeroMesa;
    private int censoVotantes;

     public MesaVotacionBuilder(int numeroMesa, int censoVotantes) {

        this.numeroMesa = numeroMesa;
        this.censoVotantes = censoVotantes;

        this.mesa = new Mesa();
    }

      @Override
    public void buildIdMesa() {
        mesa.setIdMesa(idMesa);
    }

    @Override
    public void buildCensoVotantes() {
        mesa.setCensoVotantes(censoVotantes);
    }

    @Override
    public Mesa getResultadosMesa() {
        return mesa;
    }
}

