public class ConteoSimple implements EstrategiaConteo {

    @Override
    public Candidato calcularGanador(Acta acta) {
        if (acta == null || acta.getResultados() == null || acta.getResultados().isEmpty()) {
            return null;
        }

        VotosCandidato mayor = null;

        for (VotosCandidato resultado : acta.getResultados()) {
            if (mayor == null || resultado.getVotos() > mayor.getVotos()) {
                mayor = resultado;
            }
        }

        return mayor.getCandidato();
    }
}
