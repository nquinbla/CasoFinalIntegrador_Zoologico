package Hábitats;

// [1] CLASE HÁBITAT ACUÁTICO
public class Hábitat_Acuático extends Hábitat{
    String tipodeagua;
    String tipodecoral;
    String tipodeplantas;

    // [2] CONSTRUCTOR
    public Hábitat_Acuático(String nombre, float temperatura, float humedad, boolean limpieza, String tamaño, String tipodeagua, String tipodecoral,String tipodeplantas) {
        super( nombre, temperatura, humedad, limpieza, tamaño);
        this.tipodeagua = tipodeagua;
        this.tipodecoral = tipodecoral;
        this.tipodeplantas = tipodeplantas;
    }

    // [3] MÉTODOS

    public String getTipodeagua() {
        return tipodeagua;
    }
    public void setTipodeagua(String tipodeagua) {
        this.tipodeagua = tipodeagua;
    }

    public String getTipodecoral() {
        return tipodecoral;
    }
    public void setTipodecoral(String tipodecoral) {
        this.tipodecoral = tipodecoral;
    }

    public String getTipodeplantas() {
        return tipodeplantas;
    }
    public void setTipodeplantas(String tipodeplantas) {
        this.tipodeplantas = tipodeplantas;
    }

    // [4] MÉTODO toString
    @Override
    public String toString() {
        return "Hábitat_Acuático{" +
                "temperatura=" + temperatura +
                ", humedad=" + humedad +
                ", tipodeagua='" + tipodeagua + '\'' +
                ", tipodecoral='" + tipodecoral + '\'' +
                ", tipodeplantas='" + tipodeplantas + '\'' +
                '}';
    }
}
