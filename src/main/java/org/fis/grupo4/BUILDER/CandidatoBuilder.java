// Ruta: grupo-4/src/main/java/org/fis/grupo4/BUILDER/CandidatoBuilder.java
package org.fis.grupo4.BUILDER;

import org.fis.grupo4.Candidato;

public class CandidatoBuilder {

    private String id;
    private String nombre;
    private String partido;
    private int numeroTarjeton;

    public CandidatoBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public CandidatoBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public CandidatoBuilder setPartido(String partido) {
        this.partido = partido;
        return this;
    }

    public CandidatoBuilder setNumeroTarjeton(int numeroTarjeton) {
        this.numeroTarjeton = numeroTarjeton;
        return this;
    }

    public Candidato build() {
        if (nombre == null || nombre.trim().isEmpty() || id == null || id.trim().isEmpty()) {
            throw new IllegalStateException("El nombre y la cedula del candidato son obligatorios para persistir");
        }
        return new Candidato(id, nombre, partido, numeroTarjeton);
    }
}
