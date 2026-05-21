package org.fis;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CandidatoTest {
//
    // Caso normal
    @Test
    public void testCrearCandidato() {

     Candidato candidato = new Candidato(
                        "Laura",
                        "Partido Verde",
                        "Presidencia"
                );

        assertEquals("Laura", candidato.getNombre());
    }

    // Caso negativo
    @Test
    public void testNombreVacio() {

        Candidato candidato =
                new Candidato(
                        "",
                        "Partido Verde",
                        "Presidencia"
                );

        assertEquals("", candidato.getNombre());
    }
}
