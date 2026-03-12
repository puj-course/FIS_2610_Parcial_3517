package org.fis;

public class Copropietario {

    public static void main(String[] args) {
//declaro
        String nombre = "Ana";
        String documento = "12345";
//se registra el copropietario
        if(!nombre.equals("") && !documento.equals("")) {
            System.out.println("Copropietario registrado: " + nombre);
        } else {
            System.out.println("Error: datos incompletos");
        }

    }
}
