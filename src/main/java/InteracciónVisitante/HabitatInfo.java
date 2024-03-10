package InteracciónVisitante;

public class HabitatInfo {
    private String nombreHabitat;
    private float temperatura;
    private float humedad;
    private boolean limpieza;
    private String tamaño;

    public HabitatInfo(String nombreHabitat, float temperatura, float humedad, boolean limpieza, String tamaño) {
        this.nombreHabitat = nombreHabitat;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
        this.tamaño = tamaño;
    }

    // getters y setters

    public String getNombreHabitat() {
        return nombreHabitat;
    }

    public void setNombreHabitat(String nombreHabitat) {
        this.nombreHabitat = nombreHabitat;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getHumedad() {
        return humedad;
    }

    public void setHumedad(float humedad) {
        this.humedad = humedad;
    }

    public boolean isLimpieza() {
        return limpieza;
    }

    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
}