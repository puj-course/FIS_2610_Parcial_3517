// Ruta: grupo-4/src/main/java/org/fis/grupo4/FACTORY_METHOD/ProcesoElectoralFactory.java
package org.fis.grupo4.FACTORY_METHOD;

import org.fis.grupo4.ProcesoElectoral;

public class ProcesoElectoralFactory {

    public static ProcesoElectoral crearProceso(String tipo, int id, String nombre, String fecha, String estado) {
        if (tipo == null) {
            return null;
        }
        if (tipo.equalsIgnoreCase("PRESIDENCIAL")) {
            return new EleccionPresidencial(id, nombre, fecha, estado);
        } else if (tipo.equalsIgnoreCase("LEGISLATIVA")) {
            return new EleccionLegislativa(id, nombre, fecha, estado);
        } else {
            return null;
        }
    }
}
