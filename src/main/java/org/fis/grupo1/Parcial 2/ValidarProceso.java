package org.fis.grupo1.Parcial2;

public class ValidarProceso {
    public boolean validar(String tipo, String fecha, String estado) {
        return tipo != null && !tipo.isEmpty()
            && fecha != null && !fecha.isEmpty()
            && estado != null && !estado.isEmpty();
    }
}
