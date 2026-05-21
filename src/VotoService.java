package com.example.votaciones.entities;

import java.util.List;
import java.time.LocalDateTime;

public class VotoService {
  
      public Voto registerVoto (int idVoto, Candidato candidato, LocalDateTime fechaHora) {

        Voto newVoto = new Voto();
        newVoto.setIdVoto(idVoto);
        newVoto.setCandidato(candidato);
        newVoto.setFechaHora(fechaHora);

        return votoRepository.save(newVoto);
    }
  
}
