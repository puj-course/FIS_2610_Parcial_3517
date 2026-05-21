package com.creacional.factory;


interface EleccionFactory {
    Eleccion crearEleccion(String nombre, String fecha);
}


class EleccionLegislativaFactory implements EleccionFactory {

    private final String camara;
    private final int curules;

    public EleccionLegislativaFactory(String camara, int curules) {
        this.camara = camara;
        this.curules = curules;}

    @Override
    public Eleccion crearEleccion(String nombre, String fecha) {
        EleccionLegislativa eleccion = new EleccionLegislativa();
      eleccion.setNombre(nombre);
        eleccion.setFecha(fecha);
    eleccion.setTipoEleccion("LEGISLATIVA");
        eleccion.setEstado("PLANEADA");
      eleccion.setCamara(camara);
   eleccion.setCurules(curules);
        return eleccion; }
}

class ConsultaPopularFactory implements EleccionFactory {

    private final String pregunta;
   private final String nivelTerritorial;

    public ConsultaPopularFactory(String pregunta, String nivelTerritorial) {
        this.pregunta = pregunta;
       this.nivelTerritorial = nivelTerritorial;
    }

    @Override
    public Eleccion crearEleccion(String nombre, String fecha) {
     ConsultaPopular consulta = new ConsultaPopular();
        consulta.setNombre(nombre);
    consulta.setFecha(fecha)
       consulta.setTipoEleccion("CONSULTA_POPULAR");
    consulta.setEstado("PLANEADA");
        consulta.setPregunta(pregunta);
    consulta.setNivelTerritorial(nivelTerritorial);
        return consulta;
    }
}

