package org.fis.grupo4;

import java.util.Vector;

public class ResultadoElectoral {

    private Vector<String> candidatos;
    private Vector<Integer> votos;

    public ResultadoElectoral() { 
        candidatos = new Vector<>();
        votos = new Vector<>();
    }

    public void agregarCandidato(String nombre) { 
        candidatos.add(nombre);
        votos.add(0);
    }

    public void sumarVoto(String nombre) { 

        for (int i = 0; i < candidatos.size(); i++) {

            if (candidatos.get(i).equals(nombre)) {

                int v = votos.get(i);
                votos.set(i, v + 1);

            }
        }

    }
}
