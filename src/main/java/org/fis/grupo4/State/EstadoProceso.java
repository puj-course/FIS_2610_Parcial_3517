public interface EstadoProceso {
    void iniciar(ProcesoElectoral context);
    void registrarVoto(ProcesoElectoral context);
    void finalizar(ProcesoElectoral context);
}
