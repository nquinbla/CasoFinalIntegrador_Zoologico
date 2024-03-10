package Recursos;

public class Order {
    private String orderID;
    private Recursos resource;
    private int quantity;
    private Supplier supplier;

    public Order(String orderID, Resource resource, int quantity, Supplier supplier) {
        this.orderID = orderID;
        this.resource = resource;
        this.quantity = quantity;
        this.supplier = supplier;
    }

    // getters and setters
}
