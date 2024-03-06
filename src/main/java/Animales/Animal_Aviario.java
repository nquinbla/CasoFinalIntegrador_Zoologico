package Animales;

// [1] CLASE ANIMAL
public class Animal_Aviario extends Animal {
    // [2] ATRIBUTOS
    String volar; // volar
    String plumaje; // plumaje
    String pico; // pico

    // [3] CONSTRUCTORES
    // Constructor con todos los atributos
    public Animal_Aviario(String nombre, String edad, String sexo, String especie, String peso, String estatura, String color, boolean esterilizado, boolean vacunado, String volar, String plumaje, String pico) {
        super(nombre, edad, sexo, especie, peso, estatura, color, esterilizado, vacunado);
        this.volar = volar;
        this.plumaje = plumaje;
        this.pico = pico;
    }

    // [4] MÉTODOS (getters y setters) de los atributos
    // [4.1] Volar
    // Método para obtener si el animal aviario sabe volar
    public String getVolar() {
        return volar;
    }
    // Método para establecer si el animal aviario sabe volar
    public void setVolar(String volar) {
        this.volar = volar;
    }

    // [4.2] Plumaje
    // Método para obtener el tipo de plumaje del animal aviario
    public String getPlumaje() {
        return plumaje;
    }
    // Método para establecer el tipo de plumaje del animal aviario
    public void setPlumaje(String plumaje) {
        this.plumaje = plumaje;
    }

    // [4.3] Pico
    // Método para obtener el tipo de pico del animal aviario
    public String getPico() {
        return pico;
    }
    // Método para establecer el tipo de pico del animal aviario
    public void setPico(String pico) {
        this.pico = pico;
    }

    // [5] toString
    // Método para mostrar la información del animal aviario
    @Override
    public String toString() {
        return "Animal_Aviario{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", especie=" + especie + ", peso=" + peso + ", estatura=" + estatura + ", color=" + color + ", esterilizado=" + esterilizado + ", vacunado=" + vacunado + ", volar=" + volar + ", plumaje=" + plumaje + ", pico=" + pico + '}';
    }


}
