package org.fis;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MesaVotacionTest {
    @Test
    public void testCrearMesa() {
     // Caso normal de crear una mesa de votación
        MesaVotacion mesa =new MesaVotacion(10, 300);
        assertEquals(10, mesa.getNumeroMesa());
    }

    // Caso límite porque cesno votantes es 0
    @Test
    public void testCensoCero() {

        MesaVotacion mesa = new MesaVotacion(5, 0);
        assertEquals(0, mesa.getCensoVotantes());
    }
}
