import java.time.LocalDate;

public class ProcesoElectoral {
    private String tipo;
    private LocalDate fecha;
    private String estado;

    public ProcesoElectoral(String tipo, LocalDate fecha, String estado) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ProcesoElectoral{" +
                "tipo='" + tipo + '\'' +
                ", fecha=" + fecha +
                ", estado='" + estado ;
    }
}
