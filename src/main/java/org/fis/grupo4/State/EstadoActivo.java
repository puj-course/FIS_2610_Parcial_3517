package org.fis.grupo4.state;

import org.fis.grupo4.ProcesoElectoral;

public class EstadoActivo implements EstadoProceso {
    @Override
    public void iniciar(ProcesoElectoral context) {
        System.out.println("El proceso ya está activo.");
    }
    @Override
    public void registrarVoto(ProcesoElectoral context) {
        System.out.println("Voto registrado con éxito.");
    }
    @Override
    public void finalizar(ProcesoElectoral context) {
        System.out.println("Finalizando proceso electoral...");
        context.setEstado(new EstadoFinalizado());
    }
}
