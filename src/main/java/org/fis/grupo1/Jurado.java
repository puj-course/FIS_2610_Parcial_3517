Jurado de votación: package org.fis;

public class Jurado {

    private String nombre;
    private int mesaAsignada;
    private String funcion;

    // Constructor
    public Jurado(String nombre, int mesaAsignada, String funcion) {
        this.nombre = nombre;
        this.mesaAsignada = mesaAsignada;
        this.funcion = funcion;
    }

    // Método básico
    public void mostrarJurado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Mesa asignada: " + mesaAsignada);
        System.out.println("Función: " + funcion);
    }

    public static void main(String[] args) {

        Jurado jurado =
                new Jurado(
                        "Carlos Pérez",
                        5,
                        "Presidente de mesa"
                );

        jurado.mostrarJurado();
    }
}
