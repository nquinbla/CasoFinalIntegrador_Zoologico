package Hábitats;

// [1] CLASE HÁBITAT AVIARIOS
public class Hábitat_Aviarios extends Hábitat{
    String tipodealimentacion;
    String tipodeclima;
    String tipodevegetacion;

    // [2] CONSTRUCTOR
    public Hábitat_Aviarios(float temperatura, float humedad, boolean limpieza, String tamaño,String tipodealimentacion, String tipodeclima, String tipodevegetacion) {
        super(temperatura, humedad, limpieza, tamaño);
        this.tipodealimentacion = tipodealimentacion;
        this.tipodeclima = tipodeclima;
        this.tipodevegetacion = tipodevegetacion;
    }

    // [3] MÉTODOS
    public String getTipodeaves() {
        return tipodeaves;
    }
    public void setTipodeaves(String tipodeaves) {
        this.tipodeaves = tipodeaves;
    }

    public String getTipodealimentacion() {
        return tipodealimentacion;
    }
    public void setTipodealimentacion(String tipodealimentacion) {
        this.tipodealimentacion = tipodealimentacion;
    }

    public String getTipodeclima() {
        return tipodeclima;
    }
    public void setTipodeclima(String tipodeclima) {
        this.tipodeclima = tipodeclima;
    }

    public String getTipodevegetacion() {
        return tipodevegetacion;
    }
    public void setTipodevegetacion(String tipodevegetacion) {
        this.tipodevegetacion = tipodevegetacion;
    }

    // [4] MÉTODO toString
    @Override
    public String toString() {
        return "Hábitat_Aviarios{" +
                "temperatura=" + temperatura +
                ", humedad=" + humedad +
                ", tipodeaves='" + tipodeaves + '\'' +
                ", tipodealimentacion='" + tipodealimentacion + '\'' +
                ", tipodeclima='" + tipodeclima + '\'' +
                ", tipodevegetacion='" + tipodevegetacion + '\'' +
                '}';
    }

}
