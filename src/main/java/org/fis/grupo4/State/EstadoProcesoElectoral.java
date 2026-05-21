package org.fis.grupo4;

import org.fis.grupo4.state.*; 

public class ProcesoElectoral {
    private EstadoProceso estadoActual;
    public ProcesoElectoral() {
        this.estadoActual = new EstadoCreado();
    }
    public void setEstado(EstadoProceso nuevoEstado) {
        this.estadoActual = nuevoEstado;
        System.out.println("Estado cambiado a: " + nuevoEstado.getClass().getSimpleName());
    }
    public void ejecutarInicio() {
        estadoActual.iniciar(this);
    }
    public void ejecutarVotacion() {
        estadoActual.registrarVoto(this);
    }
    public void ejecutarFinalizacion() {
        estadoActual.finalizar(this);
    }
}
