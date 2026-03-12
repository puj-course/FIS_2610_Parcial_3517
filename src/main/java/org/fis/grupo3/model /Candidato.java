public class Candidato {

    private int idCandidato;
    private Copropietario copropietario;
    private String descripcion;
    private String estadoCandidatura;

    // Constructor de la clase Candidato GenIA
    public Candidato(int idCandidato, Copropietario copropietario, String descripcion, String estadoCandidatura) {
        this.idCandidato = idCandidato;
        this.copropietario = copropietario;
        this.descripcion = descripcion;
        this.estadoCandidatura = estadoCandidatura;
    }

    // Getter idCandidato GenIA
    public int getIdCandidato() {
        return idCandidato;
    }

    // Setter idCandidato GenIA
    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    // Getter copropietario GenIA
    public Copropietario getCopropietario() {
        return copropietario;
    }

    // Setter copropietario GenIA
    public void setCopropietario(Copropietario copropietario) {
        this.copropietario = copropietario;
    }

    // Getter descripcion GenIA
    public String getDescripcion() {
        return descripcion;
    }

    // Setter descripcion GenIA
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Getter estadoCandidatura GenIA
    public String getEstadoCandidatura() {
        return estadoCandidatura;
    }

    // Setter estadoCandidatura GenIA
    public void setEstadoCandidatura(String estadoCandidatura) {
        this.estadoCandidatura = estadoCandidatura;
    }

    // Metodo para mostrar la informacion del candidato GenIA
    public void mostrarInformacion() {
        System.out.println("ID Candidato: " + idCandidato);
        System.out.println("Copropietario: " + copropietario);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Estado de candidatura: " + estadoCandidatura);
    }
}
