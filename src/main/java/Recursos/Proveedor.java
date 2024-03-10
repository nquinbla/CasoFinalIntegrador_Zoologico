package Recursos;

import Recursos.Recursos;

import java.util.List;

public class Proveedor {
    private String nombre;
    private String informacionContacto;
    private List<Recursos> suministros;

    public Proveedor(String nombre, String informacionContacto, List<Recursos> suministros) {
        this.nombre = nombre;
        this.informacionContacto = informacionContacto;
        this.suministros = suministros;
    }

    // getters y setters
}