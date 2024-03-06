package Animales;

// [1] CLASE CUIDADOS
public class Cuidados {
    String alimentacion; // alimentación
    String salud; // salud
    String comportamiento; // comportamiento

    // [2] CONSTRUCTORES
    // Constructor con todos los atributos
    public Cuidados(String alimentacion, String salud, String comportamiento) {
        this.alimentacion = alimentacion;
        this.salud = salud;
        this.comportamiento = comportamiento;
    }

    // [3] MÉTODOS (getters y setters) de los atributos
    // [3.1] Alimentación
    // Método para obtener la alimentación del animal
    public String getAlimentacion() {
        return alimentacion;
    }
    // Método para establecer la alimentación del animal
    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    // [3.2] Salud
    // Método para obtener la salud del animal
    public String getSalud() {
        return salud;
    }
    // Método para establecer la salud del animal
    public void setSalud(String salud) {
        this.salud = salud;
    }

    // [3.3] Comportamiento
    // Método para obtener el comportamiento del animal
    public String getComportamiento() {
        return comportamiento;
    }
    // Método para establecer el comportamiento del animal
    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }

    // [4] toString
    // Método para mostrar los atributos del animal
    @Override
    public String toString() {
        return "Cuidados{" +
                "alimentacion='" + alimentacion + '\'' +
                ", salud='" + salud + '\'' +
                ", comportamiento='" + comportamiento + '\'' +
                '}';
    }

}
