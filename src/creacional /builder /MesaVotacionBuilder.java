import java.util.ArrayList;
import java.util.List;

public class MesaVotacionBuilder {

    private int numeroMesa;
    private int censo;
    private PuestoVotacion puestoVotacion;
    private List<Jurado> jurados = new ArrayList<>();
    private String estado = "INSTALADA";

  public MesaVotacionBuilder numeroMesa(int numeroMesa) {
          if (numeroMesa <= 0) {
                throw new IllegalArgumentException("El número de mesa debe ser mayor a 0.");}
            this.numeroMesa = numeroMesa;
            return this;}

    public MesaVotacionBuilder censo(int censo) {
        if (censo <= 0) {
            throw new IllegalArgumentException("El censo de votantes debe ser mayor a 0.") }
        this.censo = censo;
        return this;
    }

    public MesaVotacionBuilder puestoVotacion(PuestoVotacion puestoVotacion) {
        this.puestoVotacion = puestoVotacion;
        return this; }

    public MesaVotacionBuilder agregarJurado(Jurado jurado) {
        if (jurado == null) {
            throw new IllegalArgumentException("El jurado no puede ser nulo.");}
  this.jurados.add(jurado);
    return this;}

    public MesaVotacionBuilder estado(String estado) {
        this.estado = estado;
        return this;}

    public MesaVotacion build() {
        if (numeroMesa <= 0) {
            throw new IllegalStateException("Debe definir el número de mesa antes de construirla.");}
        if (censo <= 0) {
            throw new IllegalStateException("Debe definir el censo de votantes antes de construir la mesa.");}
        if (puestoVotacion == null) {
            throw new IllegalStateException("La mesa debe estar asociada a un puesto de votación.");}

        MesaVotacion mesa = new MesaVotacion();
        mesa.setNumeroMesa(numeroMesa);
        mesa.setCenso(censo);
        mesa.setPuestoVotacion(puestoVotacion);
        mesa.setJurados(new ArrayList<>(jurados));
        mesa.setEstado(estado);
        return mesa;}}
