package org.fis.grupo4;

public class Main {
    //Main
    public static void main(String[] args) {
        System.out.println("======================================================");
        System.out.println(" GRUPO 4: SIMULACIÓN - ELECCIONES LEGISLATIVAS 2026");
        System.out.println("======================================================\n");

        try {
        
            ProcesoElectoral elecciones = new ProcesoElectoral("PROC-01", "Elecciones 2026", "2026-03-08", "ACTIVO");
            elecciones.iniciarProceso();

            Candidato candidato1 = new Candidato("C-101", "Juan Perez", "Partido A", "01");
            Candidato candidato2 = new Candidato("C-102", "Maria Gomez", "Partido B", "02");


            Usuario votante1 = new Usuario("U-001", "Carlos Lopez", "100100", "carlos@mail.com");
            Usuario votante2 = new Usuario("U-002", "Ana Martinez", "200200", "ana@mail.com");
            
           
            Usuario votante3 = new Usuario("U-003", "Luis Fernandez", "", "luis@mail.com"); 

 
            SistemaVotacion sistemaVotacion = new SistemaVotacion();
            ResultadoElectoral resultados = new ResultadoElectoral();

            System.out.println("\n>>> INICIANDO JORNADA DE VOTACIÓN <<<\n");

            
            if (ValidadorSistema.puedeVotar(votante1, candidato1)) {
                Voto voto1 = new Voto("V-001", votante1, candidato1, "10:00 AM");
                sistemaVotacion.registrarVoto(voto1);
                resultados.sumarVoto(candidato1);
                System.out.println(" Voto registrado para: " + votante1.getNombre() + " (Votó por: " + candidato1.getNombre() + ")");
            }

            
            if (ValidadorSistema.puedeVotar(votante2, candidato2)) {
                Voto voto2 = new Voto("V-002", votante2, candidato2, "11:30 AM");
                sistemaVotacion.registrarVoto(voto2);
                resultados.sumarVoto(candidato2);
                System.out.println("✅ Voto registrado para: " + votante2.getNombre() + " (Votó por: " + candidato2.getNombre() + ")");
            }

            System.out.println("\n-- Procesando votante 3 --");
            if (ValidadorSistema.puedeVotar(votante3, candidato1)) {
                Voto voto3 = new Voto("V-003", votante3, candidato1, "12:15 PM");
                sistemaVotacion.registrarVoto(voto3);
                resultados.sumarVoto(candidato1);
            } else {
                System.out.println(" Operación denegada para " + votante3.getNombre() + ". Protegiendo integridad de la base de datos.");
            }


            System.out.println("\n>>> JORNADA FINALIZADA <<<\n");
            elecciones.cerrarProceso();
            
            ReporteResultados reporte = new ReporteResultados();
            reporte.generarReporte(resultados); 

        } catch (Exception e) {
            System.out.println(" Error crítico no controlado en la simulación: " + e.getMessage());
        }
    }
}