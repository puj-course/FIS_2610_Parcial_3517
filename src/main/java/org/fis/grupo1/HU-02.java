Puesto de votación: package org.fis;

public class PuestoVotacion {

    private String nombre;
    private String ubicacion;
    private int capacidadMesas;

    // Constructor
    public PuestoVotacion(String nombre, String ubicacion, int capacidadMesas) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidadMesas = capacidadMesas;
    }

    // Método básico
    public void mostrarPuesto() {
        System.out.println("Puesto: " + nombre);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Cantidad de mesas: " + capacidadMesas);
    }

    public static void main(String[] args) {

        PuestoVotacion puesto =
                new PuestoVotacion(
                        "Colegio Nacional",
                        "Bogotá",
                        25
                );

        puesto.mostrarPuesto();
    }
}
