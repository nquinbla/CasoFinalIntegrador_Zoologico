package MantenimientoSeguridad;

public class Sensor {
    private String id;
    private String ubicacion;
    private String estado;
    private Object numSerie;

    public Sensor() {
        this.id = id;
        this.ubicacion = ubicacion;
        this.estado = estado;
    }

    // getters y setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Object getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(Object numSerie) {
        this.numSerie = numSerie;
    }
}