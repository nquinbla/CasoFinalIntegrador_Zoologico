package InteracciónVisitante;

import java.util.List;

public class Tour {
    private String tipoDeVisitante;
    private List<String> puntosDeInteres;

    public Tour(String tipoDeVisitante) {
        this.tipoDeVisitante = tipoDeVisitante;
        // Aquí se personalizaría la lista de puntos de interés en función del tipo de visitante
    }

    // getters y setters

    public String getTipoDeVisitante() {
        return tipoDeVisitante;
    }

    public void setTipoDeVisitante(String tipoDeVisitante) {
        this.tipoDeVisitante = tipoDeVisitante;
    }

    public List<String> getPuntosDeInteres() {
        return puntosDeInteres;
    }

    public void setPuntosDeInteres(List<String> puntosDeInteres) {
        this.puntosDeInteres = puntosDeInteres;
    }
}