package InteracciónVisitante;

public class GuiaVirtual {
    public Tour crearTour(String tipoDeVisitante) {
        return new Tour(tipoDeVisitante);
    }
}