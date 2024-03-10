package MantenimientoSeguridad;

public class Reparación {
    private String id;
    private String descripcion;
    private String fechaProgramada;
    private String estado;
    private String urgencia;

    public Reparación(String id, String descripcion, String fechaProgramada, String estado, String urgencia) {
        this.id = id;
        this.descripcion = descripcion;
        this.fechaProgramada = fechaProgramada;
        this.estado = estado;
        this.urgencia = urgencia;
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

    public String getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
    }
}