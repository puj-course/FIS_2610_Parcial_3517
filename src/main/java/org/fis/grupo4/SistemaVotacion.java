package org.fis.grupo4;

import java.util.ArrayList;
import java.util.List;

public class SistemaVotacion {
    private List<Voto> urnaVirtual;
    private List<String> documentosProcesados;

    public SistemaVotacion() {
        this.urnaVirtual = new ArrayList<>();
        this.documentosProcesados = new ArrayList<>();
    }

    public void registrarVoto(Voto nuevoVoto) {
        if (nuevoVoto == null || nuevoVoto.getVotante() == null) {
            System.out.println("!!! ERROR: Voto inválido (objeto nulo). No se registra.");
            return;
        }
        String doc = nuevoVoto.getVotante().getDocumento();
        if (doc == null) {
            System.out.println("!!! ERROR: El votante no tiene documento. No se registra.");
            return;
        }
        
        if (documentosProcesados.contains(doc)) {
            System.out.println("!!! ERROR: El documento " + doc + " ya tiene un voto registrado.");
            return;
        }

        urnaVirtual.add(nuevoVoto);
        documentosProcesados.add(doc);
    }

    public int getTotalVotos() {
        return urnaVirtual.size();
    }
}