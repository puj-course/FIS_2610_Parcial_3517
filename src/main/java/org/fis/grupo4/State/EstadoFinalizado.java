package org.fis.grupo4.state;

import org.fis.grupo4.ProcesoElectoral;

public class EstadoFinalizado implements EstadoProceso {

    public void iniciar(ProcesoElectoral context) {
        System.out.println("Error: El proceso ya ha finalizado y no puede reiniciarse.");
    }

    public void registrarVoto(ProcesoElectoral context) {
        System.out.println("Error: No se pueden registrar votos en un proceso electoral finalizado.");
    }

    public void finalizar(ProcesoElectoral context) {
        System.out.println("El proceso ya se encuentra en estado finalizado.");
    }
}
