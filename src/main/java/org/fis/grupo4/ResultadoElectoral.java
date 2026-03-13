package org.fis.grupo4;

import java.util.HashMap;
import java.util.Map;

public class ResultadoElectoral {
    private Map<String, Integer> conteo;

    public ResultadoElectoral() {
        this.conteo = new HashMap<>();
    }

    public void sumarVoto(Candidato candidato) {
        if (candidato == null) {
            System.out.println("[Advertencia] Se intentó contabilizar voto para candidato nulo.");
            return;
        }
        String nombre = candidato.getNombre();
        conteo.put(nombre, conteo.getOrDefault(nombre, 0) + 1);
    }

    public void mostrarResultados() {
        System.out.println("\n--- RESULTADOS FINALES ---");
        conteo.forEach((nombre, total) -> {
            System.out.println(nombre + ": " + total + " votos");
        });
    }
}