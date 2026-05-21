package org.fis.grupo1.Parcial2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProcesoElectoralTest {

    // Caso normal
    @Test
    public void testCrearProcesoElectoral() {

        ProcesoElectoral proceso =
                new ProcesoElectoral(
                        "Presidencial",
                        "29/05/2026",
                        "Activo"
                );

        assertEquals("Presidencial", proceso.getTipoEleccion());
    }
  //prueba negativa del proceso electoral, validamos un campo vacio
    public void testProcesoElectoralTipoVacio() {
      ProcesoElectoral proceso = new ProcesoElectoral("", "29/05/2026", "Activo");
      assertNotEquals("Presidencial", proceso.getTipoEleccion());
  }
}
  
