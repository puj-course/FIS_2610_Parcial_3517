package org.fis.grupo4;

public class Voto {
    private String idVoto;
    private Usuario votante;
    private Candidato candidatoElegido;
    private String hora;

    public Voto(String idVoto, Usuario votante, Candidato candidatoElegido, String hora) {
        this.idVoto = idVoto;
        this.votante = votante;
        this.candidatoElegido = candidatoElegido;
        this.hora = hora;
    }

    public Usuario getVotante() { return votante; }
    public Candidato getCandidatoElegido() { return candidatoElegido; }
    
    @Override
    public String toString() {
        return "Voto{" +
                "idVoto='" + idVoto + '\'' +
                ", votante=" + (votante != null ? votante.getNombre() : "null") +
                ", candidatoElegido=" + (candidatoElegido != null ? candidatoElegido.getNombre() : "null") +
                ", hora='" + hora + '\'' +
                '}';
    }
}