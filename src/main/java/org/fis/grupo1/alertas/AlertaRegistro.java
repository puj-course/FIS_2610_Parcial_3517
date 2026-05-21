package org.fis.grupo1.alertas;
import org.fis.grupo1.Observer;
import org.fis.grupo1.ResultadoElectoral;

public class AlertaRegistro implements Observer {

    @Override
    public void actualizar(
            ResultadoElectoral resultado
    ) {

        System.out.println(
                "\n=== ALERTA ==="
        );

        System.out.println(
                "Nuevo registro realizado:"
        );

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
