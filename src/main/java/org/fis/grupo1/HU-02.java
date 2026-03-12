package org.fis;
import java.util.ArrayList;
public class RegistroCopropietarios {
    public static void main(String[] args) {
        ArrayList<String> documentos = new ArrayList<>();
        String nuevoDocumento = "12345";
        if (documentos.contains(nuevoDocumento)) {
            System.out.println("Error: el copropietario ya está registrado.");
        } else {
            documentos.add(nuevoDocumento);
            System.out.println("Registro exitoso del copropietario.");
        }
    }
}
