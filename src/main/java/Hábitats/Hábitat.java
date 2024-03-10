package Hábitats;

// [1] CLASE HÁBITAT
public class Hábitat {
    private String nombre; // nombre del hábitat
    float temperatura; // temperatura del hábitat
    float humedad; // humedad del hábitat
    boolean limpieza; // limpieza del hábitat
    String tamaño; // tamaño del hábitat

    // [2] CONSTRUCTOR
    // Constructor con todos los atributos
    public Hábitat(String nombre, float temperatura, float humedad, boolean limpieza, String tamaño) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
        this.tamaño = tamaño;
    }

    // [3] MÉTODOS
    // Método para obtener el nombre del hábitat
    public String getNombre() {
        return nombre;
    }

    // Método para establecer el nombre del hábitat
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Método para obtener la temperatura del hábitat
    public float getTemperatura() {
        return temperatura;
    }
    // Método para establecer la temperatura del hábitat
    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    // Método para obtener la humedad del hábitat
    public float getHumedad() {
        return humedad;
    }
    // Método para establecer la humedad del hábitat
    public void setHumedad(float humedad) {
        this.humedad = humedad;
    }

    // Método para obtener la limpieza del hábitat
    public boolean getLimpieza() {
        return limpieza;
    }
    // Método para establecer la limpieza del hábitat
    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }

    // Método para obtener el tamaño del hábitat
    public String getTamaño() {
        return tamaño;
    }
    // Método para establecer el tamaño del hábitat
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    // [4] MÉTODO toString
    // Método para imprimir el hábitat
    @Override
    public String toString() {
        return "Hábitat{" +
                "nombre='" + nombre + '\'' +
                "temperatura=" + temperatura +
                ", humedad=" + humedad +
                ", limpieza=" + limpieza +
                ", tamaño='" + tamaño + '\'' +
                '}';
    }

}
