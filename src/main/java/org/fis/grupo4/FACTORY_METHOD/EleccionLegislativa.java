// Ruta: grupo-4/src/main/java/org/fis/grupo4/FACTORY_METHOD/EleccionLegislativa.java
package org.fis.grupo4.FACTORY_METHOD;

import org.fis.grupo4.ProcesoElectoral;
import org.fis.grupo4.TipoEleccion;

public class EleccionLegislativa extends ProcesoElectoral {

    public EleccionLegislativa(int id, String nombre, String fecha, String estado) {
        super(id, nombre, TipoEleccion.LEGISLATIVA, fecha, estado);
    }

    @Override
    public String mostrarResumen() {
        return "Eleccion Legislativa: " + getNombre() + " - " + getEstado();
    }
}
