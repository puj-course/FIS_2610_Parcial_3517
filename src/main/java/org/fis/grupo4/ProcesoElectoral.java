package org.fis.grupo4;

public class ProcesoElectoral {
    private int id;
    private String nombre;
    private TipoEleccion tipoEleccion;
    private String fecha;
    private String estado;

    public ProcesoElectoral(int id, String nombre, TipoEleccion tipoEleccion, String fecha, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.tipoEleccion = tipoEleccion;
        this.fecha = fecha;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoEleccion getTipoEleccion() {
        return tipoEleccion;
    }

    public void setTipoEleccion(TipoEleccion tipoEleccion) {
        this.tipoEleccion = tipoEleccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void iniciarProceso() {
        this.estado = "ACTIVO";
    }

    public void cerrarProceso() {
        this.estado = "FINALIZADO";
    }

    public String mostrarResumen() {
        return "ProcesoElectoral{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipoEleccion=" + tipoEleccion +
                ", fecha='" + fecha + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}