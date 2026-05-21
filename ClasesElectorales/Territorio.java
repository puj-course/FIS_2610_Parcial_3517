import java.util.List;

public class Territorio {

    private String nombre;
    private List<PuestoDeVotacion> puestosDeVotacion;

    public Territorio() {
    }

    public Territorio(String nombre, List<PuestoDeVotacion> puestosDeVotacion) {
        this.nombre = nombre;
        this.puestosDeVotacion = puestosDeVotacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<PuestoDeVotacion> getPuestosDeVotacion() {
        return puestosDeVotacion;
    }

    public void setPuestosDeVotacion(List<PuestoDeVotacion> puestosDeVotacion) {
        this.puestosDeVotacion = puestosDeVotacion;
    }
}
