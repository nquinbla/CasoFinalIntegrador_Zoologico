package Hábitats;

// [1] CLASE HÁBITAT TERRESTRE
public class Hábitat_Terrestre extends Hábitat{
    String tipodevegetacion;
    String tipodeclima;
    String tipodesuelo;

    // [2] CONSTRUCTOR
    public Hábitat_Terrestre(float temperatura, float humedad, boolean limpieza, String tamaño, String tipodevegetacion, String tipodeclima, String tipodesuelo) {
        super(temperatura, humedad, limpieza, tamaño);
        this.tipodevegetacion = tipodevegetacion;
        this.tipodeclima = tipodeclima;
        this.tipodesuelo = tipodesuelo;
    }

    // [3] MÉTODOS
    public String getTipodevegetacion() {
        return tipodevegetacion;
    }
    public void setTipodevegetacion(String tipodevegetacion) {
        this.tipodevegetacion = tipodevegetacion;
    }

    public String getTipodeclima() {
        return tipodeclima;
    }
    public void setTipodeclima(String tipodeclima) {
        this.tipodeclima = tipodeclima;
    }

    public String getTipodesuelo() {
        return tipodesuelo;
    }
    public void setTipodesuelo(String tipodesuelo) {
        this.tipodesuelo = tipodesuelo;
    }

    // [4] MÉTODO toString
    @Override
    public String toString() {
        return "Hábitat_Terrestre{" +
                "temperatura=" + temperatura +
                ", humedad=" + humedad +
                ", tipodevegetacion='" + tipodevegetacion + '\'' +
                ", tipodeclima='" + tipodeclima + '\'' +
                ", tipodesuelo='" + tipodesuelo + '\'' +
                '}';
    }
}
