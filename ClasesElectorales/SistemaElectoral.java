import java.util.List;
import java.util.ArrayList;

public class SistemaElectoral {

    private static SistemaElectoral instancia;

    private List<Proceso> procesos;
    private List<Territorio> territorios;
    private List<Candidato> candidatos;
    private List<PartidoPolitico> partidos;

    private SistemaElectoral() {
        procesos = new ArrayList<>();
        territorios = new ArrayList<>();
        candidatos = new ArrayList<>();
        partidos = new ArrayList<>();
    }

    public static SistemaElectoral getInstancia() {
        if (instancia == null) {
            instancia = new SistemaElectoral();
        }
        return instancia;
    }

    public void agregarProceso(Proceso p) { procesos.add(p); }
    public void agregarTerritorio(Territorio t) { territorios.add(t); }
    public void agregarCandidato(Candidato c) { candidatos.add(c); }
    public void agregarPartido(PartidoPolitico p) { partidos.add(p); }

    public List<Proceso> getProcesos() { return procesos; }
    public List<Territorio> getTerritorios() { return territorios; }
    public List<Candidato> getCandidatos() { return candidatos; }
    public List<PartidoPolitico> getPartidos() { return partidos; }
}
