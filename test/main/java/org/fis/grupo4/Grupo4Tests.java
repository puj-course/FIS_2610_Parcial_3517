package org.fis.grupo4;

import org.junit.Test;
import static org.junit.Assert.*;

public class Grupo4Tests {

    @Test
    public void usuarioSinDocumentoNoPuedeVotar() {
        Usuario u = new Usuario("U0","SinDoc","","x@mail");
        Candidato c = new Candidato("C0","Anon","Partido",0);
        assertFalse(ValidadorSistema.puedeVotar(u,c));
    }

    @Test
    public void sistemaNoAceptaDuplicados() {
        Usuario u = new Usuario("U1","John","123","j@mail");
        Candidato c = new Candidato("C1","Cand","P",1);
        SistemaVotacion s = new SistemaVotacion();
        Voto v1 = new Voto("V1",u,c,"10:00");
        Voto v2 = new Voto("V2",u,c,"10:05");
        s.registrarVoto(v1);
        s.registrarVoto(v2);
        assertEquals(1, s.getTotalVotos());
    }

    @Test
    public void cerrarProcesoCambiaEstado() {
        ProcesoElectoral p = new ProcesoElectoral(1,"X",TipoEleccion.PRESIDENCIAL,"2026","CREADO");
        p.iniciarProceso();
        assertEquals("ACTIVO", p.getEstado());
        p.cerrarProceso();
        assertEquals("FINALIZADO", p.getEstado());
    }
}