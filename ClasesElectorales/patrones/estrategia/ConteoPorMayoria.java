public class ConteoPorMayoria implements EstrategiaConteo {

    @Override
    public Candidato calcularGanador(Acta acta) {
        if (acta == null || acta.getResultados() == null || acta.getResultados().isEmpty()) {
            return null;
        }

        int totalVotos = 0;
        VotosCandidato mayor = null;

        for (VotosCandidato resultado : acta.getResultados()) {
            totalVotos += resultado.getVotos();

            if (mayor == null || resultado.getVotos() > mayor.getVotos()) {
                mayor = resultado;
            }
        }

        if (mayor != null && mayor.getVotos() > totalVotos / 2) {
            return mayor.getCandidato();
        }

        return null;
    }
}
