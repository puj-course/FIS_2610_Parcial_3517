package com.example.votaciones.entities;

import java.time.LocalDateTime;

public class Voto {

    private int idVoto;
    private Copropietario copropietario;
    private Candidato candidato;
    private LocalDateTime fechaHora;

    public Voto() {
    }

    public Voto(int idVoto, Copropietario copropietario, Candidato candidato, LocalDateTime fechaHora) {
        this.idVoto = idVoto;
        this.copropietario = copropietario;
        this.candidato = candidato;
        this.fechaHora = fechaHora;
    }

    public void registrarVoto() {
        this.fechaHora = LocalDateTime.now();
    }

}
