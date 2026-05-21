package org.fis.grupo1.alertas;

import org.fis.grupo1.ResultadoElectoral;

public interface EstrategiaAlerta {

    void ejecutar(ResultadoElectoral resultado);

}
