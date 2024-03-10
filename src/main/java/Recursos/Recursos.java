package Recursos;

public class Recursos {
    private String nombre;
    private String tipo;
    private int cantidad;

    public Recursos(String name, String type, int quantity) {
        this.nombre = name;
        this.tipo = type;
        this.cantidad = quantity;
    }

    // getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}