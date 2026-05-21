package org.fis;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ResultadoElectoralTest {

    // Caso normal
    @Test
    public void testResultadoCorrecto() {

        ResultadoElectoral resultado =
                new ResultadoElectoral("Laura", 250,8);

        assertEquals(250, resultado.getVotos());
    }

    // Caso negativo con votos menos de 0
    @Test
    public void testVotosNegativos() {

        ResultadoElectoral resultado = new ResultadoElectoral( "Laura", -10, 8);

        assertTrue(resultado.getVotos() < 0);
    }
}
