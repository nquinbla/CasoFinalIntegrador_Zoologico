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
}