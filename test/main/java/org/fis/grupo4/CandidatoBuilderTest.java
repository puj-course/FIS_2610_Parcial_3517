// Ruta: grupo-4/src/test/java/org/fis/grupo4/CandidatoBuilderTest.java
package org.fis.grupo4;

import org.junit.Test;
import static org.junit.Assert.*;
import org.fis.grupo4.BUILDER.CandidatoBuilder;

public class CandidatoBuilderTest {

    @Test
    public void buildConDatosValidosRetornaCandidato() {
        Candidato c = new CandidatoBuilder()
                .setId("C100")
                .setNombre("Maria Lopez")
                .setPartido("Partido Azul")
                .setNumeroTarjeton(5)
                .build();
        assertNotNull(c);
        assertEquals("C100", c.getId());
        assertEquals("Maria Lopez", c.getNombre());
        assertEquals("Partido Azul", c.getPartido());
        assertEquals(5, c.getNumeroTarjeton());
    }

    @Test(expected = IllegalStateException.class)
    public void buildConNombreVacioLanzaExcepcion() {
        new CandidatoBuilder()
                .setId("C101")
                .setNombre("")
                .setPartido("Partido Rojo")
                .setNumeroTarjeton(3)
                .build();
    }

    @Test(expected = IllegalStateException.class)
    public void buildConIdNuloLanzaExcepcion() {
        new CandidatoBuilder()
                .setId(null)
                .setNombre("Juan Perez")
                .setPartido("Partido Verde")
                .setNumeroTarjeton(7)
                .build();
    }

    @Test(expected = IllegalStateException.class)
    public void buildConNombreSoloEspaciosLanzaExcepcion() {
        new CandidatoBuilder()
                .setId("C102")
                .setNombre("   ")
                .setPartido("Partido Rojo")
                .setNumeroTarjeton(2)
                .build();
    }
}
