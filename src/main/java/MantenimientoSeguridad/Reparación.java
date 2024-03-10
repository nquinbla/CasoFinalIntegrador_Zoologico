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
}