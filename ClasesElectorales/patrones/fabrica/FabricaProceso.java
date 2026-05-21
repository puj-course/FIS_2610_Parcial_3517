public class FabricaProceso {

    public Proceso crearProceso(TipoProceso tipo, int dia, int mes, int anio) {
        if (tipo == null) {
            throw new IllegalArgumentException("El tipo de proceso no puede ser nulo");
        }

        Proceso proceso = new Proceso();
        proceso.setTipoEleccion(nombreTipo(tipo));
        proceso.setDia(dia);
        proceso.setMes(mes);
        proceso.setAnio(anio);
        proceso.setFaseCalendarioElectoral("Preparacion");

        return proceso;
    }

    private String nombreTipo(TipoProceso tipo) {
        switch (tipo) {
            case PRESIDENCIAL:
                return "Eleccion presidencial";
            case LEGISLATIVO:
                return "Eleccion legislativa";
            case REGIONAL:
                return "Eleccion regional";
            default:
                return "Proceso electoral";
        }
    }
}
