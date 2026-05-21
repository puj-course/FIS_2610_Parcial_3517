package org.fis.grupo1.Parcial2;

public class ProcesoElectoralFachada {

    private ValidarProceso validador = new ValidarProceso();
    private RegistrarProceso registrador = new RegistrarProceso();

    public void registrarProceso(String tipo, String fecha, String estado) {
        if (!validador.validar(tipo, fecha, estado)) {
            System.out.println("Datos inválidos. No se puede registrar el proceso.");
            return;
        }
        ProcesoElectoral proceso = registrador.registrar(tipo, fecha, estado);
        proceso.mostrarProceso();
    }
}
