public class Candidato {

    private int idCandidato;
    private Copropietario copropietario;
    private String descripcion;
    private String estadoCandidatura;

    public Candidato(int idCandidato, Copropietario copropietario, String descripcion, String estadoCandidatura) {
        this.idCandidato = idCandidato;
        this.copropietario = copropietario;
        this.descripcion = descripcion;
        this.estadoCandidatura = estadoCandidatura;
    }

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    public Copropietario getCopropietario() {
        return copropietario;
    }

    public void setCopropietario(Copropietario copropietario) {
        this.copropietario = copropietario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstadoCandidatura() {
        return estadoCandidatura;
    }

    public void setEstadoCandidatura(String estadoCandidatura) {
        this.estadoCandidatura = estadoCandidatura;
    }

    public void mostrarInformacion() {
        System.out.println("ID Candidato: " + idCandidato);
        System.out.println("Copropietario: " + copropietario);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Estado de candidatura: " + estadoCandidatura);
    }
}
