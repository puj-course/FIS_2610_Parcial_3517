package org.fis;

public class Voto {

    public static void main(String[] args) {
        //Se declara el voto y el candidato 
        boolean yaVoto = false;
        String candidato = "Carlos";

        if(!yaVoto){ //si no ha votado, se registra el voto 
            System.out.println("Voto registrado por: " + candidato); //se registra el voto 
            yaVoto = true;
        } else {
            System.out.println("Error: ya votó"); //si ya voto saca error 
        }

    }
}
