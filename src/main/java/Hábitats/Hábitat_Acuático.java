package Hábitats;

// [1] CLASE HÁBITAT ACUÁTICO
public class Hábitat_Acuático extends Hábitat{
    String tipodeagua;
    String tipodecoral;
    String tipodepeces;
    String tipodeplantas;

    // [2] CONSTRUCTOR
    public Hábitat_Acuático(float temperatura, float humedad, boolean limpieza, String tamaño, String tipodeagua, String tipodecoral, String tipodepeces, String tipodeplantas) {
        super(temperatura, humedad, limpieza, tamaño);
        this.tipodeagua = tipodeagua;
        this.tipodecoral = tipodecoral;
        this.tipodepeces = tipodepeces;
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

    public String getTipodepeces() {
        return tipodepeces;
    }
    public void setTipodepeces(String tipodepeces) {
        this.tipodepeces = tipodepeces;
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
                ", tipodepeces='" + tipodepeces + '\'' +
                ", tipodeplantas='" + tipodeplantas + '\'' +
                '}';
    }
}
