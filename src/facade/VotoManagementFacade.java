package com.example.votaciones.entities;

import java.util.List;
import java.time.LocalDateTime;

public class VotoManagementFacade {
  private final VotoService votoService;

  public VotoManagementFacade (VotoService votoService) {
    this.votoService = votoService;
}

public Voto registerVoto(int idVoto, Candidato candidato, LocalDateTime fechaHora){
  if (idVoto == null){
    throw new IllegalArgumentException("El id es obligatorio.");
  }
  return VotoService.registerVoto(int idVoto, Candidato candidato, LocalDateTime fechaHora);
}
}

  
