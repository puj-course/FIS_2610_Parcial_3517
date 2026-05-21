public class FachadaSistemaElectoral {

    private SistemaElectoral sistema;
    private FabricaProceso fabricaProceso;

    public FachadaSistemaElectoral() {
        this.sistema = SistemaElectoral.getInstancia();
        this.fabricaProceso = new FabricaProceso();
    }

   
