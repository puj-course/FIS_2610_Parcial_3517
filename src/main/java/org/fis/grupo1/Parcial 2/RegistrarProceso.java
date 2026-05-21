package org.fis.grupo1.Parcial2;

public class RegistrarProceso {
    public ProcesoElectoral registrar(String tipo, String fecha, String estado) {
        return new ProcesoElectoral(tipo, fecha, estado);
    }
}
