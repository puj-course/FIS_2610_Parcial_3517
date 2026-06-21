package org.fis.grupo4;

import org.junit.Test;
import static org.junit.Assert.*;

public class Grupo4Test {


    @Test
    public void esUsuarioValido_documentoVacio_retornaFalse() {
        Usuario u = new Usuario("U1", "Ana", "", "ana@mail.com");
        assertFalse(ValidadorSistema.esUsuarioValido(u));
    }


    @Test
    public void esUsuarioValido_documentoSoloEspacios_retornaFalse() {
        Usuario u = new Usuario("U2", "Carlos", "   ", "carlos@mail.com");
        assertFalse(ValidadorSistema.esUsuarioValido(u));
    }


    @Test
    public void esCandidatoValido_candidatoNulo_retornaFalse() {
        assertFalse(ValidadorSistema.esCandidatoValido(null));
    }


    @Test
    public void esCandidatoValido_candidatoValido_retornaTrue() {
        Candidato c = new Candidato("C1", "Pedro", "PartidoX", 1);
        assertTrue(ValidadorSistema.esCandidatoValido(c));
    }

    @Test
    public void puedeVotar_usuarioSinDocumento_retornaFalse() {
        Usuario u = new Usuario("U3", "Luis", "", "luis@mail.com");
        Candidato c = new Candidato("C2", "Marta", "PartidoY", 2);
        assertFalse(ValidadorSistema.puedeVotar(u, c));
    }


    @Test
    public void puedeVotar_ambosValidos_retornaTrue() {
        Usuario u = new Usuario("U4", "Sofia", "9988776", "sofia@mail.com");
        Candidato c = new Candidato("C3", "Jorge", "PartidoZ", 3);
        assertTrue(ValidadorSistema.puedeVotar(u, c));
    }


    @Test
    public void registrarVoto_votanteNulo_noSumaAlTotal() {
        SistemaVotacion sistema = new SistemaVotacion();
        Candidato c = new Candidato("C4", "Elena", "PartidoA", 4);
        Voto votoInvalido = new Voto("V0", null, c, "09:00");
        sistema.registrarVoto(votoInvalido);
        assertEquals(0, sistema.getTotalVotos());
    }


    @Test
    public void registrarVoto_documentoDuplicado_totalPermaneceEnUno() {
        SistemaVotacion sistema = new SistemaVotacion();
        Usuario u = new Usuario("U5", "Miguel", "111222333", "miguel@mail.com");
        Candidato c = new Candidato("C5", "Rosa", "PartidoB", 5);
        sistema.registrarVoto(new Voto("V1", u, c, "10:00"));
        sistema.registrarVoto(new Voto("V2", u, c, "10:05"));
        assertEquals(1, sistema.getTotalVotos());
    }


    @Test
    public void getTotalVotos_sistemaVacio_retornaCero() {
        SistemaVotacion sistema = new SistemaVotacion();
        assertEquals(0, sistema.getTotalVotos());
    }


    @Test
    public void cerrarProceso_sinHaberIniciado_estadoEsFinalizado() {
        ProcesoElectoral p = new ProcesoElectoral(1, "Elecciones", TipoEleccion.LOCAL, "2026-05-21", "CREADO");
        p.cerrarProceso();
        assertEquals("FINALIZADO", p.getEstado());
    }

    @Test
    public void iniciarYCerrarProceso_cicloCompleto_estadosCorrectos() {
        ProcesoElectoral p = new ProcesoElectoral(2, "Internas", TipoEleccion.INTERNA, "2026-05-21", "CREADO");
        p.iniciarProceso();
        assertEquals("ACTIVO", p.getEstado());
        p.cerrarProceso();
        assertEquals("FINALIZADO", p.getEstado());
    }


    @Test
    public void sumarVoto_candidatoNulo_noLanzaExcepcionYConteoPermaneceCero() {
        ResultadoElectoral resultado = new ResultadoElectoral();
        resultado.sumarVoto(null);
        assertEquals(0, resultado.getVotos("cualquier"));
    }


    @Test
    public void sumarVoto_cientoVotosAlMismoCandidato_conteoExacto() {
        ResultadoElectoral resultado = new ResultadoElectoral();
        Candidato c = new Candidato("C6", "Valentina", "PartidoC", 6);
        for (int i = 0; i < 100; i++) {
            resultado.sumarVoto(c);
        }
        assertEquals(100, resultado.getVotos("Valentina"));
    }
}
