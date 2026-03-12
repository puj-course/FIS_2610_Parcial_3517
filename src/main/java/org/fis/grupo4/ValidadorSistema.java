package org.fis.grupo4;

public class ValidadorSistema {
//
    public static boolean esUsuarioValido(Usuario usuario) {
        if (usuario == null) {
            System.out.println(" [Validación Fallida]: El usuario es nulo.");
            return false;
        }

        if (usuario.getDocumento() == null || usuario.getDocumento().trim().isEmpty()) {
            System.out.println(" [Validación Fallida]: El usuario '" + usuario.getNombre() + "' no tiene un documento de identidad válido.");
            return false;
        }
        return true;
    }

    public static boolean esCandidatoValido(Candidato candidato) {
        if (candidato == null) {
            System.out.println(" [Validación Fallida]: El candidato seleccionado no es válido.");
            return false;
        }
        return true;
    }

    public static boolean puedeVotar(Usuario usuario, Candidato candidato) {
        if (!esUsuarioValido(usuario) || !esCandidatoValido(candidato)) {
            System.out.println(" Voto rechazado por el sistema de calidad.");
            return false;
        }
        return true;
    }
}