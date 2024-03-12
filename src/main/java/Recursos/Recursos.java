package Recursos;

public class Recursos {
    private String nombre;
    private String tipo;
    private int cantidad;

    public Recursos(String name) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    // getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}