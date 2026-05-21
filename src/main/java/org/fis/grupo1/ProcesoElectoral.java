 package org.fis;

public class ProcesoElectoral {

    private String tipoEleccion;
    private String fecha;
    private String estado;

    // Constructor
    public ProcesoElectoral(String tipoEleccion, String fecha, String estado) {
        this.tipoEleccion = tipoEleccion;
        this.fecha = fecha;
        this.estado = estado;
    }

    // Método básico
    public void mostrarProceso() {
        System.out.println("Tipo de elección: " + tipoEleccion);
        System.out.println("Fecha: " + fecha);
        System.out.println("Estado: " + estado);
    }

    public static void main(String[] args) {

        ProcesoElectoral proceso =
                new ProcesoElectoral(
                        "Presidencial",
                        "29/05/2026",
                        "Activo"
                );

        proceso.mostrarProceso();
    }
}
