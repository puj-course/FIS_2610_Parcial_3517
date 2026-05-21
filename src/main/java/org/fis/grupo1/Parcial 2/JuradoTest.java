package org.fis;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JuradoTest {

    // Caso normal
    @Test
    public void testCrearJurado() {

        Jurado jurado =
                new Jurado(
                        "Carlos",
                        4,
                        "Presidente"
                );

        assertEquals(4, jurado.getMesaAsignada());
    }

    // Caso límite
    @Test
    public void testMesaCero() {

        Jurado jurado =
                new Jurado(
                        "Ana",
                        0,
                        "Secretario"
                );

        assertEquals(0, jurado.getMesaAsignada());
    }
}
