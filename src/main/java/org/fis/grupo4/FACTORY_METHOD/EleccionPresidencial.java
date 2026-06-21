// Ruta: grupo-4/src/main/java/org/fis/grupo4/FACTORY_METHOD/EleccionPresidencial.java
package org.fis.grupo4.FACTORY_METHOD;

import org.fis.grupo4.ProcesoElectoral;
import org.fis.grupo4.TipoEleccion;

public class EleccionPresidencial extends ProcesoElectoral {

    public EleccionPresidencial(int id, String nombre, String fecha, String estado) {
        super(id, nombre, TipoEleccion.PRESIDENCIAL, fecha, estado);
    }

    @Override
    public String mostrarResumen() {
        return "Eleccion Presidencial: " + getNombre() + " - " + getEstado();
    }
}
