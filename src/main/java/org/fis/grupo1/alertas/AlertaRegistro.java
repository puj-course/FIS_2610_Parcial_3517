package org.fis.grupo1.alertas;

import org.fis.grupo1.Observer;
import org.fis.grupo1.ResultadoElectoral;

public class AlertaRegistro implements Observer {

    private EstrategiaAlerta estrategiaAlerta;

    public AlertaRegistro(EstrategiaAlerta estrategiaAlerta) {
        this.estrategiaAlerta = estrategiaAlerta;
    }

    public void setEstrategiaAlerta(EstrategiaAlerta estrategiaAlerta) {
        this.estrategiaAlerta = estrategiaAlerta;
    }

    @Override
    public void actualizar(ResultadoElectoral resultado) {

        estrategiaAlerta.ejecutar(resultado);

    }
}
