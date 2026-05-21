package org.fis.grupo1.alertas;

import org.fis.grupo1.ResultadoElectoral;

public class EstrategiaAlertaConsola implements EstrategiaAlerta {

    @Override
    public void ejecutar(ResultadoElectoral resultado) {

        System.out.println("\n=== ALERTA ===");

        System.out.println("Nuevo registro realizado:");

        System.out.println(
                "Candidato: "
                + resultado.getCandidato()
        );

        System.out.println(
                "Votos: "
                + resultado.getVotos()
        );

        System.out.println(
                "Mesa: "
                + resultado.getMesa()
        );
    }
}
