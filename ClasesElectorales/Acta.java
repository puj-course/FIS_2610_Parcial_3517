import java.util.List;
public class Acta {
    private int id;
    private Mesa mesa;
    private List<VotosCandidato> resultados;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public Mesa getMesa() { return mesa; }
    public void setMesa(Mesa mesa) { this.mesa = mesa; }
    public List<VotosCandidato> getResultados() { return resultados; }
    public void setResultados(List<VotosCandidato> resultados) { this.resultados = resultados; }
}
