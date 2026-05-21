package org.fis.grupo4.facade;

import java.util.ArrayList;
import java.util.List;

import org.fis.grupo4.Candidato; // para commit
import org.fis.grupo4.ResultadoElectoral;
import org.fis.grupo4.SistemaVotacion;
import org.fis.grupo4.Usuario;
import org.fis.grupo4.ValidadorSistema;
import org.fis.grupo4.Voto;
import org.fis.grupo4.observer.observadorelectorakl;

public class sistemaelectoralfacadee {
    private SistemaVotacion sistemaVotacion;
    private ResultadoElectoral resultadoElectoral;
    private List<observadorelectorakl> observadores;

    public sistemaelectoralfacadee() {
        this.sistemaVotacion = new SistemaVotacion();
        this.resultadoElectoral = new ResultadoElectoral();
        this.observadores = new ArrayList<>();
    }

    public void agregarObservador(observadorelectorakl observador) {
        if (observador != null) {
            observadores.add(observador);
        }
    }

    public boolean registrarVoto(String idVoto, Usuario usuario, Candidato candidato, String hora) {
        if (!ValidadorSistema.puedeVotar(usuario, candidato)) {
            notificar("Voto rechazado.");
            return false;
        }

        int totalAntes = sistemaVotacion.getTotalVotos();
        sistemaVotacion.registrarVoto(new Voto(idVoto, usuario, candidato, hora));

        if (sistemaVotacion.getTotalVotos() == totalAntes) {
            notificar("Voto rechazado.");
            return false;
        }

        resultadoElectoral.sumarVoto(candidato);
        notificar("Voto registrado.");
        return true;
    }

    public int getTotalVotos() {
        return sistemaVotacion.getTotalVotos();
    }

    public void mostrarResultados() {
        resultadoElectoral.mostrarResultados();
    }

    private void notificar(String mensaje) {
        for (observadorelectorakl observador : observadores) {
            observador.actualizar(mensaje);
        }
    }
}
