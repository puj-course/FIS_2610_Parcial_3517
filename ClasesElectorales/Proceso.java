public class Proceso {

    private String tipoEleccion;
    private int dia;
    private int mes;
    private int anio;
    private String faseCalendarioElectoral;

    public Proceso() {
    }

    public String getTipoEleccion() {
        return tipoEleccion;
    }

    public void setTipoEleccion(String tipoEleccion) {
        this.tipoEleccion = tipoEleccion;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getFaseCalendarioElectoral() {
        return faseCalendarioElectoral;
    }

    public void setFaseCalendarioElectoral(String faseCalendarioElectoral) {
        this.faseCalendarioElectoral = faseCalendarioElectoral;
    }
}
