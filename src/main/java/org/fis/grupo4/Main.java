package org.fis.grupo4;

public class Main {
    public static void main(String[] args) {
        System.out.println("======================================================");
        System.out.println(" GRUPO 4: SIMULACIÓN - ELECCIONES LEGISLATIVAS 2026");
        System.out.println("======================================================\n");

        // 1. Configurar Proceso
        ProcesoElectoral elecciones = new ProcesoElectoral(1, "Elecciones Nacionales", TipoEleccion.LEGISLATIVA, "2026-03-08", "CREADO");
        elecciones.iniciarProceso();

        // 2. Crear Candidatos
        Candidato[] candidatos = new Candidato[] {
                // incluir opción de voto en blanco como candidato especial
                new Candidato("C-000", "Voto en Blanco", "Ninguno", 0),
                new Candidato("C-101", "Juan Perez", "Partido Liberal", 1),
                new Candidato("C-102", "Maria Gomez", "Partido Conservador", 2),
                new Candidato("C-103", "Luis Torres", "Partido Verde", 3),
                new Candidato("C-104", "Ana Ruiz", "Partido Social", 4)
        };

        // 3. Generar Votantes de prueba
        Usuario[] votantes = new Usuario[20];
        for (int i = 0; i < votantes.length; i++) {
            votantes[i] = new Usuario("U-" + String.format("%03d", i+1),
                    "Votante" + (i+1),
                    (i == 5 ? "" : "DNI" + (1000+i)),    // uno sin documento para validar
                    "user" + (i+1) + "@mail.com");
        }

        SistemaVotacion sistema = new SistemaVotacion();
        ResultadoElectoral resultados = new ResultadoElectoral();

        // 4. Simular Votación con Validaciones (votación anónima)
        java.util.List<String> votantesValidos = new java.util.ArrayList<>();
        for (Usuario v : votantes) {
            System.out.println("Procesando a: " + v.getNombre());
            // no se indica públicamente por quién vota el usuario
            Candidato elegido = candidatos[(int) (Math.random() * candidatos.length)];
            if (ValidadorSistema.puedeVotar(v, elegido)) {
                Voto nuevoVoto = new Voto("V-" + v.getId(), v, elegido, "10:00 AM");
                sistema.registrarVoto(nuevoVoto);
                resultados.sumarVoto(elegido);
                votantesValidos.add(v.getNombre());
                if ("Voto en Blanco".equals(elegido.getNombre())) {
                    System.out.println("✅ Voto en blanco registrado.");
                } else {
                    System.out.println("✅ Voto registrado anónimamente.");
                }
            }
        }

        // mostrar la lista de personas que emitieron voto sin revelar su selección
        System.out.println("\n--- LISTA DE VOTANTES VALIDADOS ---");
        votantesValidos.forEach(nombre -> System.out.println(nombre));

        // 5. Finalizar
        elecciones.cerrarProceso();
        resultados.mostrarResultados();
    }
}