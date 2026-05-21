import java.util.Date;

public class Resultado {

    private int idResultado;
    private Candidato candidato;
    private int totalVotos;
    private Date fechaConteo;

    // Constructor vacío
    public Resultado() {
    }

    // Constructor con parámetros
    public Resultado(int idResultado, Candidato candidato, int totalVotos, Date fechaConteo) {
        this.idResultado = idResultado;
        this.candidato = candidato;
        this.totalVotos = totalVotos;
        this.fechaConteo = fechaConteo;
    }

    // Getter y Setter de idResultado
    public int getIdResultado() {
        return idResultado;
    }

    public void setIdResultado(int idResultado) {
        this.idResultado = idResultado;
    }

    // Getter y Setter de candidato
    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    // Getter y Setter de totalVotos
    public int getTotalVotos() {
        return totalVotos;
    }

    public void setTotalVotos(int totalVotos) {
        this.totalVotos = totalVotos;
    }

    // Getter y Setter de fechaConteo
    public Date getFechaConteo() {
        return fechaConteo;
    }

    public void setFechaConteo(Date fechaConteo) {
        this.fechaConteo = fechaConteo;
    }
}
