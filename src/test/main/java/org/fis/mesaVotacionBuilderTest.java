package org.fis.grupo3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MesaVotacionBuilderTest {
    @Test
    void numeroMesaInvalido() {
        MesaVotacionBuilder builder = new MesaVotacionBuilder();
        assertThrows(IllegalArgumentException.class, () -> {
            builder.numeroMesa(0);
        });
    }

    @Test
    void numeroMesaValido() {
        MesaVotacion mesa = new MesaVotacionBuilder()
                .numeroMesa(1)
                .censo(100)
                .puestoVotacion(new PuestoVotacion())
                .build();
        assertEquals(1, mesa.getNumeroMesa());
    }

    @Test
    void censoInvalido() {
        MesaVotacionBuilder builder = new MesaVotacionBuilder();

        assertThrows(IllegalArgumentException.class, () -> {
            builder.censo(-1);
        });
    }

    @Test
    void censoValido() {
        MesaVotacion mesa = new MesaVotacionBuilder()
                .numeroMesa(1)
                .censo(50)
                .puestoVotacion(new PuestoVotacion())
                .build();

        assertEquals(50, mesa.getCenso());
    }

    @Test
    void agregarJuradoNulo() {
        MesaVotacionBuilder builder = new MesaVotacionBuilder();

        assertThrows(IllegalArgumentException.class, () -> {
            builder.agregarJurado(null);
        });
    }

    @Test
    void agregarJuradoValido() {
        MesaVotacion mesa = new MesaVotacionBuilder()
                .numeroMesa(1)
                .censo(100)
                .puestoVotacion(new PuestoVotacion())
                .agregarJurado(new Jurado())
                .build();

        assertEquals(1, mesa.getJurados().size());
    }

    @Test
    void buildSinPuesto() {
        MesaVotacionBuilder builder = new MesaVotacionBuilder()
                .numeroMesa(1)
                .censo(100);

        assertThrows(IllegalStateException.class, builder::build);
    }

    @Test
    void buildCorrecto() {
        MesaVotacion mesa = new MesaVotacionBuilder()
                .numeroMesa(1)
                .censo(100)
                .puestoVotacion(new PuestoVotacion())
                .build();

        assertNotNull(mesa);
    }
}
