public class FachadaSistemaElectoral {

    private SistemaElectoral sistema;
    private FabricaProceso fabricaProceso;

    public FachadaSistemaElectoral() {
        this.sistema = SistemaElectoral.getInstancia();
        this.fabricaProceso = new FabricaProceso();
    }

    public Proceso crearYRegistrarProceso(TipoProceso tipo, int dia, int mes, int anio) {
        Proceso proceso = fabricaProceso.crearProceso(tipo, dia, mes, anio);
        sistema.agregarProceso(proceso);
        return proceso;
    }

    public void registrarCandidato(Candidato candidato) {
        validarObjeto(candidato, "El candidato no puede ser nulo");
        sistema.agregarCandidato(candidato);
    }

    public void registrarPartido(PartidoPolitico partido) {
        validarObjeto(partido, "El partido politico no puede ser nulo");
        sistema.agregarPartido(partido);
    }

    public void registrarTerritorio(Territorio territorio) {
        validarObjeto(territorio, "El territorio no puede ser nulo");
        sistema.agregarTerritorio(territorio);
    }

    public Candidato obtenerGanador(Acta acta, EstrategiaConteo estrategia) {
        validarObjeto(estrategia, "La estrategia de conteo no puede ser nula");
        return estrategia.calcularGanador(acta);
    }

    private void validarObjeto(Object objeto, String mensaje) {
        if (objeto == null) {
            throw new IllegalArgumentException(mensaje);
        }
    }
}
