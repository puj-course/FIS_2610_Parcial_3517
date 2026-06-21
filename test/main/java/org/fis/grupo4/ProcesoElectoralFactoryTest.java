// Ruta: grupo-4/src/test/java/org/fis/grupo4/ProcesoElectoralFactoryTest.java
package org.fis.grupo4;

import org.junit.Test;
import static org.junit.Assert.*;
import org.fis.grupo4.FACTORY_METHOD.*;

public class ProcesoElectoralFactoryTest {

    @Test
    public void crearPresidencialDevuelveEleccionPresidencial() {
        ProcesoElectoral p = ProcesoElectoralFactory.crearProceso("PRESIDENCIAL", 1, "Eleccion 2026", "2026-05-20", "CREADO");
        assertNotNull(p);
        assertTrue(p instanceof EleccionPresidencial);
        assertEquals(TipoEleccion.PRESIDENCIAL, p.getTipoEleccion());
    }

    @Test
    public void crearLegislativaDevuelveEleccionLegislativa() {
        ProcesoElectoral p = ProcesoElectoralFactory.crearProceso("LEGISLATIVA", 2, "Legislativas 2026", "2026-06-15", "CREADO");
        assertNotNull(p);
        assertTrue(p instanceof EleccionLegislativa);
        assertEquals(TipoEleccion.LEGISLATIVA, p.getTipoEleccion());
    }

    @Test
    public void crearConTipoNuloRetornaNull() {
        ProcesoElectoral p = ProcesoElectoralFactory.crearProceso(null, 3, "Test", "2026-01-01", "CREADO");
        assertNull(p);
    }

    @Test
    public void crearConTipoDesconocidoRetornaNull() {
        ProcesoElectoral p = ProcesoElectoralFactory.crearProceso("MUNICIPAL", 4, "Test", "2026-01-01", "CREADO");
        assertNull(p);
    }
}
