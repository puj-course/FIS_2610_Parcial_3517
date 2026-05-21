class ValidacionRegistro {

    public boolean existeDocumento(ArrayList<Copropietario> lista, String documento) {
        for (Copropietario c : lista) {
            if (c.documento.equals(documento)) {
                return true;
            }
        }
        return false;
    }
}