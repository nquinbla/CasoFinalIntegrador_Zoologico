package Animales;

// [1] CLASE ANIMAL TERRESTRE
public class Animal_Terrestre extends Animal{
    // [2] ATRIBUTOS
    String pelaje; // pelaje
    String patas; // patas

    // [3] CONSTRUCTORES
    // Constructor con todos los atributos
    public Animal_Terrestre(String nombre, String edad, String sexo, String especie, String peso, String estatura, String color, boolean esterilizado, boolean vacunado, String pelaje, String patas) {
        super(nombre, edad, sexo, especie, peso, estatura, color, esterilizado, vacunado);
        this.pelaje = pelaje;
        this.patas = patas;
    }

    // [4] MÉTODOS (getters y setters) de los atributos
    // [4.1] Pelaje
    // Método para obtener el tipo de pelaje del animal terrestre
    public String getPelaje() {
        return pelaje;
    }
    // Método para establecer el tipo de pelaje del animal terrestre
    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    // [4.2] Patas
    // Método para obtener el número de patas del animal terrestre
    public String getPatas() {
        return patas;
    }
    // Método para establecer el número de patas del animal terrestre
    public void setPatas(String patas) {
        this.patas = patas;
    }

    // [5] toString
    // Método para mostrar la información del animal terrestre
    @Override
    public String toString() {
        return "Animal_Terrestre{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", especie=" + especie + ", peso=" + peso + ", estatura=" + estatura + ", color=" + color + ", esterilizado=" + esterilizado + ", vacunado=" + vacunado + ", pelaje=" + pelaje + ", patas=" + patas + '}';
    }

}
