package MantenimientoSeguridad;

public class Mantenimiento {
    private String id;
    private String descripcion;
    private String fechaProgramada;
    private String estado;

    public Mantenimiento(String id, String descripcion, String fechaProgramada, String estado) {
        this.id = id;
        this.descripcion = descripcion;
        this.fechaProgramada = fechaProgramada;
        this.estado = estado;
    }

    // getters y setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaProgramada() {
        return fechaProgramada;
    }

    public void setFechaProgramada(String fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


}