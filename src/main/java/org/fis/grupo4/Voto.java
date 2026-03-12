/**
 * Clase que representa el sufragio emitido por un copropietario.
 * Registra la opción elegida y el momento de la votación para auditoría.
 */
public class Voto {
    private int opcionSeleccionada;
    private long marcaDeTiempo;

    /**
     * Constructor para la clase Voto.
     * @param opcionSeleccionada El ID de la lista o candidato de la asamblea.
     */
    public Voto(int opcionSeleccionada) {
        this.opcionSeleccionada = opcionSeleccionada;
        this.marcaDeTiempo = System.currentTimeMillis();
    }

    // Getters para que el Revisor Fiscal pueda analizar los resultados
    public int getOpcionSeleccionada() {
        return opcionSeleccionada;
    }

    public long getMarcaDeTiempo() {
        return marcaDeTiempo;
    }
}