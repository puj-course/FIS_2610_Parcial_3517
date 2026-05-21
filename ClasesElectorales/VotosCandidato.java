public class VotosCandidato {
    private Candidato candidato;
    private int votos;

    public VotosCandidato(Candidato candidato, int votos) {
        this.candidato = candidato;
        this.votos = votos;
    }
    public Candidato getCandidato() { return candidato; }
    public void setCandidato(Candidato candidato) { this.candidato = candidato; }
    public int getVotos() { return votos; }
    public void setVotos(int votos) { this.votos = votos; }
}
