package Recursos;

public class Pedido {
    private String idPedido;
    private Recursos recurso;
    private int cantidad;
    private Proveedor proveedor;

    public Pedido(String idPedido, Recursos recurso, int cantidad, Proveedor proveedor) {
        this.idPedido = idPedido;
        this.recurso = recurso;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
    }

    // getters y setters
}