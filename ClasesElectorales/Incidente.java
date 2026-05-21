public class Incidente {
    private int id;
    private String descripcion;
    private String tipo; 
    private PuestoDeVotacion puesto;
    private Mesa mesa; 

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public PuestoDeVotacion getPuesto() { return puesto; }
    public void setPuesto(PuestoDeVotacion puesto) { this.puesto = puesto; }
    public Mesa getMesa() { return mesa; }
    public void setMesa(Mesa mesa) { this.mesa = mesa; }
}
