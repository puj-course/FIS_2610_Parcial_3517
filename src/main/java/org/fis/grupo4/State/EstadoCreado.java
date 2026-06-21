package org.fis.grupo4.state;

import org.fis.grupo4.ProcesoElectoral;

public class EstadoCreado implements EstadoProceso {

    public void iniciar(ProcesoElectoral context) {
        System.out.println("Se está iniciando el proceso electoral");
        context.setEstado(new EstadoActivo()); 
    }

    public void registrarVoto(ProcesoElectoral context) {
        System.out.println("Error: El proceso electoral aún no ha iniciado. No se puede votar.");
    }

    public void finalizar(ProcesoElectoral context) {
        System.out.println("Error: No se puede finalizar un proceso que no ha iniciado.");
    }
}
