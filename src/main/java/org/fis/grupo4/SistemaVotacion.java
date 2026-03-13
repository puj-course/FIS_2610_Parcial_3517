import java.util.ArrayList;
import java.util.List;

public class SistemaVotacion {

    private List<String> padronElectoral;
    private List<String> dnisQueYaVotaron; 
    private List<Voto> urnaVirtual;

    public SistemaVotacion() {
        this.padronElectoral = new ArrayList<>();
        this.dnisQueYaVotaron = new ArrayList<>();
        this.urnaVirtual = new ArrayList<>();
    }

    public void registrarVoto(String dni, int opcionSeleccionada) {
   
        if (!padronElectoral.contains(dni)) {
            System.out.println("Error: Documento no encontrado en el padrón del conjunto.");
            return;
        }


        if (dnisQueYaVotaron.contains(dni)) {
            System.out.println("Error: El copropietario ya ha ejercido su derecho al voto.");
            return;
        }


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

//voto
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