package org.fis.grupo1.alertas;

import org.fis.grupo1.ResultadoElectoral;

public class EstrategiaAlertaResumida implements EstrategiaAlerta {

    @Override
    public void ejecutar(ResultadoElectoral resultado) {

        System.out.println(
                "\nNuevo registro: "
                + resultado.getCandidato()
                + " obtuvo "
                + resultado.getVotos()
                + " votos."
        );
    }
}
