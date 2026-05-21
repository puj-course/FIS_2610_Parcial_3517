package org.fis.grupo1.parcial2;

// Componente
interface CandidatoComponent {

    void registrarCandidato();

    String getNombre();

    String getPartido();
}

// Clase base
class Candidato implements CandidatoComponent {

    private String nombre;
    private String partido;

    public Candidato(String nombre, String partido) {
        this.nombre = nombre;
        this.partido = partido;
    }

    @Override
    public void registrarCandidato() {
        System.out.println("Candidato registrado: " + nombre);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getPartido() {
        return partido;
    }
}

// Decorator base
abstract class CandidatoDecorator implements CandidatoComponent {

    protected CandidatoComponent candidato;

    public CandidatoDecorator(CandidatoComponent candidato) {
        this.candidato = candidato;
    }

    @Override
    public void registrarCandidato() {
        candidato.registrarCandidato();
    }

    @Override
    public String getNombre() {
        return candidato.getNombre();
    }

    @Override
    public String getPartido() {
        return candidato.getPartido();
    }
}

// Decorator concreto
class CandidatoConValidacion extends CandidatoDecorator {

    public CandidatoConValidacion(CandidatoComponent candidato) {
        super(candidato);
    }

    @Override
    public void registrarCandidato() {

        if(getNombre() == null || getNombre().isBlank()) {
            System.out.println("El candidato no tiene nombre.");
            return;
        }

        System.out.println("Validando información...");

        super.registrarCandidato();
    }
}
