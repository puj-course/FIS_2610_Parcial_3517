//ResultadoElectoral.java
package org.fis.grupo1;
import java.util.ArrayList;
import java.util.List;

public class ResultadoElectoral implements Subject {

    private String candidato;
    private int votos;
    private int mesa;

    private List<Observer> observers;

    // Constructor
    public ResultadoElectoral(
            String candidato,
            int votos,
            int mesa
    ) {

        this.candidato = candidato;
        this.votos = votos;
        this.mesa = mesa;

        observers = new ArrayList<>();
    }

    // Registrar resultado
    public void registrarResultado() {

        System.out.println(
                "Resultado registrado correctamente"
        );

        notificarObservers();
    }

    @Override
    public void agregarObserver(
            Observer observer
    ) {

        observers.add(observer);
    }

    @Override
    public void eliminarObserver(
            Observer observer
    ) {

        observers.remove(observer);
    }

    @Override
    public void notificarObservers() {

        for (int i = 0; i < observers.size(); i++) {

            observers.get(i).actualizar(this);
        }
    }

    // Getters
    public String getCandidato() {
        return candidato;
    }

    public int getVotos() {
        return votos;
    }

    public int getMesa() {
        return mesa;
    }
}
