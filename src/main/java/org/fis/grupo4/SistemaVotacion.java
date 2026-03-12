import java.util.ArrayList;
import java.util.List;

/**
 * Sistema para la Gestión y Transparencia - Conjunto Las Margaritas (Perú).
 * Implementación de la lógica de votación virtual para la asamblea.
 */
public class SistemaVotacion {

    private List<String> padronElectoral; // Lista de DNIs autorizados
    private List<String> dnisQueYaVotaron; // Registro para evitar doble voto
    private List<Voto> urnaVirtual;

    public SistemaVotacion() {
        this.padronElectoral = new ArrayList<>();
        this.dnisQueYaVotaron = new ArrayList<>();
        this.urnaVirtual = new ArrayList<>();
    }

    /**
     * Procesa el voto validando el DNI contra el padrón y verificando que sea único.
     */
    public void registrarVoto(String dni, int opcionSeleccionada) {
        // 1. Validar que el DNI exista en el padrón
        if (!padronElectoral.contains(dni)) {
            System.out.println("Error: Documento no encontrado en el padrón del conjunto.");
            return;
        }

        // 2. Validar que no haya votado ya
        if (dnisQueYaVotaron.contains(dni)) {
            System.out.println("Error: El copropietario ya ha ejercido su derecho al voto.");
            return;
        }

        // 3. Registrar el voto y marcar el DNI como "usado"
        Voto nuevoVoto = new Voto(opcionSeleccionada);
        urnaVirtual.add(nuevoVoto);
        dnisQueYaVotaron.add(dni);
        
        System.out.println("Voto procesado exitosamente.");
    }

    public int getTotalVotos() {
        return urnaVirtual.size();
    }

    public void agregarDniAlPadron(String dni) {
        this.padronElectoral.add(dni);
    }
}

/**
 * Clase que representa el sufragio emitido.
 */
class Voto {
    private int opcionSeleccionada;
    private long marcaDeTiempo;

    public Voto(int opcionSeleccionada) {
        this.opcionSeleccionada = opcionSeleccionada;
        this.marcaDeTiempo = System.currentTimeMillis();
    }

    public int getOpcionSeleccionada() {
        return opcionSeleccionada;
    }

    public long getMarcaDeTiempo() {
        return marcaDeTiempo;
    }
}