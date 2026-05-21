package org.fis;

// Interfaz base del candidato
interface InfoCandidato {
    void mostrarCandidato();
}

public class Candidato implements InfoCandidato {

    private String nombre;
    private String partidoPolitico;
    private String cargo;

    public Candidato(String nombre, String partidoPolitico, String cargo) {
        this.nombre = nombre;
        this.partidoPolitico = partidoPolitico;
        this.cargo = cargo;
    }

    public void mostrarCandidato() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Partido: " + partidoPolitico);
        System.out.println("Cargo: " + cargo);
    }

    public static void main(String[] args) {

        InfoCandidato candidato = new Candidato(
                "Laura Gomez",
                "Partido Verde",
                "Presidencia"
        );

        // Se agregan datos extra sin cambiar la clase Candidato
        candidato = new Estado(candidato, "Inscrito");
        candidato = new Nota(candidato, "Registrado para elecciones 2026");

        candidato.mostrarCandidato();
    }
}

// Decorador base
abstract class DecoradorCandidato implements InfoCandidato {

    protected InfoCandidato candidato;

    public DecoradorCandidato(InfoCandidato candidato) {
        this.candidato = candidato;
    }

    public void mostrarCandidato() {
        candidato.mostrarCandidato();
    }
}

// Agrega el estado del candidato
class Estado extends DecoradorCandidato {

    private String estado;

    public Estado(InfoCandidato candidato, String estado) {
        super(candidato);
        this.estado = estado;
    }

    public void mostrarCandidato() {
        super.mostrarCandidato();
        System.out.println("Estado: " + estado);
    }
}

// Agrega una nota adicional
class Nota extends DecoradorCandidato {

    private String nota;

    public Nota(InfoCandidato candidato, String nota) {
        super(candidato);
        this.nota = nota;
    }

    public void mostrarCandidato() {
        super.mostrarCandidato();
        System.out.println("Nota: " + nota);
    }
}
