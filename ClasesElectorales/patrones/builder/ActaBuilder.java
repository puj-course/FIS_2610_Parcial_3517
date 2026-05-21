import java.util.ArrayList;
import java.util.List;

public class ActaBuilder {

    private int id;
    private Mesa mesa;
    private List<VotosCandidato> resultados = new ArrayList<>();

    public ActaBuilder conId(int id) {
        this.id = id;
        return this;
    }

    public ActaBuilder conMesa(Mesa mesa) {
        this.mesa = mesa;
        return this;
    }

    public ActaBuilder conResultados(List<VotosCandidato> resultados) {
        this.resultados = resultados;
        return this;
    }

    public ActaBuilder agregarResultado(Candidato candidato, int votos) {
        this.resultados.add(new VotosCandidato(candidato, votos));
        return this;
    }

    public Acta construir() {
        if (id <= 0) {
            throw new IllegalArgumentException("El id del acta debe ser mayor que cero");
        }

        if (mesa == null) {
            throw new IllegalArgumentException("El acta debe tener una mesa asociada");
        }

        Acta acta = new Acta();
        acta.setId(id);
        acta.setMesa(mesa);
        acta.setResultados(resultados);

        return acta;
    }
}
